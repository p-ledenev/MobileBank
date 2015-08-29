package app.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by ledenev.p on 28.08.2015.
 */

@Entity
@Table(name = "User")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String login;
    private String password;
}
