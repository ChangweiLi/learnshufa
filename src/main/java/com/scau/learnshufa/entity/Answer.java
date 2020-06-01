package com.scau.learnshufa.entity;


import java.io.Serializable;

public class Answer implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_answer.ID
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_answer.questionid
     *
     * @mbg.generated
     */
    private Long questionid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_answer.parentid
     *
     * @mbg.generated
     */
    private Long parentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_answer.userid
     *
     * @mbg.generated
     */
    private Long userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_answer.answer_time
     *
     * @mbg.generated
     */
    private String answerTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_answer.readNum
     *
     * @mbg.generated
     */
    private Integer readnum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_answer.likes
     *
     * @mbg.generated
     */
    private Integer likes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_answer.text
     *
     * @mbg.generated
     */
    private String text;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sf_answer
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_answer.ID
     *
     * @return the value of sf_answer.ID
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_answer.ID
     *
     * @param id the value for sf_answer.ID
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_answer.questionid
     *
     * @return the value of sf_answer.questionid
     *
     * @mbg.generated
     */
    public Long getQuestionid() {
        return questionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_answer.questionid
     *
     * @param questionid the value for sf_answer.questionid
     *
     * @mbg.generated
     */
    public void setQuestionid(Long questionid) {
        this.questionid = questionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_answer.parentid
     *
     * @return the value of sf_answer.parentid
     *
     * @mbg.generated
     */
    public Long getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_answer.parentid
     *
     * @param parentid the value for sf_answer.parentid
     *
     * @mbg.generated
     */
    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_answer.userid
     *
     * @return the value of sf_answer.userid
     *
     * @mbg.generated
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_answer.userid
     *
     * @param userid the value for sf_answer.userid
     *
     * @mbg.generated
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_answer.answer_time
     *
     * @return the value of sf_answer.answer_time
     *
     * @mbg.generated
     */
    public String getAnswerTime() {
        return answerTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_answer.answer_time
     *
     * @param answerTime the value for sf_answer.answer_time
     *
     * @mbg.generated
     */
    public void setAnswerTime(String answerTime) {
        this.answerTime = answerTime == null ? null : answerTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_answer.readNum
     *
     * @return the value of sf_answer.readNum
     *
     * @mbg.generated
     */
    public Integer getReadnum() {
        return readnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_answer.readNum
     *
     * @param readnum the value for sf_answer.readNum
     *
     * @mbg.generated
     */
    public void setReadnum(Integer readnum) {
        this.readnum = readnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_answer.likes
     *
     * @return the value of sf_answer.likes
     *
     * @mbg.generated
     */
    public Integer getLikes() {
        return likes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_answer.likes
     *
     * @param likes the value for sf_answer.likes
     *
     * @mbg.generated
     */
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_answer.text
     *
     * @return the value of sf_answer.text
     *
     * @mbg.generated
     */
    public String getText() {
        return text;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_answer.text
     *
     * @param text the value for sf_answer.text
     *
     * @mbg.generated
     */
    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_answer
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", questionid=").append(questionid);
        sb.append(", parentid=").append(parentid);
        sb.append(", userid=").append(userid);
        sb.append(", answerTime=").append(answerTime);
        sb.append(", readnum=").append(readnum);
        sb.append(", likes=").append(likes);
        sb.append(", text=").append(text);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_answer
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Answer other = (Answer) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getQuestionid() == null ? other.getQuestionid() == null : this.getQuestionid().equals(other.getQuestionid()))
                && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
                && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
                && (this.getAnswerTime() == null ? other.getAnswerTime() == null : this.getAnswerTime().equals(other.getAnswerTime()))
                && (this.getReadnum() == null ? other.getReadnum() == null : this.getReadnum().equals(other.getReadnum()))
                && (this.getLikes() == null ? other.getLikes() == null : this.getLikes().equals(other.getLikes()))
                && (this.getText() == null ? other.getText() == null : this.getText().equals(other.getText()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_answer
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getQuestionid() == null) ? 0 : getQuestionid().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getAnswerTime() == null) ? 0 : getAnswerTime().hashCode());
        result = prime * result + ((getReadnum() == null) ? 0 : getReadnum().hashCode());
        result = prime * result + ((getLikes() == null) ? 0 : getLikes().hashCode());
        result = prime * result + ((getText() == null) ? 0 : getText().hashCode());
        return result;
    }
}