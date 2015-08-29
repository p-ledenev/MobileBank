package app;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.*;

/**
 * Created by ledenev.p on 27.08.2015.
 */

@SpringBootApplication
@ImportResource("application-context.xml")
public class Runner {

    public static void main(String[] args) {
        SpringApplication.run(Runner.class, args);
    }
}
