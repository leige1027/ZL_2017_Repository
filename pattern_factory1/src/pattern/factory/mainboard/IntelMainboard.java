/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.factory.mainboard;

/**
 *
 * @author zl
 * @date 2017-10-17 8:34:23 创建日期 版本 描述
 */
public class IntelMainboard implements Mainboard {

    /**
     * CPU插槽的孔数
     */
    private int cpuHoles = 0;

    /**
     * 构造方法，传入CPU插槽的孔数
     *
     * @param cpuHoles
     */
    public IntelMainboard(int cpuHoles) {

        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {

        System.out.println("Intel主板的CPU插槽孔数是：" + cpuHoles);
    }

}
