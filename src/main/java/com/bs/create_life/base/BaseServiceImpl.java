package com.bs.create_life.base;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseServiceImpl<po extends BaseEntity, mapper extends BaseMapper<po>> implements BaseService<po> {


    public abstract void setMapper(mapper m);


    /**
     * 后代类必须覆盖该方法
     *
     * @param po
     * @return
     */
    public po enrich(po po) {
        return null;
    }

    @Override
    public List<po> enrich(List<po> pos) {
        List<po> list = new ArrayList<>();
        for (po p : pos) {
            po enrich = enrich(p);
            list.add(enrich);
        }
        return list;
    }

}
