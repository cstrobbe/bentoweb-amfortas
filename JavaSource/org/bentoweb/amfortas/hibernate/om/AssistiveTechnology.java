package org.bentoweb.amfortas.hibernate.om;

import java.util.Set;


/**
 * AssistiveTechnology generated by hbm2java
 */

public class AssistiveTechnology  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -675512350770866813L;
	private Integer assistiveTechnologyId;
     private AssistiveTechnologyTypes assistiveTechnologyTypes;
     private String nameKey;
     private String nameDefault;
     private String vendor;
     private boolean visible;
     private Set userUsesAssistiveTechnologies;


    // Constructors

    /** default constructor */
    public AssistiveTechnology() {
    }
    
    /** constructor with id */
    public AssistiveTechnology(Integer assistiveTechnologyId) {
        this.assistiveTechnologyId = assistiveTechnologyId;
    }

    

   
    // Property accessors

    public Integer getAssistiveTechnologyId() {
        return this.assistiveTechnologyId;
    }
    
    public void setAssistiveTechnologyId(Integer assistiveTechnologyId) {
        this.assistiveTechnologyId = assistiveTechnologyId;
    }

    public AssistiveTechnologyTypes getAssistiveTechnologyTypes() {
        return this.assistiveTechnologyTypes;
    }
    
    public void setAssistiveTechnologyTypes(AssistiveTechnologyTypes assistiveTechnologyTypes) {
        this.assistiveTechnologyTypes = assistiveTechnologyTypes;
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

    public String getVendor() {
        return this.vendor;
    }
    
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public boolean isVisible() {
        return this.visible;
    }
    
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public Set getUserUsesAssistiveTechnologies() {
        return this.userUsesAssistiveTechnologies;
    }
    
    public void setUserUsesAssistiveTechnologies(Set userUsesAssistiveTechnologies) {
        this.userUsesAssistiveTechnologies = userUsesAssistiveTechnologies;
    }
   








}