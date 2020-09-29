package src.Server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 */
@Controller
public class HelloController {
//    @Value("${name}")
//    private String name;

    @RequestMapping("/hello")
    public String hello(String asd){
        System.out.println(asd);
        return "index";
    }

    @GetMapping("/index")
    public String index(){
        return "first";
    }






}
