package Model;

import javax.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@Embeddable
public class OrderItemId implements Serializable {
    @ManyToOne(cascade = CascadeType.ALL)
    private Product product;

    @ManyToOne(cascade = CascadeType.ALL)
    private Order order;
}
