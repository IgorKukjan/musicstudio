package edu.gorb.musicstudio.model.service.impl;

import edu.gorb.musicstudio.entity.TeacherSchedule;
import edu.gorb.musicstudio.exception.DaoException;
import edu.gorb.musicstudio.exception.ServiceException;
import edu.gorb.musicstudio.model.dao.DaoProvider;
import edu.gorb.musicstudio.model.dao.TeacherScheduleDao;
import edu.gorb.musicstudio.model.service.TeacherScheduleService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

public class TeacherScheduleServiceImpl implements TeacherScheduleService {
    private static final Logger logger = LogManager.getLogger();


    @Override
    public List<TeacherSchedule> findAllById(long teacherId) throws ServiceException {
        return null;
    }

    @Override
    public boolean alterSchedule(long teacherId, String startTimeParam, String endTimeParam, int dayOfWeek, boolean isRemove) throws ServiceException {
        return false;
    }

    @Override
    public Optional<TeacherSchedule> findScheduleForDay(long teacherId, int dayOfWeek) throws ServiceException {
        return Optional.empty();
    }
}
