package com.alanchen.mapstruct.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Alan Chen
 * @description
 * @date 2021/11/23
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Sku {

    private String code;

    private Integer price;
}
