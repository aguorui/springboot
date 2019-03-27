package com.winter.model;


/**
 * The table HAPPINESS
 */
public class HappinessDO{

    /**
     * id ID.
     */
    private Integer id;
    /**
     * city CITY.
     */
    private String city;
    /**
     * num NUM.
     */
    private Integer num;

    /**
     * Set id ID.
     */
    public void setId(Integer id){
        this.id = id;
    }

    /**
     * Get id ID.
     *
     * @return the string
     */
    public Integer getId(){
        return id;
    }

    /**
     * Set city CITY.
     */
    public void setCity(String city){
        this.city = city;
    }

    /**
     * Get city CITY.
     *
     * @return the string
     */
    public String getCity(){
        return city;
    }

    /**
     * Set num NUM.
     */
    public void setNum(Integer num){
        this.num = num;
    }

    /**
     * Get num NUM.
     *
     * @return the string
     */
    public Integer getNum(){
        return num;
    }
}
