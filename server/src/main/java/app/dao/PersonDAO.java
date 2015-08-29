package app.dao;

import app.model.*;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

/**
 * Created by ledenev.p on 27.08.2015.
 */

@Component
public class PersonDAO implements IPersonDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(Person p) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(p);
        tx.commit();
        session.close();
    }

    public List<Person> list() {
        Session session = sessionFactory.openSession();
        List<Person> personList = session.createCriteria(Person.class).list();
        session.close();

        return personList;
    }
}
