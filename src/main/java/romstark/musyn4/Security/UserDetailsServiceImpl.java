package romstark.musyn4.Security;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import romstark.musyn4.entitys.MUser;
import romstark.musyn4.repositorys.MUserRepository;

@AllArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final MUserRepository mUserRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MUser mUser =mUserRepository.findByUsername(username)
                .orElseThrow(()->new UsernameNotFoundException("Пользователь"+username+"Не найден"));
        return MUserDetailsImpl.build(mUser);
    }
}
