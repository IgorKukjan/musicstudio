package edu.gorb.musicstudio.model.dao.impl;

import edu.gorb.musicstudio.entity.Course;
import edu.gorb.musicstudio.exception.DaoException;
import edu.gorb.musicstudio.exception.DatabaseConnectionException;
import edu.gorb.musicstudio.model.dao.CourseDao;
import edu.gorb.musicstudio.model.dao.JdbcHelper;
import edu.gorb.musicstudio.model.dao.mapper.impl.CourseRowMapperImpl;
import edu.gorb.musicstudio.model.pool.ConnectionPool;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class CourseDaoImpl implements CourseDao {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public List<Course> findAll() throws DaoException {
        return null;
    }

    @Override
    public Optional<Course> findEntityById(long id) throws DaoException {
        return Optional.empty();
    }

    @Override
    public long insert(Course course) throws DaoException {
        return 0;
    }

    @Override
    public void update(Course course) throws DaoException {

    }

    @Override
    public List<Course> selectActiveCoursesWithSearchForPage(int skipAmount, int coursePerPageAmount, String search) throws DaoException {
        return null;
    }

    @Override
    public List<Course> selectActiveCoursesForPage(int skipAmount, int coursePerPageAmount) throws DaoException {
        return null;
    }

    @Override
    public int countAllActiveCourses() throws DaoException {
        return 0;
    }

    @Override
    public int countActiveCoursesWithSearch(String searchParameter) throws DaoException {
        return 0;
    }

    @Override
    public List<Course> selectActiveCoursesByTeacherId(long teacherId) throws DaoException {
        return null;
    }

    @Override
    public void addTeacherToCourse(long courseId, long teacherId) throws DaoException {

    }

    @Override
    public void removeTeacherFromCourse(long courseId, long teacherId) throws DaoException {

    }

    @Override
    public void updateStatus(long courseId, boolean isActive) throws DaoException {

    }
}
