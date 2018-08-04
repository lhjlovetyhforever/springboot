package com.tyh.i.lo.ve.yo.u.springboot.gridControll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class toPageController {
    @RequestMapping(value = "/login")
    public String goLogin(){

        return "/login.html";
    }



    @RequestMapping(value = "/loginOk")
    public String login(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password){
        System.out.println("username="+username);
        System.out.println("password="+password);
        if(username!=null&&!"".equals(username)&&password!=null&&!"".equals(password)){

        }else{

        }
        return  "/index";
    }
}
