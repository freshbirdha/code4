package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//只要实现了Controller接口的类,说明这就是一个控制器

public class ControllerTest implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
       ModelAndView mv = new ModelAndView();
       mv.addObject("msg","ControllerTest");
       mv.setViewName("test");
        return mv;
    }
}
