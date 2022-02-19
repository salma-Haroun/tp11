package cigma.pfe.DAO;

import cigma.pfe.models.Client;
import org.springframework.data.repository.CrudRepository;
@Repository
public interface IClientDAO extends CrudRepository<Client,Long> {
    Client save(Client c);
    Client update(Client c);
    void deleteById(long idClient);
    Client findById(long idClient);
}
