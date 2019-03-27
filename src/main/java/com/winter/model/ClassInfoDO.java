package com.winter.model;


/**
 * The table CLASS_INFO
 */
public class ClassInfoDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * score SCORE.
     */
    private Long score;
    /**
     * classFor CLASS_FOR.
     */
    private String classFor;
    /**
     * userName USER_NAME.
     */
    private String userName;

    /**
     * Set id ID.
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * Get id ID.
     *
     * @return the string
     */
    public Long getId(){
        return id;
    }

    /**
     * Set score SCORE.
     */
    public void setScore(Long score){
        this.score = score;
    }

    /**
     * Get score SCORE.
     *
     * @return the string
     */
    public Long getScore(){
        return score;
    }

    /**
     * Set classFor CLASS_FOR.
     */
    public void setClassFor(String classFor){
        this.classFor = classFor;
    }

    /**
     * Get classFor CLASS_FOR.
     *
     * @return the string
     */
    public String getClassFor(){
        return classFor;
    }

    /**
     * Set userName USER_NAME.
     */
    public void setUserName(String userName){
        this.userName = userName;
    }

    /**
     * Get userName USER_NAME.
     *
     * @return the string
     */
    public String getUserName(){
        return userName;
    }
}
