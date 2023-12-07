package romstark.musyn4.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import romstark.musyn4.entitys.MFile;
import romstark.musyn4.repositorys.MFileRepository;

@Service
@AllArgsConstructor
public class MFileService {
    MFileRepository mFileRepository;
    public void saveMFile(MFile mFile){
        mFileRepository.save(mFile);
    }
}
