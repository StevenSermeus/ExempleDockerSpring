package com.henallux.customize.here.controller;

import com.henallux.customize.here.model.MagicKeyForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/hello")
public class WelcomeController {

    @RequestMapping(method= RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("magicKey", new MagicKeyForm());
        return "integrated:welcome";
    }
    @RequestMapping(value="/send", method=RequestMethod.POST)
    public String getFormData(@ModelAttribute("magicKey") MagicKeyForm form){
        System.out.println(form.getMagicKey());
        if(form.getMagicKey().equals("1234")){
            return "redirect:/inscription";
        }
        return "integrated:keyError";
    }

    @RequestMapping(value="/userInscription", method=RequestMethod.GET)
    public String userInscription(Model model){
        return "integrated:userInscription";
    }

    @RequestMapping(value="/keyError", method=RequestMethod.GET)
    public String keyError(Model model){
        return "integrated:keyError";
    }

}
