package com.winter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.winter.model.HappinessDO;
import java.util.List;
import com.winter.mapper.HappinessDOMapper;

/**
* The Table happiness.
* HAPPINESS
*/
@Repository
public class HappinessDAO{

    @Autowired
    private HappinessDOMapper happinessDOMapper;

    /**
     * desc:插入表:happiness.<br/>
     * @param entity entity
     * @return Long
     */
    public Long insert(HappinessDO entity){
        return happinessDOMapper.insert(entity);
    }
    /**
     * desc:批量插入表:happiness.<br/>
     * @param list list
     * @return Long
     */
    public Long insertBatch(List<HappinessDO> list){
        return happinessDOMapper.insertBatch(list);
    }
    /**
     * desc:根据主键删除数据:happiness.<br/>
     * @param id id
     * @return Long
     */
    public Long deleteById(Integer id){
        return happinessDOMapper.deleteById(id);
    }
    /**
     * desc:根据主键获取数据:happiness.<br/>
     * @param id id
     * @return HappinessDO
     */
    public HappinessDO getById(Integer id){
        return happinessDOMapper.getById(id);
    }
}
