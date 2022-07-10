package edu.gorb.musicstudio.model.dao.impl;

import edu.gorb.musicstudio.entity.TeacherDescription;
import edu.gorb.musicstudio.exception.DaoException;
import edu.gorb.musicstudio.model.dao.JdbcHelper;
import edu.gorb.musicstudio.model.dao.TeacherDescriptionDao;
import edu.gorb.musicstudio.model.dao.mapper.impl.TeacherDescriptionRowMapperImpl;
import edu.gorb.musicstudio.model.pool.ConnectionPool;

import java.util.List;
import java.util.Optional;

public class TeacherDescriptionDaoImpl implements TeacherDescriptionDao {


    @Override
    public List<TeacherDescription> findAll() throws DaoException {
        return null;
    }

    @Override
    public Optional<TeacherDescription> findEntityById(long id) throws DaoException {
        return Optional.empty();
    }

    @Override
    public long insert(TeacherDescription teacherDescription) throws DaoException {
        return 0;
    }

    @Override
    public void update(TeacherDescription teacherDescription) throws DaoException {

    }

    @Override
    public Optional<TeacherDescription> findEntityByTeacherId(long id) throws DaoException {
        return Optional.empty();
    }
}
