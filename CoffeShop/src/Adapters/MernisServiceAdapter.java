package Adapters;

import Abstract.PersonCheckService;
import Entities.Customer;
import MernisService.TAVKPSPublicSoap;

import java.util.Locale;

public class MernisServiceAdapter implements PersonCheckService  {
    @Override
    public boolean CheckIfRealPerson(Customer customer){
        TAVKPSPublicSoap client = new TAVKPSPublicSoap();

        boolean result = true;

        try {

            result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalId()), customer.getFirstName().toUpperCase(Locale.ROOT),
                    customer.getLastName().toUpperCase(Locale.ROOT), customer.getDateOfBird());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
    }

