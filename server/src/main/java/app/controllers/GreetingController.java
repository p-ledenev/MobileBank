package app.controllers; /**
 * Created by ledenev.p on 27.08.2015.
 */

import app.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.*;

@RestController
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), "Hello, " + name + "!");
    }
}
