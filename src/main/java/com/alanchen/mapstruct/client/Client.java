package com.alanchen.mapstruct.client;

import com.alanchen.mapstruct.convert.UserConvert;
import com.alanchen.mapstruct.entity.User;
import com.alanchen.mapstruct.vo.UserVO;
import java.util.Date;

/**
 * @author Alan Chen
 * @description
 * @date 2021/11/22
 */
public class Client {

    public static void main(String[] args) {
        poToVO();

        System.out.println();

        voTOPo();
    }

    private static void poToVO(){
        User user = User.builder()
                .id(1)
                .name("AlanChen")
                .age(18)
                .sex("1")
                .stop(false)
                .birthday(new Date())
                .build();
        System.out.println("user:"+user);

        UserVO userVO = UserConvert.instance.toVO(user);
        System.out.println("userVO:"+userVO);
    }

    private static void voTOPo(){
        UserVO userVO = UserVO.builder()
                .id(1)
                .userName("AlanChen")
                .age(18)
                .sex("1")
                .stop("停用")
                .birthday("1990-05-20")
                .build();
        System.out.println("userVO:"+userVO);

        User user = UserConvert.instance.toEntity(userVO);
        System.out.println("user:"+user);
    }
}
