package com.app.power.mapper;

import com.app.power.entity.SysRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zack
 * @date 2018-12-01 21:12
 */
@Component
public interface SysRoleMapper {
    //通过username查找用户角色信息
    List<SysRole> findRoleByUsername(@Param("username") String username);
}
