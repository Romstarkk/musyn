package romstark.musyn2.boots.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {
    @GetMapping("/a1") //обработка перехода к сайту на страничку a1
    public String a1(
            @RequestParam(name = "name",required = false,defaultValue = "name_default")
                     String name,Map<String,Object> model)
    {
        model.put("name",name);
        return "a1";
    }

    @GetMapping
    public String main(Map<String,Object>model) {
        model.put("some","A kak pisat' na russkom?");
        return "main";
    }


    @GetMapping("/home")
    public String hom(Model model) {
        return "home";
    }

    @GetMapping("/login")
    public String log(Model model) {
        return "login";
    }

    @GetMapping("/register")
    public String reg(Model model) {
        return "register";
    }



    @GetMapping("/download")
    public String dow(Model model) {
        return "download";
    }
}