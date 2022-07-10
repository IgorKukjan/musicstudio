package edu.gorb.musicstudio.model.service.impl;

import edu.gorb.musicstudio.entity.TeacherDescription;
import edu.gorb.musicstudio.exception.DaoException;
import edu.gorb.musicstudio.exception.ServiceException;
import edu.gorb.musicstudio.model.dao.DaoProvider;
import edu.gorb.musicstudio.model.dao.TeacherDescriptionDao;
import edu.gorb.musicstudio.model.service.TeacherDescriptionService;
//import edu.gorb.musicstudio.util.HtmlEscapeUtil;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.Part;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

public class TeacherDescriptionServiceImpl implements TeacherDescriptionService {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public Optional<TeacherDescription> findTeacherDescriptionByTeacherId(long teacherId) throws ServiceException {
        return Optional.empty();
    }

    @Override
    public boolean teacherDescriptionExists(long teacherId) throws ServiceException {
        return false;
    }

    @Override
    public void saveTeacherDescription(long teacherId, List<Part> imageParts, String description, int workExperienceYears) throws ServiceException {

    }

    @Override
    public void updateTeacherDescriptionWithImageUpload(long teacherId, List<Part> imageParts, String description, int workExperienceYears) throws ServiceException {

    }

    @Override
    public void updateTeacherDescription(long teacherId, String description, int workExperienceYears) throws ServiceException {

    }
}
