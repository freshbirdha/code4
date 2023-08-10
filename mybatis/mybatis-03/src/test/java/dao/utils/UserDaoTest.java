package dao.utils;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;

import java.util.HashMap;
import java.util.List;


public class UserDaoTest {

    @Test
   public void getUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex",1);
        map.put("pageSize",2);

        List<User> userByLimit = userDao.getUserByLimit(map);
        for (User user : userByLimit) {
            System.out.println(user);
        }

        sqlSession.close();

   }

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


}
