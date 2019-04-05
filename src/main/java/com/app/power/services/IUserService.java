package com.app.power.services;


import com.app.power.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 *
 * User 表数据服务层接口
 *
 */
public interface IUserService extends IService<User> {

    boolean deleteAll();

    List<User> selectListBySQL();

}