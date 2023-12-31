package com.CodeWeb.springboot.controller;

import com.CodeWeb.springboot.entity.MemberForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage(){
        return "Login/Custom-loginPage";
    }

    @GetMapping("/registerUser")
    public String showRegisterUserForm(Model theModel){
        theModel.addAttribute("member",new MemberForm());
        return "Login/RegisterUser";
    }

    @GetMapping("/registerManager")
    public String showRegisterManagerForm(Model theModel){
        theModel.addAttribute("member",new MemberForm());
        return "Login/RegisterManager";
    }


}
