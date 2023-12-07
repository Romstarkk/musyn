package romstark.musyn4.entitys;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="muser")
public class MUser {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long ID;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    private Role role = Role.USER;

}