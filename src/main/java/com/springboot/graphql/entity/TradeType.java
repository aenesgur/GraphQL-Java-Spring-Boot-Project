package com.springboot.graphql.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trade_type")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = { "id" })
@ToString
public class TradeType {

    @Id
    @SequenceGenerator(name = "seq_trade_type", allocationSize = 1)
    @GeneratedValue(generator = "seq_trade_type", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    @Column(name = "created_at")
    private Date createdAt;
}
