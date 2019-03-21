package com.example.demo;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
@Setter
@ToString
public class ListToMap {
    public static void main(String[] args) {
        List<MapTestUser> userList = new ArrayList<>();
        MapTestUser user = new MapTestUser();
        user.setId(1L);
        user.setName("11");

        MapTestUser user1 = new MapTestUser();
        user1.setId(2L);
        user1.setName("12");

        MapTestUser user2 = new MapTestUser();
        user2.setId(2L);
        user2.setName("13");

        userList.add(user);
        userList.add(user1);
        userList.add(user2);


//        将list转map   ---   方式一： for循环遍历
        Map<Long,MapTestUser> maps = new HashMap();
        for (MapTestUser testUser : userList){
            maps.put(testUser.getId(),testUser);
        }
        System.out.println("输出maps:");
        System.out.println(maps);


//        使用stream()流来处理
        Map<Long,MapTestUser> map1 =  userList.stream().collect(Collectors.toMap(MapTestUser :: getId, Function.identity(),(key1,key2) ->key2));
        System.out.println("输出map1:");
        System.out.println(map1);

    }


}

