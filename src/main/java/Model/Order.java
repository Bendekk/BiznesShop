package Model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "order")
public class Order {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private Double price;
    @Column(name = "order_date", nullable = false)
    private Date orderDate;

    @OneToMany(mappedBy = "primaryKey.order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;
}
