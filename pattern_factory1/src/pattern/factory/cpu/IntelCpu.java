/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.factory.cpu;

import pattern.factory.cpu.Cpu;

/**
 *
 * @author zl
 * @date 2017-10-17 8:28:25 创建日期 版本 描述
 */
public class IntelCpu implements Cpu {

    /**
     * CPU的针脚数
     */
    private int pins = 0;

    public IntelCpu(int pins) {

        this.pins = pins;
    }

    @Override
    public void calculate() {

        System.out.println("Intel CPU的针脚数：" + pins);
    }

}
