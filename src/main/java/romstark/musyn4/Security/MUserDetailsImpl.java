package romstark.musyn4.Security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import romstark.musyn4.entitys.MUser;

import java.util.Collection;
import java.util.List;

//Класс, преобразующий MUser в UserDetails
//Далее такой класс можно передать в UserDetailsService
public class MUserDetailsImpl implements UserDetails {
    private Long id;

    private String username;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

    public MUserDetailsImpl(Long id, String username, String password, Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }

    public static UserDetails build(MUser mUser) {
        List<GrantedAuthority> authorityList = List.of(new SimpleGrantedAuthority(mUser.getRole().name()));
        return new User(
                mUser.getUsername(),
                mUser.getPassword(),
                true,
                true,
                true,
                true,
                authorityList);
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
