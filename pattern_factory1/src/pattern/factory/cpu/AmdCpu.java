/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.factory.cpu;

/**
 *
 * @author zl
 * @date 2017-10-17 8:31:07 创建日期 版本 描述
 */
public class AmdCpu implements Cpu {

    /**
     * CPU的针脚数
     */
    private int pins = 0;

    public AmdCpu(int pins) {

        this.pins = pins;
    }

    @Override
    public void calculate() {

        System.out.println("AMD CPU的针脚数：" + pins);
    }

}
