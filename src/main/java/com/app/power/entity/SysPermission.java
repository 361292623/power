package com.app.power.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zack
 * @date 2018-12-01 21:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysPermission {
    Integer id;//主键.
    String name;//名称.
    String url;//资源路径.
    String permission; //权限字符串
}
