package com.firstbbs.dao;

import com.firstbbs.model.Reply;

public interface ReplyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reply
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer replyId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reply
     *
     * @mbggenerated
     */
    int insert(Reply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reply
     *
     * @mbggenerated
     */
    int insertSelective(Reply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reply
     *
     * @mbggenerated
     */
    Reply selectByPrimaryKey(Integer replyId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reply
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Reply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reply
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Reply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reply
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Reply record);
}