package Concrete;


import Abstract.PersonCheckService;
import Entities.Customer;

import MernisService.TAVKPSPublicSoap;

public class PersonCheckManager implements PersonCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer)
    {
      TAVKPSPublicSoap client = new TAVKPSPublicSoap();
return true;
    }
}
