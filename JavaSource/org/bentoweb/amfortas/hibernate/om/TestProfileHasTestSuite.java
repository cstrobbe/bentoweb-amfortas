package org.bentoweb.amfortas.hibernate.om;



/**
 * TestProfileHasTestSuite generated by hbm2java
 */

public class TestProfileHasTestSuite  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -7314783833500561772L;
	private TestProfileHasTestSuiteId id;
     private TestSuite testSuite;
     private TestProfile testProfile;


    // Constructors

    /** default constructor */
    public TestProfileHasTestSuite() {
    }
    
    /** constructor with id */
    public TestProfileHasTestSuite(TestProfileHasTestSuiteId id) {
        this.id = id;
    }

    

   
    // Property accessors

    public TestProfileHasTestSuiteId getId() {
        return this.id;
    }
    
    public void setId(TestProfileHasTestSuiteId id) {
        this.id = id;
    }

    public TestSuite getTestSuite() {
        return this.testSuite;
    }
    
    public void setTestSuite(TestSuite testSuite) {
        this.testSuite = testSuite;
    }

    public TestProfile getTestProfile() {
        return this.testProfile;
    }
    
    public void setTestProfile(TestProfile testProfile) {
        this.testProfile = testProfile;
    }
   








}