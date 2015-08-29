package app.dao;

import app.model.*;

import java.util.*;

/**
 * Created by ledenev.p on 27.08.2015.
 */
public interface IPersonDAO {

    void save(Person p);

    List<Person> list();
}
