package com.evmtv.epg.entity;

public class TUserWithBLOBs extends TUser {
    /**
	 * @field serialVersionUID
	 * @field_type long
	 */
	private static final long serialVersionUID = 294512226836740482L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.FRemark
     *
     * @mbggenerated Wed Jul 10 15:05:53 CST 2013
     */
    private String fremark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.FExpand
     *
     * @mbggenerated Wed Jul 10 15:05:53 CST 2013
     */
    private String fexpand;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.FRemark
     *
     * @return the value of t_user.FRemark
     *
     * @mbggenerated Wed Jul 10 15:05:53 CST 2013
     */
    public String getFremark() {
        return fremark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.FRemark
     *
     * @param fremark the value for t_user.FRemark
     *
     * @mbggenerated Wed Jul 10 15:05:53 CST 2013
     */
    public void setFremark(String fremark) {
        this.fremark = fremark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.FExpand
     *
     * @return the value of t_user.FExpand
     *
     * @mbggenerated Wed Jul 10 15:05:53 CST 2013
     */
    public String getFexpand() {
        return fexpand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.FExpand
     *
     * @param fexpand the value for t_user.FExpand
     *
     * @mbggenerated Wed Jul 10 15:05:53 CST 2013
     */
    public void setFexpand(String fexpand) {
        this.fexpand = fexpand;
    }
}