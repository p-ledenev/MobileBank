package app.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by ledenev.p on 28.08.2015.
 */

@NoArgsConstructor
public class PersistedEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
}
