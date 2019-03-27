package .com.winter.model;


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
     * class CLASS.
     */
    private String class;
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
     * Set class CLASS.
     */
    public void setClass(String class){
        this.class = class;
    }

    /**
     * Get class CLASS.
     *
     * @return the string
     */
    public String getClass(){
        return class;
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
