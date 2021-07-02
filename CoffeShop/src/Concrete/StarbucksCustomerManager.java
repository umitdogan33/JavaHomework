package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.PersonCheckService;
import Entities.Customer;
import java.lang.Exception;
public class StarbucksCustomerManager extends BaseCustomerManager {
    private PersonCheckService personCheckService;

    public StarbucksCustomerManager(PersonCheckService personCheckService) {
        this.personCheckService = personCheckService;
    }

    @Override
    public void Save(Customer customer) {
        if (personCheckService.CheckIfRealPerson(customer) == true) {
            super.Save(customer);
            return;
        }
        System.out.println("kullanıcı doğrulanamadı");

    }


}
