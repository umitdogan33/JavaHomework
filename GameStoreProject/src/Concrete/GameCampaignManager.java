package Concrete;

import Abstract.GameCampaignService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameCampaignManager implements GameCampaignService {
    @Override
    public void Sale(Campaign campaign, Gamer gamer, Game game) {
        System.out.println("oyun kampanyalı olarak satıldı!!  DetaylıBilgiler:");
        System.out.println("oyuncu adı: "+gamer.getFirstName()+" "+gamer.getLastName());
        System.out.println("oyun adı: "+game.getGameName());
        System.out.println("Kampanya Adı: "+campaign.getName());
    }
}
