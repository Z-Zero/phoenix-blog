package com.snow.phoenix.blog.app.core.model.phoenix_blog;

import java.util.Date;

public class Blog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phoenix_blog..blog.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phoenix_blog..blog.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phoenix_blog..blog.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phoenix_blog..blog.introduce
     *
     * @mbggenerated
     */
    private String introduce;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phoenix_blog..blog.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phoenix_blog..blog.type
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phoenix_blog..blog.read_sum
     *
     * @mbggenerated
     */
    private Integer readSum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phoenix_blog..blog.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phoenix_blog..blog.deleted
     *
     * @mbggenerated
     */
    private Boolean deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phoenix_blog..blog.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phoenix_blog..blog.id
     *
     * @return the value of phoenix_blog..blog.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phoenix_blog..blog.id
     *
     * @param id the value for phoenix_blog..blog.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phoenix_blog..blog.user_id
     *
     * @return the value of phoenix_blog..blog.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phoenix_blog..blog.user_id
     *
     * @param userId the value for phoenix_blog..blog.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phoenix_blog..blog.title
     *
     * @return the value of phoenix_blog..blog.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phoenix_blog..blog.title
     *
     * @param title the value for phoenix_blog..blog.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phoenix_blog..blog.introduce
     *
     * @return the value of phoenix_blog..blog.introduce
     *
     * @mbggenerated
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phoenix_blog..blog.introduce
     *
     * @param introduce the value for phoenix_blog..blog.introduce
     *
     * @mbggenerated
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phoenix_blog..blog.content
     *
     * @return the value of phoenix_blog..blog.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phoenix_blog..blog.content
     *
     * @param content the value for phoenix_blog..blog.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phoenix_blog..blog.type
     *
     * @return the value of phoenix_blog..blog.type
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phoenix_blog..blog.type
     *
     * @param type the value for phoenix_blog..blog.type
     *
     * @mbggenerated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phoenix_blog..blog.read_sum
     *
     * @return the value of phoenix_blog..blog.read_sum
     *
     * @mbggenerated
     */
    public Integer getReadSum() {
        return readSum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phoenix_blog..blog.read_sum
     *
     * @param readSum the value for phoenix_blog..blog.read_sum
     *
     * @mbggenerated
     */
    public void setReadSum(Integer readSum) {
        this.readSum = readSum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phoenix_blog..blog.create_time
     *
     * @return the value of phoenix_blog..blog.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phoenix_blog..blog.create_time
     *
     * @param createTime the value for phoenix_blog..blog.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phoenix_blog..blog.deleted
     *
     * @return the value of phoenix_blog..blog.deleted
     *
     * @mbggenerated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phoenix_blog..blog.deleted
     *
     * @param deleted the value for phoenix_blog..blog.deleted
     *
     * @mbggenerated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phoenix_blog..blog.update_time
     *
     * @return the value of phoenix_blog..blog.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phoenix_blog..blog.update_time
     *
     * @param updateTime the value for phoenix_blog..blog.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}