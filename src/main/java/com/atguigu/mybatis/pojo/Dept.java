package com.atguigu.mybatis.pojo;

public class Dept {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.did
     *
     * @mbggenerated Wed Apr 20 21:17:57 CST 2022
     */
    private int did;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.dname
     *
     * @mbggenerated Wed Apr 20 21:17:57 CST 2022
     */
    private String dname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.did
     *
     * @return the value of dept.did
     *
     * @mbggenerated Wed Apr 20 21:17:57 CST 2022
     */
    public Integer getDid() {
        return did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.did
     *
     * @param did the value for dept.did
     *
     * @mbggenerated Wed Apr 20 21:17:57 CST 2022
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.dname
     *
     * @return the value of dept.dname
     *
     * @mbggenerated Wed Apr 20 21:17:57 CST 2022
     */
    public String getDname() {
        return dname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.dname
     *
     * @param dname the value for dept.dname
     *
     * @mbggenerated Wed Apr 20 21:17:57 CST 2022
     */
    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }
}