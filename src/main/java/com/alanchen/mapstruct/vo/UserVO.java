package com.alanchen.mapstruct.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Alan Chen
 * @description
 * @date 2021/11/22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserVO {

    private Integer id;

    /**
     * User的属性是name
     */
    private String userName;

    private Integer age;

    private String sex;

    private String stop;

    private String birthday;
}
