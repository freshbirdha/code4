package scan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
/**
 * 等价与  <bean id="user" class="scan.User"/>
 * component组件放在类上，说明这个类被Spring管理了，就是Bean
 */
public class User {

    //1.属性值显示方式
    /*public  String name = "东京斑马编程教室";*/

    //2.第二种显示方式,使用value()注入属性值
   /* *@Value("东京斑马编程教室") // 相当于<property name="name" value="东京斑马编程教室"/>
    public String name;*/

    //3.第三种显示方式,注入属性值在Set()方法上
    public String name;
    @Value("东京")
    public void setName(String name) {
        this.name = name;
    }



}
