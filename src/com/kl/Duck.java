/**
* @Title: Duck.java
* @Package com.kl
* @Description: TODO(用一句话描述该文件做什么)
* @author: PursuerKL
* @date: 2018年10月23日
* @version V1.0
*/

package com.kl;

/**
* @ClassName: Duck
* @Description: TODO(这里用一句话描述这个类的作用)
* @author: PursuerKL
* @date: 2018年10月23日
*
*/

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck() {
    }
    public abstract void display();
    
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    
    public void swim() {
        System.out.println("All ducks float");
    }
    
}
