package hachi.smallshoppingmall.domain;

import lombok.Getter;

import javax.persistence.*;
/**
 * 배달 entity
 */
@Getter
@Entity
public class Delivery {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_id")
    private Long id;
}
