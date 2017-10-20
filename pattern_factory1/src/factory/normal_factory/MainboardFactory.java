/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.normal_factory;

import pattern.factory.mainboard.AmdMainboard;
import pattern.factory.mainboard.Mainboard;
import pattern.factory.mainboard.IntelMainboard;

/**
 * 主板工厂类
 *
 * @author zl
 * @date 2017-10-17 8:42:00 创建日期 版本 描述
 */
public class MainboardFactory {

    public static Mainboard createMainboard(int type) {

        Mainboard mainboard = null;

        if (type == 1) {
            mainboard = new IntelMainboard(755);
        } else if (type == 2) {
            mainboard = new AmdMainboard(938);
        }

        return mainboard;
    }

}
