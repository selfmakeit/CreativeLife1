package com.bs.create_life.base;

import java.util.List;

public interface BaseService<po extends BaseEntity> {

    List<po> enrich(List<po> pos);

    /**
     * 加强po
     *
     * @param po
     * @return
     */
    po enrich(po po);


}
