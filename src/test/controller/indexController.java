package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/8/20.
 */
@Controller
@RequestMapping("/index")
public class indexController {

    @RequestMapping(value = "/firstIndex")
    public String firstIndex(){
        return "index";
    }
}
