package romstark.musyn4.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import romstark.musyn4.entitys.MList;

import java.util.List;
import java.util.Optional;

@Repository
public interface MListRepository extends JpaRepository<MList,Long> {

    List<MList> findAllByAuthorUsername(String author);
}
