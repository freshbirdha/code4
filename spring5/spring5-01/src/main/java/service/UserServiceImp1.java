package service;

import dao.UserDao;
import dao.UserDaoImp1;

public class UserServiceImp1 implements UserService{

    private UserDao userDao = new UserDaoImp1();

    public void getUser() {
        userDao.getUser();
    }
}
