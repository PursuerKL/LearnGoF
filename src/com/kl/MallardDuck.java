/**
* @Title: MallardDuck.java
* @Package com.kl
* @Description: TODO(用一句话描述该文件做什么)
* @author: PursuerKL
* @date: 2018年10月23日
* @version V1.0
*/

package com.kl;

/**
* @ClassName: MallardDuck
* @Description: TODO(这里用一句话描述这个类的作用)
* @author: PursuerKL
* @date: 2018年10月23日
*
*/

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    /* (非 Javadoc)
    * <p>Title: display</p>
    * <p>Description: </p>
    * @see com.kl.Duck#display()
    */
    
    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("I'm a realMallard Duck");
    }
}
