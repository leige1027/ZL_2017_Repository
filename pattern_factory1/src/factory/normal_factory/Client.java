/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.normal_factory;

import factory.normal_factory.ComputerEngineer;

/**
 * 客户类
 *
 * @author zl
 * @date 2017-10-17 8:47:55 创建日期 版本 描述
 */
public class Client {

    public static void main(String[] args) {
        ComputerEngineer cf = new ComputerEngineer();
        cf.makeComputer(1, 1);
    }

}
