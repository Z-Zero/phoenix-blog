package com.snow.phoenix.blog.app.dao.mapper.phoenix_blog;

import com.snow.phoenix.blog.app.core.model.phoenix_blog.UserDetail;
import com.snow.phoenix.blog.app.core.model.phoenix_blog.UserDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..user_detail
     *
     * @mbggenerated
     */
    int countByExample(UserDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..user_detail
     *
     * @mbggenerated
     */
    int deleteByExample(UserDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..user_detail
     *
     * @mbggenerated
     */
    int insert(UserDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..user_detail
     *
     * @mbggenerated
     */
    int insertSelective(UserDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..user_detail
     *
     * @mbggenerated
     */
    List<UserDetail> selectByExample(UserDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..user_detail
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserDetail record, @Param("example") UserDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..user_detail
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserDetail record, @Param("example") UserDetailExample example);
}