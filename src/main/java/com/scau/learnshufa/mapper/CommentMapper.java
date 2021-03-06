package com.scau.learnshufa.mapper;

import com.scau.learnshufa.entity.Comment;

import java.util.List;

public interface CommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_comment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long commentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_comment
     *
     * @mbg.generated
     */
    int insert(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_comment
     *
     * @mbg.generated
     */
    int insertSelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_comment
     *
     * @mbg.generated
     */
    Comment selectByPrimaryKey(Long commentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Comment record);

    /**
     * 查询所有的评论
     *
     * @return
     */
    List<Comment> selectComments();

    /**
     * 根据文章id查询评论
     * @param id
     * @return
     */
    Comment selectByArticleID(Long id);
}