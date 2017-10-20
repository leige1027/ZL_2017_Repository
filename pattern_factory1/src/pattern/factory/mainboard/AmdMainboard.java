/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.factory.mainboard;

import pattern.factory.mainboard.Mainboard;

/**
 *
 * @author zl
 * @date 2017-10-17 8:38:17 创建日期 版本 描述
 */
public class AmdMainboard implements Mainboard {

    /**
     * CPU插槽的孔数
     */
    private int cpuHoles = 0;

    /**
     * 构造方法，传入CPU插槽的孔数
     *
     * @param cpuHoles
     */
    public AmdMainboard(int cpuHoles) {
        
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        
        System.out.println("AMD主板的CPU插槽孔数是：" + cpuHoles);
    }

}
