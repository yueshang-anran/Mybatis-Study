package com.kuang.dao;

import com.kuang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author 书
 * @date 2021/3/14 - 19:04
 */
public interface TeacherMapper {

    @Select("select * from mybatis.teacher where id=#{tid}")
    Teacher getTeacher(@Param("tid") int id);
}
