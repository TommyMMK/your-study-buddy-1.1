package th.mfu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import th.mfu.domain.User;

@Controller
public class UserController {
    @Autowired
    UserRepository userrepo;

    @GetMapping("/home")
    public String showStartPage(Model model) {
        return "home";
    }

    @GetMapping("/signup")
    public String addABuyerSingupForm(Model model){
        model.addAttribute("user", new User());
        return "signup-form";
    }
}
