package edu.gorb.musicstudio.model.dao.impl;

import edu.gorb.musicstudio.entity.Comment;
import edu.gorb.musicstudio.exception.DaoException;
import edu.gorb.musicstudio.model.dao.CommentDao;
import edu.gorb.musicstudio.model.dao.JdbcHelper;
import edu.gorb.musicstudio.model.dao.mapper.impl.CommentRowMapperImpl;
import edu.gorb.musicstudio.model.pool.ConnectionPool;

import java.util.List;
import java.util.Optional;

public class CommentDaoImpl implements CommentDao {


    @Override
    public List<Comment> findAll() throws DaoException {
        return null;
    }

    @Override
    public Optional<Comment> findEntityById(long id) throws DaoException {
        return Optional.empty();
    }

    @Override
    public long insert(Comment comment) throws DaoException {
        return 0;
    }

    @Override
    public void update(Comment comment) throws DaoException {

    }

    @Override
    public List<Comment> findActiveCommentsByCourseId(long teacherId) throws DaoException {
        return null;
    }

    @Override
    public void deactivateComment(long commentId) throws DaoException {

    }
}
