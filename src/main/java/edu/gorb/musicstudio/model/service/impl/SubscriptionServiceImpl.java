package edu.gorb.musicstudio.model.service.impl;

import edu.gorb.musicstudio.entity.Course;
import edu.gorb.musicstudio.entity.LessonSchedule;
import edu.gorb.musicstudio.entity.Subscription;
import edu.gorb.musicstudio.entity.User;
import edu.gorb.musicstudio.entity.dto.SubscriptionDto;
import edu.gorb.musicstudio.exception.DaoException;
import edu.gorb.musicstudio.exception.ServiceException;
import edu.gorb.musicstudio.model.dao.*;
import edu.gorb.musicstudio.model.service.SubscriptionService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SubscriptionServiceImpl implements SubscriptionService {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public List<SubscriptionDto> findAllContinuingActiveSubscriptions() throws ServiceException {
        return null;
    }

    @Override
    public List<SubscriptionDto> findContinuingActiveStudentSubscriptions(long studentId) throws ServiceException {
        return null;
    }

    @Override
    public int calcMaxLessonPerSubscriptionCount(int freeSlotCount) {
        return 0;
    }

    @Override
    public void saveSubscription(long courseId, long studentId, int lessonCount, Subscription.SubscriptionStatus status) throws ServiceException {

    }

    @Override
    public boolean isNewCourseSubscriptionAvailable(long studentId, long courseId) throws ServiceException {
        return false;
    }

    @Override
    public Optional<Subscription> findContinuingActiveSubscriptionById(long subscriptionId) throws ServiceException {
        return Optional.empty();
    }

    @Override
    public void updateStatus(long subscriptionId, Subscription.SubscriptionStatus status) throws ServiceException {

    }

    @Override
    public int findPotentiallyBusySlotCountForCourse(long courseId) throws ServiceException {
        return 0;
    }
}
