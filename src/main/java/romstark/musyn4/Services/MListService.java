package romstark.musyn4.Services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import romstark.musyn4.entitys.MFile;
import romstark.musyn4.entitys.MList;
import romstark.musyn4.repositorys.MFileRepository;
import romstark.musyn4.repositorys.MListRepository;

@Service
@AllArgsConstructor
public class MListService {
    MListRepository mListRepository;
    public void saveMList(MList mList){
        mListRepository.save(mList);
    }
}
