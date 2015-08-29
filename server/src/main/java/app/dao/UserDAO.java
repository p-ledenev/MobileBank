package app.dao;

import app.model.*;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.springframework.beans.factory.annotation.*;

/**
 * Created by ledenev.p on 28.08.2015.
 */
public class UserDAO implements IUserDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public User findByLogin(String login) {
        Session session = sessionFactory.openSession();
        User user = (User) session.createCriteria(User.class).add(Restrictions.eq("login", login)).uniqueResult();
        session.close();

        return user;
    }

    @Override
    public void save(User user) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(user);
        tx.commit();
        session.close();
    }
}
