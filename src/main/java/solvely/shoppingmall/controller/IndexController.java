package solvely.shoppingmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @GetMapping("hello")
    public String Index(Model model){
        model.addAttribute("data", "hello!!");
        return "hello";
    }
}
