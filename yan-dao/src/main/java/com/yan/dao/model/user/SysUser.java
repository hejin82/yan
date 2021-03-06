package com.yan.dao.model.user;

import java.io.Serializable;
import java.util.Date;

public class SysUser extends SysUserKey implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.USER_NAME
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.USER_PASSWORD
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    private String userPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.USER_ADDRESS
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    private String userAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.USER_EMAIL
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    private String userEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.USER_PHONE
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    private String userPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.USER_BIRTHDAY
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    private Date userBirthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.USER_JOINDATE
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    private Date userJoindate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.USER_PHOTO
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    private String userPhoto;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.USER_TYPE
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    private String userType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.USER_VALID
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    private Boolean userValid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SYS_USER
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.USER_NAME
     *
     * @return the value of SYS_USER.USER_NAME
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.USER_NAME
     *
     * @param userName the value for SYS_USER.USER_NAME
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.USER_PASSWORD
     *
     * @return the value of SYS_USER.USER_PASSWORD
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.USER_PASSWORD
     *
     * @param userPassword the value for SYS_USER.USER_PASSWORD
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.USER_ADDRESS
     *
     * @return the value of SYS_USER.USER_ADDRESS
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.USER_ADDRESS
     *
     * @param userAddress the value for SYS_USER.USER_ADDRESS
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.USER_EMAIL
     *
     * @return the value of SYS_USER.USER_EMAIL
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.USER_EMAIL
     *
     * @param userEmail the value for SYS_USER.USER_EMAIL
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.USER_PHONE
     *
     * @return the value of SYS_USER.USER_PHONE
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.USER_PHONE
     *
     * @param userPhone the value for SYS_USER.USER_PHONE
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.USER_BIRTHDAY
     *
     * @return the value of SYS_USER.USER_BIRTHDAY
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    public Date getUserBirthday() {
        return userBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.USER_BIRTHDAY
     *
     * @param userBirthday the value for SYS_USER.USER_BIRTHDAY
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.USER_JOINDATE
     *
     * @return the value of SYS_USER.USER_JOINDATE
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    public Date getUserJoindate() {
        return userJoindate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.USER_JOINDATE
     *
     * @param userJoindate the value for SYS_USER.USER_JOINDATE
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    public void setUserJoindate(Date userJoindate) {
        this.userJoindate = userJoindate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.USER_PHOTO
     *
     * @return the value of SYS_USER.USER_PHOTO
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    public String getUserPhoto() {
        return userPhoto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.USER_PHOTO
     *
     * @param userPhoto the value for SYS_USER.USER_PHOTO
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto == null ? null : userPhoto.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.USER_TYPE
     *
     * @return the value of SYS_USER.USER_TYPE
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    public String getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.USER_TYPE
     *
     * @param userType the value for SYS_USER.USER_TYPE
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.USER_VALID
     *
     * @return the value of SYS_USER.USER_VALID
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    public Boolean getUserValid() {
        return userValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.USER_VALID
     *
     * @param userValid the value for SYS_USER.USER_VALID
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    public void setUserValid(Boolean userValid) {
        this.userValid = userValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER
     *
     * @mbg.generated Thu Sep 14 18:04:32 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userName=").append(userName);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userAddress=").append(userAddress);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userBirthday=").append(userBirthday);
        sb.append(", userJoindate=").append(userJoindate);
        sb.append(", userPhoto=").append(userPhoto);
        sb.append(", userType=").append(userType);
        sb.append(", userValid=").append(userValid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}