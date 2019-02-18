package StructuralTypeDPDemos.FlyweightPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @Description: 享元模式,分开来解释就是共享元器件,也就是复用已经生产的对象
* @Author: xjp
* @Date: 2019/2/18 
*/ 

public class App {
    public static void main(String[] args) {
        Map<String, User> maps = new HashMap<>();
        User haha = maps.get("haha");
        if (haha == null) {
            haha = new User("haha");
            maps.put("haha", haha);
        }


    }
}
