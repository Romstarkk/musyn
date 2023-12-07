package romstark.musyn4.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import romstark.musyn4.Services.MFileService;
import romstark.musyn4.entitys.MFile;
import romstark.musyn4.repositorys.MFileRepository;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/play")
public class MFileController {
   MFileService mFileService;
   MFileRepository mFileRepository;
   @GetMapping
   public String getAllMFile(Model model){
      Iterable<MFile> medias=mFileRepository.findAll();
      model.addAttribute("mFiles",medias);
      model.addAttribute("newMFile",new MFile());
      model.addAttribute("pos",0);
      return "play";
   }

   @GetMapping("/{pos}")
   public String getByIdMFile(@PathVariable Long pos,Model model){
      Iterable<MFile> medias=mFileRepository.findAll();
      model.addAttribute("mFiles",medias);
      model.addAttribute("newMFile",new MFile());
      model.addAttribute("pos",pos);
      return "play";
   }

   @PostMapping
    public String createMfile(@ModelAttribute("newMFile") MFile mFile){
       mFileService.saveMFile(mFile);
       return "redirect:/play";
   }
}