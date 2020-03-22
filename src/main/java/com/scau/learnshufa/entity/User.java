package com.scau.learnshufa.entity;

import java.io.Serializable;

public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_user.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_user.role_id
     *
     * @mbg.generated
     */
    private Long roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_user.user_ip
     *
     * @mbg.generated
     */
    private String userIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_user.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_user.user_alias
     *
     * @mbg.generated
     */
    private String userAlias;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_user.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_user.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_user.photo
     *
     * @mbg.generated
     */
    private String photo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_user.register_data
     *
     * @mbg.generated
     */
    private String registerData;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_user.birthday
     *
     * @mbg.generated
     */
    private String birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_user.age
     *
     * @mbg.generated
     */
    private String age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_user.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_user.backup
     *
     * @mbg.generated
     */
    private String backup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sf_user
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    public User(long l, long l1, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10) {
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_user.user_id
     *
     * @return the value of sf_user.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_user.user_id
     *
     * @param userId the value for sf_user.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_user.role_id
     *
     * @return the value of sf_user.role_id
     *
     * @mbg.generated
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_user.role_id
     *
     * @param roleId the value for sf_user.role_id
     *
     * @mbg.generated
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_user.user_ip
     *
     * @return the value of sf_user.user_ip
     *
     * @mbg.generated
     */
    public String getUserIp() {
        return userIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_user.user_ip
     *
     * @param userIp the value for sf_user.user_ip
     *
     * @mbg.generated
     */
    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_user.user_name
     *
     * @return the value of sf_user.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_user.user_name
     *
     * @param userName the value for sf_user.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_user.user_alias
     *
     * @return the value of sf_user.user_alias
     *
     * @mbg.generated
     */
    public String getUserAlias() {
        return userAlias;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_user.user_alias
     *
     * @param userAlias the value for sf_user.user_alias
     *
     * @mbg.generated
     */
    public void setUserAlias(String userAlias) {
        this.userAlias = userAlias == null ? null : userAlias.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_user.password
     *
     * @return the value of sf_user.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_user.password
     *
     * @param password the value for sf_user.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_user.email
     *
     * @return the value of sf_user.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_user.email
     *
     * @param email the value for sf_user.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_user.photo
     *
     * @return the value of sf_user.photo
     *
     * @mbg.generated
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_user.photo
     *
     * @param photo the value for sf_user.photo
     *
     * @mbg.generated
     */
    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_user.register_data
     *
     * @return the value of sf_user.register_data
     *
     * @mbg.generated
     */
    public String getRegisterData() {
        return registerData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_user.register_data
     *
     * @param registerData the value for sf_user.register_data
     *
     * @mbg.generated
     */
    public void setRegisterData(String registerData) {
        this.registerData = registerData == null ? null : registerData.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_user.birthday
     *
     * @return the value of sf_user.birthday
     *
     * @mbg.generated
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_user.birthday
     *
     * @param birthday the value for sf_user.birthday
     *
     * @mbg.generated
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_user.age
     *
     * @return the value of sf_user.age
     *
     * @mbg.generated
     */
    public String getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_user.age
     *
     * @param age the value for sf_user.age
     *
     * @mbg.generated
     */
    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_user.phone
     *
     * @return the value of sf_user.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_user.phone
     *
     * @param phone the value for sf_user.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_user.backup
     *
     * @return the value of sf_user.backup
     *
     * @mbg.generated
     */
    public String getBackup() {
        return backup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_user.backup
     *
     * @param backup the value for sf_user.backup
     *
     * @mbg.generated
     */
    public void setBackup(String backup) {
        this.backup = backup == null ? null : backup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_user
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", roleId=").append(roleId);
        sb.append(", userIp=").append(userIp);
        sb.append(", userName=").append(userName);
        sb.append(", userAlias=").append(userAlias);
        sb.append(", password=").append(password);
        sb.append(", email=").append(email);
        sb.append(", photo=").append(photo);
        sb.append(", registerData=").append(registerData);
        sb.append(", birthday=").append(birthday);
        sb.append(", age=").append(age);
        sb.append(", phone=").append(phone);
        sb.append(", backup=").append(backup);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_user
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
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getUserIp() == null ? other.getUserIp() == null : this.getUserIp().equals(other.getUserIp()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserAlias() == null ? other.getUserAlias() == null : this.getUserAlias().equals(other.getUserAlias()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPhoto() == null ? other.getPhoto() == null : this.getPhoto().equals(other.getPhoto()))
            && (this.getRegisterData() == null ? other.getRegisterData() == null : this.getRegisterData().equals(other.getRegisterData()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getBackup() == null ? other.getBackup() == null : this.getBackup().equals(other.getBackup()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_user
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getUserIp() == null) ? 0 : getUserIp().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserAlias() == null) ? 0 : getUserAlias().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPhoto() == null) ? 0 : getPhoto().hashCode());
        result = prime * result + ((getRegisterData() == null) ? 0 : getRegisterData().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getBackup() == null) ? 0 : getBackup().hashCode());
        return result;
    }
}