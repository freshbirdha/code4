package dao.utils;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {


    @Test
    public void test(){
        //第一步:执行SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            //执行SQL,方式1:getMapper
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userDao.getUserList();

            //第二种方式
            //   List<User> userList = sqlSession.selectList("dao.utils.UserMapper.getUserList");

            for (User user : userList) {
                System.out.println(user);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭SqlSession
            sqlSession.close();
        }
    }


    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userDao = sqlSession.getMapper(UserMapper.class);

        List<User> userList = userDao.getUserLike("东");

        for (User user : userList) {
            System.out.println(user);
        }


        sqlSession.close();
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userDao = sqlSession.getMapper(UserMapper.class);

        User userById = userDao.getUserById(1);
        System.out.println(userById);

        sqlSession.close();
    }




    //增删改必须要提交事务
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userDao = sqlSession.getMapper(UserMapper.class);

        userDao.addUser(new User(3,("斑马"),"123"));

        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void addUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userDao = sqlSession.getMapper(UserMapper.class);

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("userid",3);
        map.put("userName","东京斑马编程教室");
        map.put("password","233333");

        userDao.addUser2(map);

        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        userDao.updateUser(new User(3,"小明","32145"));

        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        userDao.deleteUser(3);

        sqlSession.commit();
        sqlSession.close();
    }
}
