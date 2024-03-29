package com.wyz.mapper.estore;

import com.wyz.entity.estore.Template;
import com.wyz.entity.estore.TemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_template
     *
     * @mbggenerated Sat Apr 14 10:14:08 CST 2012
     */
    @SelectProvider(type=TemplateSqlProvider.class, method="countByExample")
    int countByExample(TemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_template
     *
     * @mbggenerated Sat Apr 14 10:14:08 CST 2012
     */
    @DeleteProvider(type=TemplateSqlProvider.class, method="deleteByExample")
    int deleteByExample(TemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_template
     *
     * @mbggenerated Sat Apr 14 10:14:08 CST 2012
     */
    @Delete({
        "delete from t_template",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_template
     *
     * @mbggenerated Sat Apr 14 10:14:08 CST 2012
     */
    @Insert({
        "insert into t_template (C1, C2, ",
        "C3, C4, C5)",
        "values (#{c1,jdbcType=VARCHAR}, #{c2,jdbcType=VARCHAR}, ",
        "#{c3,jdbcType=VARCHAR}, #{c4,jdbcType=VARCHAR}, #{c5,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(Template record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_template
     *
     * @mbggenerated Sat Apr 14 10:14:08 CST 2012
     */
    @InsertProvider(type=TemplateSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(Template record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_template
     *
     * @mbggenerated Sat Apr 14 10:14:08 CST 2012
     */
    @SelectProvider(type=TemplateSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="C1", property="c1", jdbcType=JdbcType.VARCHAR),
        @Result(column="C2", property="c2", jdbcType=JdbcType.VARCHAR),
        @Result(column="C3", property="c3", jdbcType=JdbcType.VARCHAR),
        @Result(column="C4", property="c4", jdbcType=JdbcType.VARCHAR),
        @Result(column="C5", property="c5", jdbcType=JdbcType.VARCHAR)
    })
    List<Template> selectByExample(TemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_template
     *
     * @mbggenerated Sat Apr 14 10:14:08 CST 2012
     */
    @Select({
        "select",
        "id, C1, C2, C3, C4, C5",
        "from t_template",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="C1", property="c1", jdbcType=JdbcType.VARCHAR),
        @Result(column="C2", property="c2", jdbcType=JdbcType.VARCHAR),
        @Result(column="C3", property="c3", jdbcType=JdbcType.VARCHAR),
        @Result(column="C4", property="c4", jdbcType=JdbcType.VARCHAR),
        @Result(column="C5", property="c5", jdbcType=JdbcType.VARCHAR)
    })
    Template selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_template
     *
     * @mbggenerated Sat Apr 14 10:14:08 CST 2012
     */
    @UpdateProvider(type=TemplateSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Template record, @Param("example") TemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_template
     *
     * @mbggenerated Sat Apr 14 10:14:08 CST 2012
     */
    @UpdateProvider(type=TemplateSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Template record, @Param("example") TemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_template
     *
     * @mbggenerated Sat Apr 14 10:14:08 CST 2012
     */
    @UpdateProvider(type=TemplateSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Template record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_template
     *
     * @mbggenerated Sat Apr 14 10:14:08 CST 2012
     */
    @Update({
        "update t_template",
        "set C1 = #{c1,jdbcType=VARCHAR},",
          "C2 = #{c2,jdbcType=VARCHAR},",
          "C3 = #{c3,jdbcType=VARCHAR},",
          "C4 = #{c4,jdbcType=VARCHAR},",
          "C5 = #{c5,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Template record);
}