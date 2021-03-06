package com.scau.learnshufa.entity;

import java.io.Serializable;

public class Penman implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_penman.ID
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_penman.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_penman.sex
     *
     * @mbg.generated
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_penman.decade
     *
     * @mbg.generated
     */
    private String decade;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_penman.birthdate
     *
     * @mbg.generated
     */
    private String birthdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_penman.about
     *
     * @mbg.generated
     */
    private String about;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_penman.birthplace
     *
     * @mbg.generated
     */
    private String birthplace;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_penman.job
     *
     * @mbg.generated
     */
    private String job;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_penman.achievement
     *
     * @mbg.generated
     */
    private String achievement;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_penman.works
     *
     * @mbg.generated
     */
    private String works;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_penman.tel
     *
     * @mbg.generated
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_penman.introduction
     *
     * @mbg.generated
     */
    private String introduction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sf_penman
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_penman.ID
     *
     * @return the value of sf_penman.ID
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_penman.ID
     *
     * @param id the value for sf_penman.ID
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_penman.name
     *
     * @return the value of sf_penman.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_penman.name
     *
     * @param name the value for sf_penman.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_penman.sex
     *
     * @return the value of sf_penman.sex
     *
     * @mbg.generated
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_penman.sex
     *
     * @param sex the value for sf_penman.sex
     *
     * @mbg.generated
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_penman.decade
     *
     * @return the value of sf_penman.decade
     *
     * @mbg.generated
     */
    public String getDecade() {
        return decade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_penman.decade
     *
     * @param decade the value for sf_penman.decade
     *
     * @mbg.generated
     */
    public void setDecade(String decade) {
        this.decade = decade == null ? null : decade.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_penman.birthdate
     *
     * @return the value of sf_penman.birthdate
     *
     * @mbg.generated
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_penman.birthdate
     *
     * @param birthdate the value for sf_penman.birthdate
     *
     * @mbg.generated
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate == null ? null : birthdate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_penman.about
     *
     * @return the value of sf_penman.about
     *
     * @mbg.generated
     */
    public String getAbout() {
        return about;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_penman.about
     *
     * @param about the value for sf_penman.about
     *
     * @mbg.generated
     */
    public void setAbout(String about) {
        this.about = about == null ? null : about.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_penman.birthplace
     *
     * @return the value of sf_penman.birthplace
     *
     * @mbg.generated
     */
    public String getBirthplace() {
        return birthplace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_penman.birthplace
     *
     * @param birthplace the value for sf_penman.birthplace
     *
     * @mbg.generated
     */
    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace == null ? null : birthplace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_penman.job
     *
     * @return the value of sf_penman.job
     *
     * @mbg.generated
     */
    public String getJob() {
        return job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_penman.job
     *
     * @param job the value for sf_penman.job
     *
     * @mbg.generated
     */
    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_penman.achievement
     *
     * @return the value of sf_penman.achievement
     *
     * @mbg.generated
     */
    public String getAchievement() {
        return achievement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_penman.achievement
     *
     * @param achievement the value for sf_penman.achievement
     *
     * @mbg.generated
     */
    public void setAchievement(String achievement) {
        this.achievement = achievement == null ? null : achievement.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_penman.works
     *
     * @return the value of sf_penman.works
     *
     * @mbg.generated
     */
    public String getWorks() {
        return works;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_penman.works
     *
     * @param works the value for sf_penman.works
     *
     * @mbg.generated
     */
    public void setWorks(String works) {
        this.works = works == null ? null : works.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_penman.tel
     *
     * @return the value of sf_penman.tel
     *
     * @mbg.generated
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_penman.tel
     *
     * @param tel the value for sf_penman.tel
     *
     * @mbg.generated
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_penman.introduction
     *
     * @return the value of sf_penman.introduction
     *
     * @mbg.generated
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_penman.introduction
     *
     * @param introduction the value for sf_penman.introduction
     *
     * @mbg.generated
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_penman
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
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", decade=").append(decade);
        sb.append(", birthdate=").append(birthdate);
        sb.append(", about=").append(about);
        sb.append(", birthplace=").append(birthplace);
        sb.append(", job=").append(job);
        sb.append(", achievement=").append(achievement);
        sb.append(", works=").append(works);
        sb.append(", tel=").append(tel);
        sb.append(", introduction=").append(introduction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_penman
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
        Penman other = (Penman) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getDecade() == null ? other.getDecade() == null : this.getDecade().equals(other.getDecade()))
            && (this.getBirthdate() == null ? other.getBirthdate() == null : this.getBirthdate().equals(other.getBirthdate()))
            && (this.getAbout() == null ? other.getAbout() == null : this.getAbout().equals(other.getAbout()))
            && (this.getBirthplace() == null ? other.getBirthplace() == null : this.getBirthplace().equals(other.getBirthplace()))
            && (this.getJob() == null ? other.getJob() == null : this.getJob().equals(other.getJob()))
            && (this.getAchievement() == null ? other.getAchievement() == null : this.getAchievement().equals(other.getAchievement()))
            && (this.getWorks() == null ? other.getWorks() == null : this.getWorks().equals(other.getWorks()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getIntroduction() == null ? other.getIntroduction() == null : this.getIntroduction().equals(other.getIntroduction()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_penman
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getDecade() == null) ? 0 : getDecade().hashCode());
        result = prime * result + ((getBirthdate() == null) ? 0 : getBirthdate().hashCode());
        result = prime * result + ((getAbout() == null) ? 0 : getAbout().hashCode());
        result = prime * result + ((getBirthplace() == null) ? 0 : getBirthplace().hashCode());
        result = prime * result + ((getJob() == null) ? 0 : getJob().hashCode());
        result = prime * result + ((getAchievement() == null) ? 0 : getAchievement().hashCode());
        result = prime * result + ((getWorks() == null) ? 0 : getWorks().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getIntroduction() == null) ? 0 : getIntroduction().hashCode());
        return result;
    }
}