package romstark.musyn4.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import romstark.musyn4.entitys.MFile;

@Repository
public interface MListRepository extends CrudRepository<MFile,Long> {
}
