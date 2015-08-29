package app.dao;

import app.model.*;

/**
 * Created by ledenev.p on 28.08.2015.
 */
public interface IUserDAO {

    User findByLogin(String login);

    void save(User user);
}
