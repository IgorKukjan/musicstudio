package edu.gorb.musicstudio.model.dao.impl;

import edu.gorb.musicstudio.entity.Subscription;
import edu.gorb.musicstudio.exception.DaoException;
import edu.gorb.musicstudio.model.dao.JdbcHelper;
import edu.gorb.musicstudio.model.dao.SubscriptionDao;
import edu.gorb.musicstudio.model.dao.mapper.impl.SubscriptionRowMapperImpl;
import edu.gorb.musicstudio.model.pool.ConnectionPool;

import java.util.List;
import java.util.Optional;

public class SubscriptionDaoImpl implements SubscriptionDao {


    @Override
    public List<Subscription> findAll() throws DaoException {
        return null;
    }

    @Override
    public Optional<Subscription> findEntityById(long id) throws DaoException {
        return Optional.empty();
    }

    @Override
    public long insert(Subscription subscription) throws DaoException {
        return 0;
    }

    @Override
    public void update(Subscription subscription) throws DaoException {

    }

    @Override
    public List<Subscription> findAllContinuingActiveSubscriptions() throws DaoException {
        return null;
    }

    @Override
    public Optional<Subscription> findContinuingActiveCourseSubscription(long studentId, long courseId) throws DaoException {
        return Optional.empty();
    }

    @Override
    public List<Subscription> findContinuingActiveStudentSubscriptions(long studentId) throws DaoException {
        return null;
    }

    @Override
    public Optional<Subscription> findContinuingActiveSubscriptionById(long subscriptionId) throws DaoException {
        return Optional.empty();
    }

    @Override
    public void updateStatus(long subscriptionId, Subscription.SubscriptionStatus status) throws DaoException {

    }

    @Override
    public List<Subscription> findContinuingActiveSubscriptionsForCourse(long courseId) throws DaoException {
        return null;
    }
}
