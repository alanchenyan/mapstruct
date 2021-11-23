package com.alanchen.mapstruct.convert;

/**
 * @author Alan Chen
 * @description
 * @date 2021/11/22
 */
public class UserTransform {

    public String booleanToString(boolean value){
        if(value){
            return "停用";
        }
        return "未停用";
    }
    public boolean strToBoolean(String str){
        if ("停用".equals(str)) {
            return true;
        }
        return false;
    }
}
