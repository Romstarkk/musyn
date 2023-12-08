package romstark.musyn4.controllers;

import lombok.AllArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import romstark.musyn4.Services.MFileService;
import romstark.musyn4.Services.MListService;
import romstark.musyn4.entitys.MFile;
import romstark.musyn4.entitys.MList;
import romstark.musyn4.repositorys.MFileRepository;
import romstark.musyn4.repositorys.MListRepository;
import romstark.musyn4.repositorys.MUserRepository;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/play")
//@ResponseBody//не искать представление соответствующее возвращаемому значению
public class PlayController {
   MFileService mFileService;
   MFileRepository mFileRepository;
   MListRepository mListRepository;
   MUserRepository mUserRepository;

   @GetMapping
   public String getAllMlist(@AuthenticationPrincipal User user,Model model){
      //return "Username = " + user.getUsername(); вернуть имя пользователя, который авторизован
      Iterable<MList> lists= mListRepository.findAllByAuthorUsername(user.getUsername());
      model.addAttribute("username",user.getUsername());
      model.addAttribute("mLists",lists);
      model.addAttribute("newMlist",new MList());
      return "play";
   }
   /*@GetMapping
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
   }*/
}