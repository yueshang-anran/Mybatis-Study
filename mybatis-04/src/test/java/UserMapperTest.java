import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author 书
 * @date 2021/3/14 - 15:31
 */
public class UserMapperTest {

    @Test
    public void test1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void test2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);
        System.out.println(user);

        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void testAdd() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        userMapper.addUser(new User(4, "0.0", "1231321"));

        /**
         * 在MybatisUtils.getSqlSession()方法中设置了自动提交
         * 所以在此处不用sqlSession.commit();
         * 不过建议不要自动提交
         */

        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void testUpdateUser() {

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        userMapper.updateUser(new User(4, "fdsgdsg", "1231321"));

        sqlSession.close();
    }

    @Test
    public void testDeleteUserById() {

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        userMapper.deleteUserById(4);

        sqlSession.close();
    }


}
