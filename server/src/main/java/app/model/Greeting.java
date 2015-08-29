package app.model;

import lombok.*;

/**
 * Created by ledenev.p on 27.08.2015.
 */

@Data
@AllArgsConstructor
public class Greeting {

    private final long id;
    private final String content;
}