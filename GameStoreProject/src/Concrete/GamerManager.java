package Concrete;

import Abstract.CustomerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {

    CustomerCheckService customerCheckService;

    public GamerManager(CustomerCheckService customerCheckService) {
        //super();
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void Save(Gamer gamer) {
    if (customerCheckService.checkIfRealPerson(gamer)==true){
        System.out.println("kayıt başarılı");
    }
    else{
        System.out.println("doğrulama hatası");
    }
    }

    @Override
    public void Update(Gamer gamer) {
        System.out.println("güncelleme başarılı");
    }

    @Override
    public void Delete(Gamer gamer) {
        System.out.println("silme başarılı");

    }
}
