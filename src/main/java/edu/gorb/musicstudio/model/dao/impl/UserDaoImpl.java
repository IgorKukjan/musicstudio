package edu.gorb.musicstudio.model.dao.impl;

import edu.gorb.musicstudio.entity.User;
import edu.gorb.musicstudio.entity.UserStatus;
import edu.gorb.musicstudio.exception.DaoException;
import edu.gorb.musicstudio.exception.DatabaseConnectionException;
import edu.gorb.musicstudio.model.dao.JdbcHelper;
import edu.gorb.musicstudio.model.dao.UserDao;
import edu.gorb.musicstudio.model.dao.mapper.impl.UserRowMapperImpl;
import edu.gorb.musicstudio.model.pool.ConnectionPool;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {
    private static final Logger logger = LogManager.getLogger();


    @Override
    public List<User> findAll() throws DaoException {
        return null;
    }

    @Override
    public Optional<User> findEntityById(long id) throws DaoException {
        return Optional.empty();
    }

    @Override
    public long insert(User user) throws DaoException {
        return 0;
    }

    @Override
    public void update(User user) throws DaoException {

    }

    @Override
    public Optional<User> findUserByLogin(String login) throws DaoException {
        return Optional.empty();
    }

    @Override
    public Optional<User> findUserByEmail(String email) throws DaoException {
        return Optional.empty();
    }

    @Override
    public void updateUserStatus(long userId, UserStatus userStatus) throws DaoException {

    }

    @Override
    public List<User> selectActiveTeachersForPage(int skipAmount, int teachersPerPageAmount) throws DaoException {
        return null;
    }

    @Override
    public List<User> selectActiveTeachersWithSearchForPage(int skipAmount, int teacherPerPageAmount, String search) throws DaoException {
        return null;
    }

    @Override
    public int countActiveTeachers() throws DaoException {
        return 0;
    }

    @Override
    public int countActiveTeachersWithSearch(String searchParameter) throws DaoException {
        return 0;
    }

    @Override
    public List<User> selectTeachersForCourse(long courseId) throws DaoException {
        return null;
    }

    @Override
    public List<User> findAllActiveTeachers() throws DaoException {
        return null;
    }
}
