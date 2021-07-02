package Adapters;

import Abstract.CustomerCheckService;
import Entities.Gamer;
import MernisService.MGTKPSPublicSoap;

import java.util.Locale;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Gamer gamer) {
        //MGTKPSPublicSoap client = new MGTKPSPublicSoap();

        //boolean result = true;

        //try {

        //result = client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalId()), gamer.getFirstName().toUpperCase(Locale.ROOT),
        //          gamer.getLastName().toUpperCase(Locale.ROOT), gamer.getDateOfBirth());

        //} catch (Exception e) {
        //  e.printStackTrace();
        //}

        //return result;
        //}
        return true;
    }
}

