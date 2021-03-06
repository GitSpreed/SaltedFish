package com.ping.greendao.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import hongzicong.saltedfish.model.EveryDayTask;
import hongzicong.saltedfish.model.OneDayTask;

import com.ping.greendao.gen.EveryDayTaskDao;
import com.ping.greendao.gen.OneDayTaskDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig everyDayTaskDaoConfig;
    private final DaoConfig oneDayTaskDaoConfig;

    private final EveryDayTaskDao everyDayTaskDao;
    private final OneDayTaskDao oneDayTaskDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        everyDayTaskDaoConfig = daoConfigMap.get(EveryDayTaskDao.class).clone();
        everyDayTaskDaoConfig.initIdentityScope(type);

        oneDayTaskDaoConfig = daoConfigMap.get(OneDayTaskDao.class).clone();
        oneDayTaskDaoConfig.initIdentityScope(type);

        everyDayTaskDao = new EveryDayTaskDao(everyDayTaskDaoConfig, this);
        oneDayTaskDao = new OneDayTaskDao(oneDayTaskDaoConfig, this);

        registerDao(EveryDayTask.class, everyDayTaskDao);
        registerDao(OneDayTask.class, oneDayTaskDao);
    }
    
    public void clear() {
        everyDayTaskDaoConfig.clearIdentityScope();
        oneDayTaskDaoConfig.clearIdentityScope();
    }

    public EveryDayTaskDao getEveryDayTaskDao() {
        return everyDayTaskDao;
    }

    public OneDayTaskDao getOneDayTaskDao() {
        return oneDayTaskDao;
    }

}
