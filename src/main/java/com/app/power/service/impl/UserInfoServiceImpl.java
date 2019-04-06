package com.app.power.service.impl;

import com.app.power.entity.UserInfo;
import com.app.power.mapper.UserInfoMapper;
import com.app.power.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zack
 * @date 2018-12-01 21:12
 */
@Service("UserInfoService")
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;
    @Override
    public UserInfo findByUsername(String username) {
        return userInfoMapper.findByUsername(username);
    }
}
