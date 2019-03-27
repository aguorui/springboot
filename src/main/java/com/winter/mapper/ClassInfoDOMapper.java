package .com.winter.mapper;

import .com.winter.model.ClassInfoDO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table class_info.
 * CLASS_INFO
 */
public interface ClassInfoDOMapper{

    /**
     * desc:插入表:class_info.<br/>
     * descSql =  SELECT LAST_INSERT_ID() <![CDATA[ INSERT INTO class_info( ID ,SCORE ,CLASS ,USER_NAME )VALUES( null , #{score,jdbcType=DECIMAL} , #{class,jdbcType=VARCHAR} , #{userName,jdbcType=VARCHAR} ) ]]>
     * @param entity entity
     * @return Long
     */
    Long insert(ClassInfoDO entity);
    /**
     * desc:批量插入表:class_info.<br/>
     * descSql =  INSERT INTO class_info( ID ,SCORE ,CLASS ,USER_NAME )VALUES ( null , #{item.score,jdbcType=DECIMAL} , #{item.class,jdbcType=VARCHAR} , #{item.userName,jdbcType=VARCHAR} ) 
     * @param list list
     * @return Long
     */
    Long insertBatch(List<ClassInfoDO> list);
    /**
     * desc:根据主键删除数据:class_info.<br/>
     * descSql =  <![CDATA[ DELETE FROM class_info WHERE ID = #{id,jdbcType=BIGINT} ]]>
     * @param id id
     * @return Long
     */
    Long deleteById(Long id);
    /**
     * desc:根据主键获取数据:class_info.<br/>
     * descSql =  SELECT * FROM class_info WHERE <![CDATA[ ID = #{id,jdbcType=BIGINT} ]]>
     * @param id id
     * @return ClassInfoDO
     */
    ClassInfoDO getById(Long id);
}
