package customers;

import org.testng.annotations.Test;

public class CustomerScript
{
    @Test
    public void createCustomer(){
        System.out.println("Customer Create Succssfuly");
    }

    @Test
    public void modifyCustomer(){
        System.out.println("Customer Modify Successful");
    }

    @Test
    public void deleteCustomer(){
        System.out.println("Delete Successful");
    }
}
