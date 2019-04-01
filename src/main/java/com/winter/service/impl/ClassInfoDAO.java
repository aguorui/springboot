package com.winter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.winter.model.ClassInfoDO;
import java.util.List;
import com.winter.mapper.ClassInfoDOMapper;
import org.springframework.stereotype.Service;

/**
* The Table class_info.
* CLASS_INFO
*/
@Service
public class ClassInfoDAO{

    @Autowired
    private ClassInfoDOMapper classInfoDOMapper;

    /**
     * desc:插入表:class_info.<br/>
     * @param entity entity
     * @return Long
     */
    public Long insert(ClassInfoDO entity){
        return classInfoDOMapper.insert(entity);
    }
    /**
     * desc:批量插入表:class_info.<br/>
     * @param list list
     * @return Long
     */
    public Long insertBatch(List<ClassInfoDO> list){
        return classInfoDOMapper.insertBatch(list);
    }
    /**
     * desc:根据主键删除数据:class_info.<br/>
     * @param id id
     * @return Long
     */
    public Long deleteById(Long id){
        return classInfoDOMapper.deleteById(id);
    }
    /**
     * desc:根据主键获取数据:class_info.<br/>
     * @param id id
     * @return ClassInfoDO
     */
    public ClassInfoDO getById(Long id){
        return classInfoDOMapper.getById(id);
    }
}
