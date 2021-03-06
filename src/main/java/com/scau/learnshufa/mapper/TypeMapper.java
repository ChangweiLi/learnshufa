package com.scau.learnshufa.mapper;

import com.scau.learnshufa.entity.Type;

import java.util.List;

public interface TypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_type
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_type
     *
     * @mbg.generated
     */
    int insert(Type record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_type
     *
     * @mbg.generated
     */
    int insertSelective(Type record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_type
     *
     * @mbg.generated
     */
    Type selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Type record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Type record);

    /**
     * 查找所有的书法分类
     * @return
     */
    List<Type> selectTypes();
}