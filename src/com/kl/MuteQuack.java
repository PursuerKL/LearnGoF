/**
* @Title: MuteQuack.java
* @Package com.kl
* @Description: TODO(用一句话描述该文件做什么)
* @author: PursuerKL
* @date: 2018年10月23日
* @version V1.0
*/

package com.kl;

/**
* @ClassName: MuteQuack
* @Description: TODO(这里用一句话描述这个类的作用)
* @author: PursuerKL
* @date: 2018年10月23日
*
*/

public class MuteQuack implements QuackBehavior {

    /* (非 Javadoc)
    * <p>Title: quack</p>
    * <p>Description: </p>
    * @see com.kl.QuackBehavior#quack()
    */

    @Override
    public void quack() {
        // TODO Auto-generated method stub
        System.out.println("<<silence>>");
    }

}
