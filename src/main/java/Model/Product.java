package Model;

import javax.persistence.*;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Double price;
    @OneToMany(mappedBy = "primaryKey.product", cascade = CascadeType.ALL)
    public List<OrderItem> orderItems;
}
