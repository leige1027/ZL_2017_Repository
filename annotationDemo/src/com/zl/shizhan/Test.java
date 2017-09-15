package com.zl.shizhan;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

public class Test {
	
	public static void main(String[] args) {
		
		// ��ѯidΪ10���û�
		Filter f1 = new Filter();
		f1.setId(10); 
		
		// ģ����ѯ�û���ΪС�����û�
		Filter f2 = new Filter();
		f2.setUserName("С��"); 
		
		// ��ѯ����Ϊ��������һ�����û�
		Filter f3 = new Filter();
		f3.setEmail("liu@sina.com,zh@163.com,77777@qq.com");
		
		// ����query(f)����
		String sql1 = query(f1);
		String sql2 = query(f2);
		String sql3 = query(f3);
		
		System.out.println(sql1);
		System.out.println(sql2);
		System.out.println(sql3);
		
	}

	/**
	 * ���ݴ�����󣬻�ȡ��Ӧsql���
	 * @param f
	 * @return
	 */
	private static String query(Filter f) {
		// �ɱ��ַ�������ƴ��sql
		StringBuilder sb =new StringBuilder();
		/*
		 *  1.��ȡ��class
		 */
		Class c = f.getClass();
		/*
		 *  2.����ȡ��ע���ֵ������ȡtable������
		 */
		boolean exists = c.isAnnotationPresent(Table.class);
		if(!exists){
			return null;
		}
		Table t = (Table) c.getAnnotation(Table.class);
		String tableName = t.value();
		// ���ݱ�����ƴ�ӵ�һ��sql
		sb.append("select * from ").append(tableName).append(" where 1=1 ");
		/*
		 *  3.���������ֶ�
		 */
		Field[] fArray = c.getDeclaredFields();
		for (Field field : fArray) {
			/*
			 *  4.0.����ÿ���ֶζ�Ӧ��sql
			 */
			// 4.1.�õ��ֶ�����(�������ϸ���ע��ֵ)
			boolean fExist = field.isAnnotationPresent(Column.class);
			if(!fExist){
				continue;
			}
			Column column = field.getAnnotation(Column.class);
			String columnName = column.value();
			// 4.2.�õ��ֶ�ֵ,(��������)
			String fieldName = field.getName();
			// ������������ƴ�ӷ�����
			String getMethodName = "get"+
			    fieldName.substring(0,1).toUpperCase()+
			    fieldName.substring(1);
			// ����������Ե�get�������������ֵ
			Object fieldValue = null;
			try {
				 // ���ݷ�������÷�����������get�����޲���
				Method getMethod = c.getMethod(getMethodName);
				 // ʹ�÷�����÷������������ֵ
				fieldValue = getMethod.invoke(f);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// 4.3.ƴװsql
			 // �пգ�
			 if(fieldValue==null||
					 (fieldValue instanceof Integer&&(Integer)fieldValue==0)){
				 continue;
			 }
			 sb.append(" and ").append(fieldName);
			 /*
			  * �ж���������ΪString����,ƴ��sql
			  */
			 if(fieldValue instanceof String){
				 // ��Object���� ����ֵ ת����String ����
				 String fv = (String) fieldValue;
				 /*
				  * �ж�����ֵ�Ƿ����"," --(���������","����)
				  */
				 if(fv.contains(",")){
					 // �ַ��� ���� ����Ÿ������ַ���
					 String[] values = fv.split(",");
					 // ƾ��in����sql
					 sb.append(" in (");
					 for (String v : values) {
						sb.append("'").append(v).append("'").append(",");
					}
					 // ȥ�����һ������
					 sb.deleteCharAt(sb.length()-1);
					 sb.append(");");
				 }else {
					 /*
					  * ���������ŵĵ�һ�ַ�����ƴ��sql
					  */
					 sb.append("=").append("'"+fieldValue+"';");
				 }
			 }else if(fieldValue instanceof Integer){
				 /*
				  * �ж���������ΪInteger���ͣ�ƴ��sql
				  */
				 sb.append("=").append(fieldValue+";");
			 }
		}
		
		return sb.toString();
	}
	
	
	
}
