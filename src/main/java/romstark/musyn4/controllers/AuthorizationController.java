package romstark.musyn4.controllers;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import romstark.musyn4.Services.MUserService;
import romstark.musyn4.entitys.MUser;

@Controller
@AllArgsConstructor
public class AuthorizationController {
    MUserService mUserService;
    @GetMapping("/registration")
    String registration(Model model)
    {
        model.addAttribute("mUser",new MUser());
        return "registration";
    }
    @PostMapping("/registration")
    String registration(@ModelAttribute("mUser")@Validated MUser mUser, Model model){
        mUserService.saveUser(mUser);
        return "redirect:/loginPage";
    }
    @GetMapping("/loginPage")
    String authentication(Model model)
    {
        return "loginPage";
    }
}
