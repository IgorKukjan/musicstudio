package edu.gorb.musicstudio.model.service.impl;

import edu.gorb.musicstudio.entity.Course;
import edu.gorb.musicstudio.exception.DaoException;
import edu.gorb.musicstudio.exception.ServiceException;
import edu.gorb.musicstudio.model.dao.CourseDao;
import edu.gorb.musicstudio.model.dao.DaoProvider;
import edu.gorb.musicstudio.model.service.CourseService;
//import edu.gorb.musicstudio.util.DescriptionUtil;
//import edu.gorb.musicstudio.util.HtmlEscapeUtil;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.Part;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import java.util.stream.Collectors;

public class CourseServiceImpl implements CourseService {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public void updateCourse(Course course) throws ServiceException {

    }

    @Override
    public List<Course> findAllCourses() throws ServiceException {
        return null;
    }

    @Override
    public List<Course> findCoursesForRequest(int pageNumber, String searchParameter) throws ServiceException {
        return null;
    }

    @Override
    public int calcPagesCount(int coursesCount) {
        return 0;
    }

    @Override
    public int countCoursesForRequest(String searchParameter) throws ServiceException {
        return 0;
    }

    @Override
    public List<Course> trimCoursesDescriptionForPreview(List<Course> courses) {
        return null;
    }

    @Override
    public Optional<Course> findCourseById(long courseId) throws ServiceException {
        return Optional.empty();
    }

    @Override
    public List<Course> findActiveCoursesByTeacherId(long teacherId) throws ServiceException {
        return null;
    }

    @Override
    public void saveNewCourse(String name, String description, BigDecimal price, List<Part> imageParts) throws ServiceException {

    }

    @Override
    public void updateCourseWithImageUpload(long courseId, String name, String description, BigDecimal price, boolean isActive, List<Part> imageParts) throws ServiceException {

    }

    @Override
    public void addTeacherToCourse(long courseId, long teacherId) throws ServiceException {

    }

    @Override
    public void removeTeacherFromCourse(long courseId, long teacherId) throws ServiceException {

    }

    @Override
    public void updateStatus(long courseId, boolean isActive) throws ServiceException {

    }
}