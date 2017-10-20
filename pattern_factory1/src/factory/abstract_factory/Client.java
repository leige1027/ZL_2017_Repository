/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.abstract_factory;

/**
 *
 * @author zl
 * @date 2017-10-17 9:25:45 创建日期 版本 描述
 */
public class Client {

    public static void main(String[] args) {
        //创建装机工程师对象
        ComputerEngineer cf = new ComputerEngineer();
        //客户选择并创建需要使用的产品对象!!
        AbstractFactory af = new IntelFactory();
//      AbstractFactory af1 = new AmdFactory();
        //告诉装机工程师自己选择的产品，让装机工程师组装电脑
        cf.makeComputer(af);
    }
}
