package com.alanchen.mapstruct.convert;

import com.alanchen.mapstruct.entity.Item;
import com.alanchen.mapstruct.entity.Sku;
import com.alanchen.mapstruct.vo.SkuVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author Alan Chen
 * @description
 * @date 2021/11/23
 */
@Mapper
public interface ItemConvert {

    ItemConvert instance = Mappers.getMapper(ItemConvert.class);

    @Mappings({
            @Mapping(source = "sku.id",target = "skuId"),
            @Mapping(source = "sku.code",target = "skuCode"),
            @Mapping(source = "sku.price",target = "skuPrice"),
            @Mapping(source = "item.id",target = "itemId"),
            @Mapping(source = "item.title",target = "itemName")

    })

    SkuVO toVO(Item item, Sku sku);
}
