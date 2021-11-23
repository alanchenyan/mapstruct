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
public class Item {

    private Long id;

    private String title;
}
