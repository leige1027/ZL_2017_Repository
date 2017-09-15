package com.zl.shizhan;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

public class Test {
	
	public static void main(String[] args) {
		
		// 查询id为10的用户
		Filter f1 = new Filter();
		f1.setId(10); 
		
		// 模糊查询用户名为小明的用户
		Filter f2 = new Filter();
		f2.setUserName("小明"); 
		
		// 查询邮箱为其中任意一个的用户
		Filter f3 = new Filter();
		f3.setEmail("liu@sina.com,zh@163.com,77777@qq.com");
		
		// 调用query(f)方法
		String sql1 = query(f1);
		String sql2 = query(f2);
		String sql3 = query(f3);
		
		System.out.println(sql1);
		System.out.println(sql2);
		System.out.println(sql3);
		
	}

	/**
	 * 根据传入对象，获取相应sql语句
	 * @param f
	 * @return
	 */
	private static String query(Filter f) {
		// 可变字符串用于拼接sql
		StringBuilder sb =new StringBuilder();
		/*
		 *  1.获取到class
		 */
		Class c = f.getClass();
		/*
		 *  2.反射取得注解的值，即获取table得名字
		 */
		boolean exists = c.isAnnotationPresent(Table.class);
		if(!exists){
			return null;
		}
		Table t = (Table) c.getAnnotation(Table.class);
		String tableName = t.value();
		// 根据表名，拼接第一段sql
		sb.append("select * from ").append(tableName).append(" where 1=1 ");
		/*
		 *  3.遍历所有字段
		 */
		Field[] fArray = c.getDeclaredFields();
		for (Field field : fArray) {
			/*
			 *  4.0.处理每个字段对应的sql
			 */
			// 4.1.拿到字段名，(即属性上赋得注解值)
			boolean fExist = field.isAnnotationPresent(Column.class);
			if(!fExist){
				continue;
			}
			Column column = field.getAnnotation(Column.class);
			String columnName = column.value();
			// 4.2.拿到字段值,(即属性名)
			String fieldName = field.getName();
			// 根据属性名，拼接方法名
			String getMethodName = "get"+
			    fieldName.substring(0,1).toUpperCase()+
			    fieldName.substring(1);
			// 反射调用属性的get方法，获得属性值
			Object fieldValue = null;
			try {
				 // 根据方法名获得方法对象，属性get方法无参数
				Method getMethod = c.getMethod(getMethodName);
				 // 使用反射调用方法，获得属性值
				fieldValue = getMethod.invoke(f);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// 4.3.拼装sql
			 // 判空！
			 if(fieldValue==null||
					 (fieldValue instanceof Integer&&(Integer)fieldValue==0)){
				 continue;
			 }
			 sb.append(" and ").append(fieldName);
			 /*
			  * 判断属性类型为String类型,拼接sql
			  */
			 if(fieldValue instanceof String){
				 // 将Object类型 属性值 转换成String 类型
				 String fv = (String) fieldValue;
				 /*
				  * 判断属性值是否包含"," --(多个邮箱用","隔开)
				  */
				 if(fv.contains(",")){
					 // 字符串 数组 ，存放各部分字符串
					 String[] values = fv.split(",");
					 // 凭借in条件sql
					 sb.append(" in (");
					 for (String v : values) {
						sb.append("'").append(v).append("'").append(",");
					}
					 // 去除最后一个逗号
					 sb.deleteCharAt(sb.length()-1);
					 sb.append(");");
				 }else {
					 /*
					  * 不包含逗号的单一字符串，拼接sql
					  */
					 sb.append("=").append("'"+fieldValue+"';");
				 }
			 }else if(fieldValue instanceof Integer){
				 /*
				  * 判断属性类型为Integer类型，拼接sql
				  */
				 sb.append("=").append(fieldValue+";");
			 }
		}
		
		return sb.toString();
	}
	
	
	
}
