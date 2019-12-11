package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

import java.util.Date;


/**
 * @PackageName controller
 * @ClassName HelloController
 * @Description TODO
 * @Autor 张二
 * @Date 2019/12/3 17:41
 **/
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("HelloController.hello");
        System.out.println("true = " + true);

        //region Description
        String s = new String();
        return "Hello World~~";
        //endregion
    }
}


