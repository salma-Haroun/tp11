package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.DAO.IClientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClientServiceImpl implements ClientService{
    @Autowired
    private IClientDAO DAO;
    public ClientServiceImpl() {
        System.out.println("creation bean service");
    }
    @Override
    public void save(Client c) {
        DAO.save(c);
    }




}
