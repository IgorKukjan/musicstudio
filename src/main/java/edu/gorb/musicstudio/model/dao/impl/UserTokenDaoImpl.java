package edu.gorb.musicstudio.model.dao.impl;

import edu.gorb.musicstudio.entity.UserToken;
import edu.gorb.musicstudio.exception.DaoException;
import edu.gorb.musicstudio.model.dao.JdbcHelper;
import edu.gorb.musicstudio.model.dao.UserTokenDao;
import edu.gorb.musicstudio.model.dao.mapper.impl.UserTokenRowMapperImpl;
import edu.gorb.musicstudio.model.pool.ConnectionPool;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

public class UserTokenDaoImpl implements UserTokenDao {


    @Override
    public long insetUserToken(long userId, String token, LocalDateTime timestamp) throws DaoException {
        return 0;
    }

    @Override
    public Optional<UserToken> findTokenByValue(String token, long userId) throws DaoException {
        return Optional.empty();
    }
}
