package cigma.pfe.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Getter
@Setter
@ToString
public class CarteFidelio {
    @OneToOnee(cascade = {CascadeType.PERSIST},mappedBy = "client")
    private CarteFidelio carteFidelio;
    @JoinColumn(name = "client_id")
    private Client client;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String code;
    public CarteFidelio(String code) {
        this.code = code;
    }

}
