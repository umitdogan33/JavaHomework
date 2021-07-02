package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface GameCampaignService {

    void Sale(Campaign campaign, Gamer gamer, Game game);
}
