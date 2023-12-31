package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFulController {
    //原来的  http://localhost:8080/add?a=1&b=2
    //RestFul http://localhost:8080/add/a/b

  /*  @RequestMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable int b, Model model){
        int res = a + b;

        model.addAttribute("msg","结果为:" +res);
        return "test";

    }*/

  /*  @RequestMapping(value="/add/{a}/{b}",method = RequestMethod.DELETE)
    public String test2(@PathVariable int a, @PathVariable int b, Model model){
        int res = a + b;

        model.addAttribute("msg","结果为:" +res);
        return "test";

    }*/


    //@RequestMapping(value="/add/{a}/{b}",method = RequestMethod.DELETE)
    @GetMapping("/add/{a}/{b}")
    public String test3(@PathVariable int a, @PathVariable String b, Model model){
        String res = a + b;

        model.addAttribute("msg","结果1为:" +res);
        return "test";

    }

    @PostMapping("/add/{a}/{b}")
    public String test4(@PathVariable int a, @PathVariable String b, Model model){
        String res = a + b;

        model.addAttribute("msg","结果2为:" +res);
        return "test";

    }

}
