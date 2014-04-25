package org.bentoweb.amfortas.hibernate.om;



/**
 * UserUsesUaPlugin generated by hbm2java
 */

public class UserUsesUaPlugin  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 5928506453874698236L;
	private UserUsesUaPluginId id;
     private UserUsesUserAgent userUsesUserAgent;
     private UserAgentPlugin userAgentPlugin;
     private String version;


    // Constructors

    /** default constructor */
    public UserUsesUaPlugin() {
    }
    
    /** constructor with id */
    public UserUsesUaPlugin(UserUsesUaPluginId id) {
        this.id = id;
    }

    

   
    // Property accessors

    public UserUsesUaPluginId getId() {
        return this.id;
    }
    
    public void setId(UserUsesUaPluginId id) {
        this.id = id;
    }

    public UserUsesUserAgent getUserUsesUserAgent() {
        return this.userUsesUserAgent;
    }
    
    public void setUserUsesUserAgent(UserUsesUserAgent userUsesUserAgent) {
        this.userUsesUserAgent = userUsesUserAgent;
    }

    public UserAgentPlugin getUserAgentPlugin() {
        return this.userAgentPlugin;
    }
    
    public void setUserAgentPlugin(UserAgentPlugin userAgentPlugin) {
        this.userAgentPlugin = userAgentPlugin;
    }

    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }
   








}