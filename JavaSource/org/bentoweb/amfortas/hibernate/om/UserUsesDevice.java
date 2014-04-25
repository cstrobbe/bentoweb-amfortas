package org.bentoweb.amfortas.hibernate.om;

import java.util.Set;


/**
 * UserUsesDevice generated by hbm2java
 */

public class UserUsesDevice  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -4423212348345930882L;
	private Integer userUsesDeviceId;
     private AtExperience atExperience;
     private Device device;
     private String deviceOther;
     private Set testProfiles;


    // Constructors

    /** default constructor */
    public UserUsesDevice() {
    }
    
    /** constructor with id */
    public UserUsesDevice(Integer userUsesDeviceId) {
        this.userUsesDeviceId = userUsesDeviceId;
    }

    

   
    // Property accessors

    public Integer getUserUsesDeviceId() {
        return this.userUsesDeviceId;
    }
    
    public void setUserUsesDeviceId(Integer userUsesDeviceId) {
        this.userUsesDeviceId = userUsesDeviceId;
    }

    public AtExperience getAtExperience() {
        return this.atExperience;
    }
    
    public void setAtExperience(AtExperience atExperience) {
        this.atExperience = atExperience;
    }

    public Device getDevice() {
        return this.device;
    }
    
    public void setDevice(Device device) {
        this.device = device;
    }

    public String getDeviceOther() {
        return this.deviceOther;
    }
    
    public void setDeviceOther(String deviceOther) {
        this.deviceOther = deviceOther;
    }

    public Set getTestProfiles() {
        return this.testProfiles;
    }
    
    public void setTestProfiles(Set testProfiles) {
        this.testProfiles = testProfiles;
    }
   








}