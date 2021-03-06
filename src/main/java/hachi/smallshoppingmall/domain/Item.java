package hachi.smallshoppingmall.domain;

import lombok.Getter;

import javax.persistence.*;

/**
 * 상품 entity
 */
@Getter
@Entity
@DiscriminatorColumn(name = "dtype")
public class Item {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long id;

    @Column
    private String name;

    @Column
    private int price;

    @Column
    private int stockQuantity;
}
