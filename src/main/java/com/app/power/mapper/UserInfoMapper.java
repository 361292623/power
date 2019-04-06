package com.app.power.mapper;

import com.app.power.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author zack
 * @date 2018-12-01 21:12
 */
@Component
public interface UserInfoMapper {
    //通过username查找用户信息
    UserInfo findByUsername(@Param("username") String username);
}
