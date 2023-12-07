package romstark.musyn4.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import romstark.musyn4.entitys.MUser;
import romstark.musyn4.entitys.Role;
import romstark.musyn4.repositorys.MUserRepository;


import java.util.Collections;
import java.util.Set;

@Service
@AllArgsConstructor
public class MUserService {
    MUserRepository muserRepository;
    private final BCryptPasswordEncoder encoder;

    public void saveUser(MUser mUser){
        mUser.setPassword(encoder.encode(mUser.getPassword()));
        muserRepository.save(mUser);
    }
}

