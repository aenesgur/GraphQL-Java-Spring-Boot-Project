package com.springboot.graphql.entity;

import com.springboot.graphql.entity.enums.Currency;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "listing")
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = { "id" })
@ToString
public class Listing {

    @Id
    @SequenceGenerator(name = "seq_listing", allocationSize = 1)
    @GeneratedValue(generator = "seq_listing", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String title;

    private String description;

    private Float price;

    @Enumerated(EnumType.STRING)
    @Column(length = 5)
    private Currency currency;

    @Column(name = "created_at")
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "trade_type_id")
    private TradeType tradeType;
}
