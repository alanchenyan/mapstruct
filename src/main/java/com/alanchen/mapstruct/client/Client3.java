package com.alanchen.mapstruct.client;

import com.alanchen.mapstruct.convert.UserConvert;
import com.alanchen.mapstruct.entity.User;
import com.alanchen.mapstruct.vo.UserVO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alan Chen
 * @description
 * @date 2021/11/22
 */
public class Client3 {

    public static void main(String[] args) {
        toList();
    }
    private static void toList(){
        List<User> userList = new ArrayList<User>();

        User user1 = User.builder()
                .id(1)
                .name("AlanChen")
                .age(18)
                .sex("1")
                .build();
        userList.add(user1);

        User user2 = User.builder()
                .id(2)
                .name("AlanChen2")
                .age(20)
                .sex("0")
                .build();
        userList.add(user2);

        List<UserVO> userVOList = UserConvert.instance.toVOList(userList);
        System.out.println("userVOList:"+userVOList);
    }
}
