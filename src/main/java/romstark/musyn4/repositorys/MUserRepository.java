package romstark.musyn4.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import romstark.musyn4.entitys.MUser;

import java.util.Optional;


public interface MUserRepository extends JpaRepository<MUser,Long> {

   public Optional<MUser> findByUsername(String username);
}
