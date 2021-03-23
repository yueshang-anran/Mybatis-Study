package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 书
 * @date 2021/3/7 - 13:41
 */
public interface UserMapper {

    @Select("select * from mybatis.user")
    List<User> getUserList();

    //User getUserById(@Param("id") int id, @Param("string") String string);有多个基本类型就传入多个参数
    @Select("select * from mybatis.user where id = #{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{pwd})")
    int addUser(User user);

    @Update("update user set name=#{name},pwd=#{pwd} where id=#{id}")
    int updateUser(User user);

    @Delete("delete from user where id = #{id}")
    int deleteUserById(@Param("id") int id);
}
