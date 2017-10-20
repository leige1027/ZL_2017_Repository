/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.normal_factory;

import pattern.factory.cpu.IntelCpu;
import pattern.factory.cpu.Cpu;
import pattern.factory.cpu.AmdCpu;

/**
 * CPU与主板工厂类
 *
 * @author zl
 * @date 2017-10-17 8:40:38 创建日期 版本 描述
 */
public class CpuFactory {

    public static Cpu createCpu(int type) {

        Cpu cpu = null;

        if (type == 1) {
            cpu = new IntelCpu(755);
        } else if (type == 2) {
            cpu = new AmdCpu(938);
        }

        return cpu;
    }

}
