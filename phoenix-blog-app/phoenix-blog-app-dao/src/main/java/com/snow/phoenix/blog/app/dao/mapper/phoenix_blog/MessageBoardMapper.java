package com.snow.phoenix.blog.app.dao.mapper.phoenix_blog;

import com.snow.phoenix.blog.app.core.model.phoenix_blog.MessageBoard;
import com.snow.phoenix.blog.app.core.model.phoenix_blog.MessageBoardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageBoardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..message_board
     *
     * @mbggenerated
     */
    int countByExample(MessageBoardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..message_board
     *
     * @mbggenerated
     */
    int deleteByExample(MessageBoardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..message_board
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..message_board
     *
     * @mbggenerated
     */
    int insert(MessageBoard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..message_board
     *
     * @mbggenerated
     */
    int insertSelective(MessageBoard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..message_board
     *
     * @mbggenerated
     */
    List<MessageBoard> selectByExample(MessageBoardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..message_board
     *
     * @mbggenerated
     */
    MessageBoard selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..message_board
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MessageBoard record, @Param("example") MessageBoardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..message_board
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MessageBoard record, @Param("example") MessageBoardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..message_board
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MessageBoard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..message_board
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MessageBoard record);
}