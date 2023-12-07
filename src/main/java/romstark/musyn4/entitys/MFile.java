package romstark.musyn4.entitys;

import jakarta.persistence.*;
import lombok.Data;

import java.io.File;

@Entity
@Data

public class MFile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String name;
    String url;

    /*//несеолько песен ссылаются на одного пользователя
    //Fetch Type Egger - при получении MFile получать поле Author
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_ID")
    String author;*/

    /*File file;*/
}
