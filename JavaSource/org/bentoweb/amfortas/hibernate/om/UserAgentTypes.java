package org.bentoweb.amfortas.hibernate.om;

import java.util.Set;


/**
 * UserAgentTypes generated by hbm2java
 */

public class UserAgentTypes  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -3713697221818069394L;
	private Integer userAgentTypesId;
     private String nameKey;
     private String nameDefault;
     private Set userAgents;


    // Constructors

    /** default constructor */
    public UserAgentTypes() {
    }
    
    /** constructor with id */
    public UserAgentTypes(Integer userAgentTypesId) {
        this.userAgentTypesId = userAgentTypesId;
    }

    

   
    // Property accessors

    public Integer getUserAgentTypesId() {
        return this.userAgentTypesId;
    }
    
    public void setUserAgentTypesId(Integer userAgentTypesId) {
        this.userAgentTypesId = userAgentTypesId;
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

    public Set getUserAgents() {
        return this.userAgents;
    }
    
    public void setUserAgents(Set userAgents) {
        this.userAgents = userAgents;
    }
   








}