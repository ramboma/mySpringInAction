package org.rmall.action5;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017-03-13.
 */
@Component
public class MySqlDaoImpl implements IDbDao{
    @Override
    public String getFactory() {
        return "i am a mysql Dao Implement";
    }
}
