package org.bentoweb.amfortas.hibernate.om;



/**
 * UserHasRole generated by hbm2java
 */

public class UserHasRole  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 5902174155123902781L;
	private UserHasRoleId id;
     private User user;
     private Role role;


    // Constructors

    /** default constructor */
    public UserHasRole() {
    }
    
    /** constructor with id */
    public UserHasRole(UserHasRoleId id) {
        this.id = id;
    }

    

   
    // Property accessors

    public UserHasRoleId getId() {
        return this.id;
    }
    
    public void setId(UserHasRoleId id) {
        this.id = id;
    }

    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return this.role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }
   








}