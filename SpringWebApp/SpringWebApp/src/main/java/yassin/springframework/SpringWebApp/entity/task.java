package yassin.springframework.SpringWebApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@AllArgsConstructor
@Getter
@Setter
@Data
public class task {
    // getter and setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String prename;
    private  String name;
    private  Integer age;

    public task() {

    }

    // constructor
    public task(String prename, String name, Integer age) {
        this.prename = prename;
        this.name = name;
        this.age = age;
    }
}
