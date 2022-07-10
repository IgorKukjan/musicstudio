package edu.gorb.musicstudio.model.service.impl;

import edu.gorb.musicstudio.entity.Comment;
import edu.gorb.musicstudio.entity.User;
import edu.gorb.musicstudio.entity.dto.CommentDto;
import edu.gorb.musicstudio.exception.DaoException;
import edu.gorb.musicstudio.exception.ServiceException;
import edu.gorb.musicstudio.model.dao.CommentDao;
import edu.gorb.musicstudio.model.dao.DaoProvider;
import edu.gorb.musicstudio.model.dao.UserDao;
import edu.gorb.musicstudio.model.service.CommentService;
//import edu.gorb.musicstudio.util.HtmlEscapeUtil;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CommentServiceImpl implements CommentService {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public List<CommentDto> findActiveCommentsForCourse(long courseId) throws ServiceException {
        return null;
    }

    @Override
    public long addNewComment(long userId, long courseId, String content) throws ServiceException {
        return 0;
    }

    @Override
    public Optional<Comment> findCommentById(long commentId) throws ServiceException {
        return Optional.empty();
    }

    @Override
    public void deactivateComment(long commentId) throws ServiceException {

    }
}
