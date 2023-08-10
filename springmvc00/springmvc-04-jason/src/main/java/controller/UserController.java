package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pojo.User;
import utils.JsonUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// controller会走视图解析器
// @Controller
@RestController  //RestController只会返回字符串
public class UserController {
    @RequestMapping("/j1")
   // @ResponseBody   //不会走视图解析器,直接返回一个字符串
    public String json1() throws JsonProcessingException {
        //jackson
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user = new User("斑马",3,"男");

        String s = mapper.writeValueAsString(user);
        return s;
    }


    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {

        //jackson
        ObjectMapper mapper = new ObjectMapper();

        List<User> userList = new ArrayList<User>();
        User user1 = new User("斑马1",3,"男");
        User user2 = new User("斑马2",4,"女");
        User user3 = new User("斑马3",5,"男");
        User user4 = new User("斑马4",6,"女");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);


        String s = mapper.writeValueAsString(userList);
        return s;
    }


    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {
        //jackson
        ObjectMapper mapper = new ObjectMapper();

        //不使用时间戳方式 取消timestamps形式,使用自定义时间格式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);

        //Date date = new Date();

        //自定义日期格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        mapper.setDateFormat(simpleDateFormat);

        Date date = new Date();

        return mapper.writeValueAsString(date);
    }


    @RequestMapping("/j4")
    public String json4() throws JsonProcessingException {
        Date date = new Date();


        //传入两个参数情况
      //  return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");

        //传入一个参数情况
        return JsonUtils.getJson(date);

    }



}
