package com.app.power.mapper;
import java.util.List;

import com.app.power.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * User 表数据库控制层接口
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    /**
     * 自定义注入方法
     */
    int deleteAll();

    @Select("select id as id, name, age from user")
    List<User> selectListBySQL();


}