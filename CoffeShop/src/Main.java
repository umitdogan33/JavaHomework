import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {
    public static void main(String[] args){
        BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        Customer customer = new Customer();
        customer.setId(1);
        customer.setFirstName("ümit");
        customer.setLastName("doğan");
        customer.setNationalId("00000000000");
        customer.setDateOfBird(6);
        starbucksCustomerManager.Save(customer);
    }
}
