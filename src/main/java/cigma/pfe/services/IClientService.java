package cigma.pfe.services;

import cigma.pfe.models.Client;
import java.util.List;

public interface IClientService {
    Client save(Client C) ;
    Client modify(Client C);
    void remove(long idClt);
    Client getOne(long idClt);
    List<Client> getAll();


}


