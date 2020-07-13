package hachi.smallshoppingmall.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * admin 용 member
 */
@Entity
@Getter
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    private String name;

    private String username;
    private String password;

    @Embedded
    private Address address;

    /**
     * 1:N
     * 서로 반대
     */
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

}
