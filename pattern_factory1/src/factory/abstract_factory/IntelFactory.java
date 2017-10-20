/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.abstract_factory;

import pattern.factory.cpu.Cpu;
import pattern.factory.cpu.IntelCpu;
import pattern.factory.mainboard.IntelMainboard;
import pattern.factory.mainboard.Mainboard;

/**
 *
 * @author zl
 * @date 2017-10-17 9:19:17 创建日期 版本 描述
 */
public class IntelFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        return new IntelCpu(755);
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard(755);
    }

}
