package edu.gorb.musicstudio.model.service.impl;

import edu.gorb.musicstudio.entity.Course;
import edu.gorb.musicstudio.entity.LessonSchedule;
import edu.gorb.musicstudio.entity.User;
import edu.gorb.musicstudio.entity.dto.LessonScheduleDto;
import edu.gorb.musicstudio.exception.DaoException;
import edu.gorb.musicstudio.exception.ServiceException;
import edu.gorb.musicstudio.model.dao.CourseDao;
import edu.gorb.musicstudio.model.dao.DaoProvider;
import edu.gorb.musicstudio.model.dao.LessonScheduleDao;
import edu.gorb.musicstudio.model.dao.UserDao;
import edu.gorb.musicstudio.model.service.LessonScheduleService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class LessonScheduleServiceImpl implements LessonScheduleService {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public Optional<LessonSchedule> findEntityById(long lessonId) throws ServiceException {
        return Optional.empty();
    }

    @Override
    public void updateStatus(long lessonId, LessonSchedule.LessonStatus status) throws ServiceException {

    }

    @Override
    public List<LessonScheduleDto> findActiveFutureSchedulesByTeacherId(long teacherId) throws ServiceException {
        return null;
    }

    @Override
    public List<LessonScheduleDto> findActiveFutureSchedulesByStudentId(long studentId) throws ServiceException {
        return null;
    }

    @Override
    public List<LessonScheduleDto> findAllActiveFutureSchedules() throws ServiceException {
        return null;
    }

    @Override
    public Map<String, List<LessonScheduleDto>> mapLessonDtosToDate(List<LessonScheduleDto> lessonScheduleDtos) {
        return null;
    }

    @Override
    public List<String> findDistinctDateLines(List<LessonScheduleDto> lessonScheduleDtos) {
        return null;
    }

    @Override
    public List<LessonSchedule> findActiveTeacherLessonsForDate(long teacherId, LocalDate date) throws ServiceException {
        return null;
    }

    @Override
    public List<LessonScheduleDto> findLessonSchedulesBySubscriptionId(long subscriptionId) throws ServiceException {
        return null;
    }

    @Override
    public void saveNewLessonSchedule(long studentId, long teacherId, long courseId, long subscriptionId, LocalDateTime startDateTime, LessonSchedule.LessonStatus status) throws ServiceException {

    }
}
