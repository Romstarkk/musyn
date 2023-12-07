package romstark.musyn4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import romstark.musyn4.repositorys.MFileRepository;

@Controller
public class TestController {
    @Autowired
    private MFileRepository repository;

    @GetMapping("/")
    String def(ModelAndView modelAndView){
        return "index";
    }
    @GetMapping("/admin")
    String admin(ModelAndView modelAndView){
        return "forAdmin";
    }
    @GetMapping("/login2")
    String login2(ModelAndView modelAndView){
        return "login2";
    }
    @GetMapping("/login1")
    String login1(ModelAndView modelAndView){
        return "login1";
    }
    @GetMapping("/guest")
    String guest(ModelAndView modelAndView){
        return "forGuest";
    }
    @GetMapping("/testVideoFromYoutube")
    String test1(ModelAndView modelAndView){
        return "testVideoFromYoutube";
    }
    @GetMapping("/manga")
    String manga(ModelAndView modelAndView){
        return "Mangalib";
    }
}
