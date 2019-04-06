package com.app.power.mapper;

import com.app.power.entity.SysPermission;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zack
 * @date 2018-12-01 21:12
 */
@Component
public interface SysPermissionMapper {
    //根据角色ID查询角色对应的权限信息
    List<SysPermission> findPermissionByRoleId(@Param("roleId") Integer roleId);
}
