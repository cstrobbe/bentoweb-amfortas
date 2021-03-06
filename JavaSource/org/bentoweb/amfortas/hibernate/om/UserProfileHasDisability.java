package org.bentoweb.amfortas.hibernate.om;



/**
 * UserProfileHasDisability generated by hbm2java
 */

public class UserProfileHasDisability  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -8338675640979661970L;
	private UserProfileHasDisabilityId id;
     private Disability disability;
     private UserProfile userProfile;


    // Constructors

    /** default constructor */
    public UserProfileHasDisability() {
    }
    
    /** constructor with id */
    public UserProfileHasDisability(UserProfileHasDisabilityId id) {
        this.id = id;
    }

    

   
    // Property accessors

    public UserProfileHasDisabilityId getId() {
        return this.id;
    }
    
    public void setId(UserProfileHasDisabilityId id) {
        this.id = id;
    }

    public Disability getDisability() {
        return this.disability;
    }
    
    public void setDisability(Disability disability) {
        this.disability = disability;
    }

    public UserProfile getUserProfile() {
        return this.userProfile;
    }
    
    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }
   








}