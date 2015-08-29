package app.controllers;

import app.model.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import app.dao.*;

import java.util.*;

/**
 * Created by ledenev.p on 28.08.2015.
 */

@RestController
public class PersonController {

    @Autowired
    IPersonDAO personDAO;

    @RequestMapping("/add")
    public void add(@RequestParam(value = "name") String name, @RequestParam(value = "country") String country) {

        Person person = new Person(name, country);
        personDAO.save(person);
    }

    @RequestMapping("/display")
    public List<Person> display(@RequestParam(value = "name", defaultValue = "World") String name) {
        return personDAO.list();
    }
}
