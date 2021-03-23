import com.kuang.dao.TeacherMapper;
import com.kuang.pojo.Teacher;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author 书
 * @date 2021/3/14 - 19:20
 */
public class daoTest {

    @Test
    public void testTeacherMapper() {

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        for (Teacher teacher : sqlSession.getMapper(TeacherMapper.class).getTeacher()) {
            System.out.println(teacher);
        }
        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void testTeacherMapper2() {

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        for (Teacher teacher : sqlSession.getMapper(TeacherMapper.class).getTeacher2()) {
            System.out.println(teacher);
        }
        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void testTeacherMapper3() {

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        System.out.println(sqlSession.getMapper(TeacherMapper.class).getTeacher3(1));
        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void testTeacherMapper4() {

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        System.out.println(sqlSession.getMapper(TeacherMapper.class).getOneTeacher(1));
        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void testTeacherMapper5() {

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        System.out.println(sqlSession.getMapper(TeacherMapper.class).getOneTeacher2(2));
        //关闭SqlSession
        sqlSession.close();
    }


}
