package Model;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "order_item")
@AssociationOverrides({
        @AssociationOverride(name = "primaryKey.order", joinColumns = @JoinColumn(name = "order_id")),
        @AssociationOverride(name = "primaryKey.item", joinColumns = @JoinColumn(name = "product_id"))
})
public class OrderItem {
    @EmbeddedId
    private OrderItemId primaryKey = new OrderItemId();

    @Column(name = "count")
    private int count;
}
