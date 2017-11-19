package com.example.controller;

import com.example.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;

/**
 * Created by Ali on 18.11.2017.
 */

@Controller
@RequestMapping("account")
public class AccountController {

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String register(ModelMap modelMap){

        modelMap.put("account", new Account());
        return "account/register";
    }

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String register(
            @ModelAttribute("ali") @Valid Account ali,
            BindingResult bindingResult,
            ModelMap modelMap){

        modelMap.put("account", new Account());
        return "account/register";
    }
}
