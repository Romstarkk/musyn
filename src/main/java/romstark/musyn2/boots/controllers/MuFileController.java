package romstark.musyn2.boots.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import romstark.musyn2.models.MuFile;
import romstark.musyn2.repos.MuFileRepository;

@Controller
public class MuFileController {


    private MuFileRepository muFileRepository;

    @GetMapping("/play")
    public String music(Model model){
        Iterable<MuFile> muFiles=muFileRepository.findAll();
        model.addAttribute("muFiles",muFiles);
        return "play";
    }
}
