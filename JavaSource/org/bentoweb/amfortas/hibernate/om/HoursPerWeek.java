package org.bentoweb.amfortas.hibernate.om;

import java.util.Set;


/**
 * HoursPerWeek generated by hbm2java
 */

public class HoursPerWeek  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -7073929363385110913L;
	private Integer hoursPerWeekId;
     private String nameKey;
     private String nameDefault;
     private Set userProfiles;


    // Constructors

    /** default constructor */
    public HoursPerWeek() {
    }
    
    /** constructor with id */
    public HoursPerWeek(Integer hoursPerWeekId) {
        this.hoursPerWeekId = hoursPerWeekId;
    }

    

   
    // Property accessors

    public Integer getHoursPerWeekId() {
        return this.hoursPerWeekId;
    }
    
    public void setHoursPerWeekId(Integer hoursPerWeekId) {
        this.hoursPerWeekId = hoursPerWeekId;
    }

    public String getNameKey() {
        return this.nameKey;
    }
    
    public void setNameKey(String nameKey) {
        this.nameKey = nameKey;
    }

    public String getNameDefault() {
        return this.nameDefault;
    }
    
    public void setNameDefault(String nameDefault) {
        this.nameDefault = nameDefault;
    }

    public Set getUserProfiles() {
        return this.userProfiles;
    }
    
    public void setUserProfiles(Set userProfiles) {
        this.userProfiles = userProfiles;
    }
   








}