package Abstract;

import Entities.Gamer;

public interface GamerService {
    void Save(Gamer gamer);
    void Update(Gamer gamer);
    void Delete(Gamer gamer);

}
