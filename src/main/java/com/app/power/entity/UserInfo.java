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
public class UserInfo {
    Integer uid;//用户id
    String username;//帐号
    String name;
    String password;
    String salt;
    byte state;
    /**
     * 密码盐.
     * @return
     */
    public String getCredentialsSalt(){

        return this.username+this.salt;
    }
}
