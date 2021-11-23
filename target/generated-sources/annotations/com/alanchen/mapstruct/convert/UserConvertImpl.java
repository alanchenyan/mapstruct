package com.alanchen.mapstruct.convert;

import com.alanchen.mapstruct.entity.User;
import com.alanchen.mapstruct.entity.User.UserBuilder;
import com.alanchen.mapstruct.vo.UserVO;
import com.alanchen.mapstruct.vo.UserVO.UserVOBuilder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-23T10:53:38+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
public class UserConvertImpl implements UserConvert {

    private final UserTransform userTransform = new UserTransform();

    @Override
    public UserVO toVO(User user) {
        if ( user == null ) {
            return null;
        }

        UserVOBuilder userVO = UserVO.builder();

        if ( user.getBirthday() != null ) {
            userVO.birthday( new SimpleDateFormat( "yyyy-MM-dd" ).format( user.getBirthday() ) );
        }
        userVO.userName( user.getName() );
        userVO.id( user.getId() );
        userVO.age( user.getAge() );
        userVO.sex( user.getSex() );
        userVO.stop( userTransform.booleanToString( user.isStop() ) );

        return userVO.build();
    }

    @Override
    public User toEntity(UserVO userVO) {
        if ( userVO == null ) {
            return null;
        }

        UserBuilder user = User.builder();

        try {
            if ( userVO.getBirthday() != null ) {
                user.birthday( new SimpleDateFormat( "yyyy-MM-dd" ).parse( userVO.getBirthday() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        user.name( userVO.getUserName() );
        user.id( userVO.getId() );
        user.age( userVO.getAge() );
        user.sex( userVO.getSex() );
        user.stop( userTransform.strToBoolean( userVO.getStop() ) );

        return user.build();
    }

    @Override
    public List<UserVO> toVOList(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserVO> list = new ArrayList<UserVO>( users.size() );
        for ( User user : users ) {
            list.add( toVO( user ) );
        }

        return list;
    }
}
