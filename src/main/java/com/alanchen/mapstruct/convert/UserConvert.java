package com.alanchen.mapstruct.convert;

import com.alanchen.mapstruct.entity.User;
import com.alanchen.mapstruct.vo.UserVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @Mapper 定义这是一个MapStruct对象属性转换接口，在这个类里面规定转换规则
 *          在项目构建时，会自动生成改接口的实现类，这个实现类将实现对象属性值复制
 */
@Mapper(uses = UserTransform.class)
public interface UserConvert {

    /**
     * 获取该类自动生成的实现类的实例
     * 接口中的属性都是 public static final 的 方法都是public abstract的
     */
    UserConvert instance = Mappers.getMapper(UserConvert.class);

    /**
     * 这个方法就是用于实现对象属性复制的方法
     *
     * @Mapping 用来定义属性复制规则 source 指定源对象属性 target指定目标对象属性
     *
     * @param user 这个参数就是源对象，也就是需要被复制的对象
     * @return 返回的是目标对象，就是最终的结果对象
     */
    @Mappings({@Mapping(source = "name",target = "userName"),
            @Mapping(source = "birthday",target = "birthday",dateFormat = "yyyy-MM-dd")})
    UserVO toVO(User user);

    @Mappings({@Mapping(source = "userName",target = "name"),
            @Mapping(source = "birthday",target = "birthday",dateFormat = "yyyy-MM-dd")})
    User toEntity(UserVO userVO);

    /**
     * 转换成List
     * @param users
     * @return
     */
    List<UserVO> toVOList(List<User> users);
}
