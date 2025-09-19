package user;

import org.testng.annotations.*;

public class UserScript {
    @Test
    public void createUser(){
        System.out.println("User Create Succssfuly");
    }

    @Test
    public void modifyUser(){
        System.out.println("Usar Modify Successful");
    }

    @Test
    public void deleteUser(){
        System.out.println("Delete Successful");
    }

    @BeforeSuite
    public void beforeSuiteDemo(){
        System.out.println("User @BeforeSuite Example");
    }

    @AfterSuite
    public void afterAuiteDemo(){
        System.out.println("User @AfterSuite Example");
    }
    @BeforeTest
    public void beforeTestDemo(){
        System.out.println("User @BeforeTest ");
    }
    @AfterTest
    public void afterTestDemo(){
        System.out.println("User @AfterTest ");
    }

    @BeforeClass
    public void beforeClassDemo(){
        System.out.println("User @BeforeClass Example");
    }

    @AfterClass
    public void afterClassDemo(){
        System.out.println("User @AfterClass Example");
    }

    @BeforeMethod
    public void beforeMethodDemo(){
        System.out.println("User @BeforeMethod Example");
    }

    @AfterMethod
    public void afterMethodDemo(){
        System.out.println("User @AfterMethod Example");
    }
}
