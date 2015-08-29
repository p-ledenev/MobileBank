package app.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by ledenev.p on 27.08.2015.
 */
@Entity
@Table(name = "Person")
@Data
@NoArgsConstructor
public class Person extends PersistedEntity {

    private String name;
    private String country;

    public Person(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", country=" + country;
    }
}
