/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.abstract_factory;

import pattern.factory.cpu.Cpu;
import pattern.factory.mainboard.Mainboard;

/**
 * 抽象工厂类
 *
 * @author zl
 */
public interface AbstractFactory {

    /**
     * 创建CPU对象
     *
     * @return CPU对象
     */
    public Cpu createCpu();

    /**
     * 创建主板对象
     *
     * @return 主板对象
     */
    public Mainboard createMainboard();

}
