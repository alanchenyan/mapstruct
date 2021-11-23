package com.alanchen.mapstruct.vo;

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
public class SkuVO {

    private Long skuId;

    private String skuCode;

    private Integer skuPrice;

    private Long itemId;

    private String itemName;
}
