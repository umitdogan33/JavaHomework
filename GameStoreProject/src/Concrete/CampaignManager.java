package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {
    @Override
    public void Add(Campaign campaign) {
        System.out.println("kampnaya eklendi: "+campaign.getName());
    }

    @Override
    public void Delete(Campaign campaign) {
        System.out.println("kampnaya silindi: "+campaign.getName());
    }

    @Override
    public void Update(Campaign campaign) {
        System.out.println("kampnaya güncellendi: "+campaign.getName());
    }
}
