import service.UserService;
import service.UserServiceImp1;

public class Mytest {
    public static void main(String[] args) {
        //用户实例调用的是业务层  dao层不需要接触
        UserService userService = new UserServiceImp1();
        userService.getUser();
    }
}
