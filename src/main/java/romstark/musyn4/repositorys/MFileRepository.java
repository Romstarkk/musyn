package romstark.musyn4.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import romstark.musyn4.entitys.MFile;

import java.util.Optional;

@Repository
public interface MFileRepository extends CrudRepository<MFile,Long> {
}
