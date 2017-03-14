package org.rmall.action5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017-03-13.
 */
@Component
public class UsProjectManager implements IProductManager {

    private IDbDao dao;
    public IDbDao getDao() {
        return dao;
    }
    @Autowired
    @Qualifier("daoImpl")
    public void setDao(IDbDao dao) {
        this.dao = dao;
    }
    @Override
    public product showMaxProduct() {
        product p=new product();
        p.setId(1);
        p.setName(dao.getFactory());
        return  p;
    }
}
