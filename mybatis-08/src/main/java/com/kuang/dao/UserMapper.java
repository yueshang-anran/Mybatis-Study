package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author 书
 * @date 2021/3/21 - 16:23
 */
public interface UserMapper {

    // 根据id查询用户
    User queryUserById(@Param("id") int id);

    int updateUser(User user);
}
