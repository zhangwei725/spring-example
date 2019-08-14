package com.vip.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 *
 *     <dependency>
 *       <groupId>org.aspectj</groupId >
 *       <artifactId>aspectjweaver</artifactId >
 *       <version> 1.8.7</version >
 *     </dependency>
 *    xml   注解
 * 第一步 定义切面类
 * 如果是注解方式 需要在配置文件中开启对aspectj支持
 * <!--         开启支持 aop 注解代理  表示默认使用cglib代理-->
 * <aop:aspectj-autoproxy proxy-target-class="true"/>
 */
// 注册到spring
@Component
// 声明是切面类
@Aspect
public class AuthAspects {
    //  定义切入点  不要使用私有的  不能有返回值

    /**
     * value  表示切入点表达式
     *
     *
     * argsName  表示核心的的参数
     */
    @Pointcut("execution(* com.vip.spring.aop.AopController.login(..))")
    public void  authPointcut(){

    }

//    前置通知
    @Before("authPointcut()")
//    public  void before(){
//        System.out.println("1. 前置通知");
//    }

//    后置通知
    /**
     * value  表示切入点方法  或者注解切入点表达式
     * pointcut  如果指定了该参数 将会覆盖
     * returning  获取修饰方法的返回值
     */
//    @AfterReturning("authPointcut()")
//    public  void  after(){
//        System.out.println("3.后置通知");
//    }

       /**
        * 只有当核心方法抛出异常并且没有处理 才会触发异常通知
        *
        * throwing
        */
//    @AfterThrowing(value = "authPointcut()",throwing = "exception")
//    public  void  afterThrow(Exception  exception){
//        //  错误日志的处理
//        System.out.println("异常通知");
//        System.out.println(exception.getMessage());
//    }



    @Around(value = "authPointcut()")
    public  Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
//        执行核心(不掉下面这个代码我们的核心方法不执行)
        Object obj = joinPoint.proceed();

        System.out.println("环绕后");
        return obj;
    }

}
