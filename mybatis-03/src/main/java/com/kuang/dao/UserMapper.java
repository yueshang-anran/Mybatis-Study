package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.HashMap;
import java.util.List;

/**
 * @author 书
 * @date 2021/3/7 - 13:41
 */
public interface UserMapper {

    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUserById(int id);


    List<User> getUserByLimit(HashMap<String, Integer> map);

    List<User> getUserByRowBounds();
}
