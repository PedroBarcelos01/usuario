package com.pedrobarcelos.usuario.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "telefone")
@Builder
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "numero", length = 11)
    private String numero;
    @Column(name = "ddd", length = 2)
    private String ddd;
    @Column(name = "ddi", length = 2)
    private String ddi;

}
