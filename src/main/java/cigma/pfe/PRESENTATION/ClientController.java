package cigma.pfe.PRESENTATION;


import cigma.pfe.models.Client;
import cigma.pfe.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

public class ClientController {
    @Autowired
    private IClientService service;
    public void save(Client person) {
        service.save(person);
    }
    public ClientController() {
        System.out.println("creation bean controller");
    }




}


