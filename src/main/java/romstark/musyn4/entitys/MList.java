package romstark.musyn4.entitys;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class MList {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;
    private boolean isPrivate = true;
    private int size;

    @ManyToOne
    private MUser author;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<MFile> files;
}
