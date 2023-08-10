import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.People;
import scan.User;
import serviceAOP.UserService;

import java.util.HashMap;

public class Test04 {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        People people = context.getBean("people", People.class);
        people.getCat().shout();
        people.getDog().shout();

    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user",User.class);
        System.out.println(user.name);

    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beansAop.xml");
        //动态代理的是接口
        UserService userService = (UserService) context.getBean("userService");
        userService.add();


    }

}
