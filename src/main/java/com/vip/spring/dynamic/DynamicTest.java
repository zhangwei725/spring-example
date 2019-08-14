package com.vip.spring.dynamic;


import com.vip.spring.proxy.service.UserService;
import com.vip.spring.proxy.service.UserServiceImpl;
//   delete
public class DynamicTest {
    public static void main(String[] args) {
        DanamicProxyDemo proxy = new DanamicProxyDemo();
        ShopService service = (ShopService) proxy.newInstance(new ShopServiceImpl());
        service.save();
        UserService userService = (UserService) proxy.newInstance(new UserServiceImpl());
        userService.save();


    }

}
