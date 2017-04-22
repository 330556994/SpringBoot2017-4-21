package com.gt.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by GongTao on 2017/4/22 22:12.
 */

@Controller
public class HomeController {

    @ResponseBody
    @RequestMapping(value="index",method = RequestMethod.GET)
    public String index(){

        return "Hello World!!!";
    }

}
