import com.kuang.dao.StudentMapper;
import com.kuang.dao.TeacherMapper;
import com.kuang.pojo.Student;
import com.kuang.pojo.Teacher;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author 书
 * @date 2021/3/14 - 19:20
 */
public class daoTest {
    
    @Test
    public void testStudentMapper() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper StudentMapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> student = StudentMapper.getStudent();
        for (Student student1 : student) {
            System.out.println(student1);
        }

        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void testStudentMapper2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper StudentMapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> student = StudentMapper.getStudent2();
        for (Student student1 : student) {
            System.out.println(student1);
        }

        //关闭SqlSession
        sqlSession.close();
    }

}
