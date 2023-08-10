import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.HelloSpring;
import pojo.User;

public class Test02 {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloSpring hello = (HelloSpring) context.getBean("hello"); //<bean id="hello" class="pojo.HelloSpring">
        User user = (User) context.getBean("user");
        user.show();
        System.out.println(hello.toString());


    }
}
