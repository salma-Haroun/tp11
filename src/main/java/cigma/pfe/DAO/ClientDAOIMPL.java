package cigma.pfe.DAO;


import cigma.pfe.models.Client;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
@Repository
public class  ClientDAOIMPL implements IClientDAO {
    @PersistenceContext
    private EntityManager entitymanager;
    @Override
    public void save(Client p) {
        entitymanager.persist(p);
    }
    public ClientDaoImpl() {
        System.out.println("creation bean dao");
    }


}




