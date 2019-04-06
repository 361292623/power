package com.app.power.service;

import com.app.power.entity.UserInfo;

/**
 * @author zack
 * @date 2018-12-01 21:12
 */
public interface UserInfoService {
    /**通过username查找用户信息;*/
    UserInfo findByUsername(String username);
}
