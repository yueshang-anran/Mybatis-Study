package com.kuang.dao;

import com.kuang.pojo.Student;
import com.kuang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 书
 * @date 2021/3/14 - 19:04
 */
public interface TeacherMapper {

    List<Teacher> getTeacher();

    @Select("select * from mybatis.teacher")
    List<Teacher> getTeacher2();

    @Select("select * from mybatis.teacher where id=#{tid}")
    Teacher getTeacher3(@Param("tid") int id);

    //获取指定老师下的所有学生及老师的信息
    Teacher getOneTeacher(@Param("tid") int id);

    Teacher getOneTeacher2(@Param("tid") int id);
}
