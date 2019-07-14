package com.bjd515.bjdxqs.model;

/**
 * @Classname User
 * @Description TODO User的model类
 * @Date 2018/10/8 14:18
 * @Created by zhaoyang
 */
public class User {

    private int seqId; //序号 唯一

    private String userCode; //用户编码 唯一

    private String userName; //用户名

    private String userPass; //用户密码

    private String realName; //角色名,备注：大致是管理员/普通用户

    private String tel; //电话

    private String officTel; //办公室电话

    private String email; //邮箱

    private String job; //职位

    private int roleGrade; //角色等级，大致是1/2/3

    private String createDate; //创建时间

    private int isEnable; //是否可用

    private String sDesc; //备注

    public User() {
    }

    public int getSeqId() {
        return seqId;
    }

    public String getUserCode() {
        return userCode;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public String getRealName() {
        return realName;
    }

    public String getTel() {
        return tel;
    }

    public String getOfficTel() {
        return officTel;
    }

    public String getEmail() {
        return email;
    }

    public String getJob() {
        return job;
    }

    public int getRoleGrade() {
        return roleGrade;
    }

    public String getCreateDate() {
        return createDate;
    }

    public int getIsEnable() {
        return isEnable;
    }

    public String getsDesc() {
        return sDesc;
    }

    public void setSeqId(int seqId) {
        this.seqId = seqId;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setOfficTel(String officTel) {
        this.officTel = officTel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setRoleGrade(int roleGrade) {
        this.roleGrade = roleGrade;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public void setIsEnable(int isEnable) {
        this.isEnable = isEnable;
    }

    public void setsDesc(String sDesc) {
        this.sDesc = sDesc;
    }
}
