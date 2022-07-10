package edu.gorb.musicstudio.model.dao.impl;

import edu.gorb.musicstudio.entity.LessonSchedule;
import edu.gorb.musicstudio.exception.DaoException;
import edu.gorb.musicstudio.model.dao.JdbcHelper;
import edu.gorb.musicstudio.model.dao.LessonScheduleDao;
import edu.gorb.musicstudio.model.dao.mapper.impl.LessonScheduleRowMapperImpl;
import edu.gorb.musicstudio.model.pool.ConnectionPool;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class LessonScheduleDaoImpl implements LessonScheduleDao {


    @Override
    public List<LessonSchedule> findAll() throws DaoException {
        return null;
    }

    @Override
    public Optional<LessonSchedule> findEntityById(long id) throws DaoException {
        return Optional.empty();
    }

    @Override
    public long insert(LessonSchedule lessonSchedule) throws DaoException {
        return 0;
    }

    @Override
    public void update(LessonSchedule lessonSchedule) throws DaoException {

    }

    @Override
    public List<LessonSchedule> findActiveFutureSchedulesForTeacher(long teacherId) throws DaoException {
        return null;
    }

    @Override
    public List<LessonSchedule> findActiveFutureSchedulesForStudent(long studentId) throws DaoException {
        return null;
    }

    @Override
    public List<LessonSchedule> findActiveScheduleForTeacherForDate(long teacherId, LocalDate date) throws DaoException {
        return null;
    }

    @Override
    public List<LessonSchedule> findActiveFutureSchedulesForStudentForCourse(long studentId, long courseId) throws DaoException {
        return null;
    }

    @Override
    public List<LessonSchedule> findLessonSchedulesBySubscriptionId(long subscriptionId) throws DaoException {
        return null;
    }

    @Override
    public List<LessonSchedule> findAllActiveFutureSchedules() throws DaoException {
        return null;
    }

    @Override
    public void updateStatus(long lessonId, LessonSchedule.LessonStatus status) throws DaoException {

    }
}
