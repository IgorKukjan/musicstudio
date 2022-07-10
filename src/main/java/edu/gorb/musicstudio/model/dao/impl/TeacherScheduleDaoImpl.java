package edu.gorb.musicstudio.model.dao.impl;

import edu.gorb.musicstudio.entity.TeacherSchedule;
import edu.gorb.musicstudio.exception.DaoException;
import edu.gorb.musicstudio.model.dao.JdbcHelper;
import edu.gorb.musicstudio.model.dao.TeacherScheduleDao;
import edu.gorb.musicstudio.model.dao.mapper.impl.TeacherScheduleRowMapperImpl;
import edu.gorb.musicstudio.model.pool.ConnectionPool;

import java.util.List;
import java.util.Optional;

public class TeacherScheduleDaoImpl implements TeacherScheduleDao {


    @Override
    public List<TeacherSchedule> findAll() throws DaoException {
        return null;
    }

    @Override
    public Optional<TeacherSchedule> findEntityById(long id) throws DaoException {
        return Optional.empty();
    }

    @Override
    public long insert(TeacherSchedule teacherSchedule) throws DaoException {
        return 0;
    }

    @Override
    public void update(TeacherSchedule teacherSchedule) throws DaoException {

    }

    @Override
    public List<TeacherSchedule> findSchedulesForTeacher(long teacherId) throws DaoException {
        return null;
    }

    @Override
    public Optional<TeacherSchedule> findScheduleForTeacher(long teacherId, int dayOfWeek) throws DaoException {
        return Optional.empty();
    }

    @Override
    public void removeSchedule(long teacherId, int dayOfWeek) throws DaoException {

    }
}
