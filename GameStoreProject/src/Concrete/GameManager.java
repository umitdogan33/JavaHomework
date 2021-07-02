package Concrete;

import Abstract.GameService;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService {
    @Override
    public void Sale(Game game, Gamer gamer) {
        System.out.println("oyun eklendi!  Oyun Detayları:");
        System.out.println("oyun adı: "+game.getGameName());
        System.out.println("oyuncu adı: "+gamer.getFirstName()+" "+gamer.getFirstName());
    }
}
