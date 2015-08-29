package app.controllers;

import org.springframework.web.bind.annotation.*;

/**
 * Created by ledenev.p on 28.08.2015.
 */

@RestController
public class AuthorizationController {

    @RequestMapping("/auth")
    public void greeting(@RequestParam(value = "name") String name, @RequestParam(value = "password") String password) {

    }
}
