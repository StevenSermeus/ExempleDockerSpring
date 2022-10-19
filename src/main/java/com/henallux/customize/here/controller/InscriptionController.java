package com.henallux.customize.here.controller;

import com.henallux.customize.here.model.MagicKeyForm;
import com.henallux.customize.here.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/inscription")
public class InscriptionController {

        @RequestMapping(method= RequestMethod.GET)
        public String inscription(Model model){
            model.addAttribute("userData", new User());
            return "integrated:userInscription";
        }

        @RequestMapping(value="", method=RequestMethod.POST)
        public String getFormData(@ModelAttribute("userData") User form){
            System.out.println(form.getName());
            System.out.println(form.getAge());
            System.out.println(form.getMale());
            System.out.println(form.getHobby());
            return "redirect:/hello";
        }
}
