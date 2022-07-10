package edu.gorb.musicstudio.model.service.impl;

import edu.gorb.musicstudio.entity.*;
import edu.gorb.musicstudio.exception.DaoException;
import edu.gorb.musicstudio.exception.ServiceException;
import edu.gorb.musicstudio.model.dao.DaoProvider;
import edu.gorb.musicstudio.model.dao.TeacherDescriptionDao;
import edu.gorb.musicstudio.model.dao.UserDao;
import edu.gorb.musicstudio.model.dao.UserTokenDao;
import edu.gorb.musicstudio.model.service.LessonScheduleService;
import edu.gorb.musicstudio.model.service.ServiceProvider;
import edu.gorb.musicstudio.model.service.TeacherScheduleService;
import edu.gorb.musicstudio.model.service.UserService;
//import edu.gorb.musicstudio.util.DateUtil;
//import edu.gorb.musicstudio.util.DescriptionUtil;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public List<User> findAllUsers() throws ServiceException {
        return null;
    }

    @Override
    public Optional<User> findRegisteredUser(String login, String password) throws ServiceException {
        return Optional.empty();
    }

    @Override
    public List<User> findAllActiveTeachers() throws ServiceException {
        return null;
    }

    @Override
    public User registerUser(UserRole userRole, String login, String password, String name, String surname, String patronymic, String email, UserStatus userStatus) throws ServiceException {
        return null;
    }

    @Override
    public void updateUserStatus(long userId, UserStatus status) throws ServiceException {

    }

    @Override
    public boolean isLoginAvailableForNewUser(String login) throws ServiceException {
        return false;
    }

    @Override
    public boolean isEmailAvailableForNewUser(String email) throws ServiceException {
        return false;
    }

    @Override
    public String createUserToken(User user) throws ServiceException {
        return null;
    }

    @Override
    public Optional<UserToken> findValidToken(String token, long userId) throws ServiceException {
        return Optional.empty();
    }

    @Override
    public void confirmEmail(long userId) throws ServiceException {

    }

    @Override
    public Optional<User> findUserByLogin(String login) throws ServiceException {
        return Optional.empty();
    }

    @Override
    public Optional<User> findUserById(Long id) throws ServiceException {
        return Optional.empty();
    }

    @Override
    public List<Teacher> findTeachersForRequest(int pageNumber, String searchLine) throws ServiceException {
        return null;
    }

    @Override
    public int calcPagesCount(int teacherCount) {
        return 0;
    }

    @Override
    public int countTeachersForRequest(String searchLine) throws ServiceException {
        return 0;
    }

    @Override
    public List<Teacher> trimTeachersDescriptionForPreview(List<Teacher> teachers) {
        return null;
    }

    @Override
    public Optional<Teacher> findTeacherById(long teacherId) throws ServiceException {
        return Optional.empty();
    }

    @Override
    public List<LocalTime> findTeacherFreeSlotsForDate(long teacherId, LocalDate date) throws ServiceException {
        return null;
    }

    @Override
    public int findTeacherFreeSlotCountForNextMonth(long teacherId) throws ServiceException {
        return 0;
    }

    @Override
    public int findTeacherFreeSlotCountForFuturePeriod(LocalDate start, LocalDate end, long teacherId) throws ServiceException {
        return 0;
    }

    @Override
    public List<User> findTeachersForCourse(long courseId) throws ServiceException {
        return null;
    }

    @Override
    public List<LocalDate> findAllAvailableDatesForTeachersForPeriod(List<User> teachers, LocalDate startDate, LocalDate endDate) throws ServiceException {
        return null;
    }

    @Override
    public Map<User, List<LocalTime>> findFreeSlotsForTeachersForDate(List<User> teachers, LocalDate date) throws ServiceException {
        return null;
    }

}
