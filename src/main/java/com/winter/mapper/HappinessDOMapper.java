package com.winter.mapper;

import com.winter.model.HappinessDO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table happiness.
 * HAPPINESS
 */
public interface HappinessDOMapper{

    /**
     * desc:插入表:happiness.<br/>
     * descSql =  SELECT LAST_INSERT_ID() <![CDATA[ INSERT INTO happiness( ID ,CITY ,NUM )VALUES( null , #{city,jdbcType=VARCHAR} , #{num,jdbcType=INTEGER} ) ]]>
     * @param entity entity
     * @return Long
     */
    Long insert(HappinessDO entity);
    /**
     * desc:批量插入表:happiness.<br/>
     * descSql =  INSERT INTO happiness( ID ,CITY ,NUM )VALUES ( null , #{item.city,jdbcType=VARCHAR} , #{item.num,jdbcType=INTEGER} ) 
     * @param list list
     * @return Long
     */
    Long insertBatch(List<HappinessDO> list);
    /**
     * desc:根据主键删除数据:happiness.<br/>
     * descSql =  <![CDATA[ DELETE FROM happiness WHERE ID = #{id,jdbcType=INTEGER} ]]>
     * @param id id
     * @return Long
     */
    Long deleteById(Integer id);
    /**
     * desc:根据主键获取数据:happiness.<br/>
     * descSql =  SELECT * FROM happiness WHERE <![CDATA[ ID = #{id,jdbcType=INTEGER} ]]>
     * @param id id
     * @return HappinessDO
     */
    HappinessDO getById(Integer id);
}
