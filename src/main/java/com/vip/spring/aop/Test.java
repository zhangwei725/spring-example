package com.vip.spring.aop;

/**
 * 日志
 * @author zhangwei
 * 前置通知,不管怎么样都会执行核心方法
 * 环绕通知,可以根据业务需求选择执行核心方法或者不执行
 *
 *
 */
public class Test {

    public void  before(){
        System.out.println("1前置通知");
    }


    public void  method(){
        System.out.println("2.环绕前");
        System.out.println("3.核心方法");
        System.out.println("4.环绕后");
    }

    public  void  after(){
        System.out.println("5.后置通知");
    }

    public  void  afterThrow(Exception ex){
        System.out.println("4.异常通知");
    }


    public void  finallyMethod(){
        System.out.println("6.最终通知");
    }


    public static void main(String[] args) {
        Test test = new Test();
        test.before();
        try {
            test.method();
            test.after();
        }catch (Exception ex){
            test.afterThrow(ex);
        }finally {
            test.finallyMethod();
        }


    }

}
