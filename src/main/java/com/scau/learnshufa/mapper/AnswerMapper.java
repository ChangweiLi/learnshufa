package com.scau.learnshufa.mapper;

import com.scau.learnshufa.entity.Answer;

public interface AnswerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_answer
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_answer
     *
     * @mbg.generated
     */
    int insert(Answer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_answer
     *
     * @mbg.generated
     */
    int insertSelective(Answer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_answer
     *
     * @mbg.generated
     */
    Answer selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_answer
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Answer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_answer
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(Answer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_answer
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Answer record);
}