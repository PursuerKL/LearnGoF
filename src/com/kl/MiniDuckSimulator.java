/**
* @Title: MiniDuckSimulator.java
* @Package com.kl
* @Description: TODO(用一句话描述该文件做什么)
* @author: PursuerKL
* @date: 2018年10月23日
* @version V1.0
*/

package com.kl;

/**
* @ClassName: MiniDuckSimulator
* @Description: TODO(这里用一句话描述这个类的作用)
* @author: PursuerKL
* @date: 2018年10月23日
*
*/

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}
