package org.rmall.action5;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017-03-14.
 */
@Component
public class OracleDaoImpl implements IDbDao {
    @Override
    public String getFactory() {
        return "i am a oracle implement";
    }
}
