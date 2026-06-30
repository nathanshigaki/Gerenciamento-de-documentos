package com.govmt.sgd.model;

@Entity
@Table(name = "orgao")
public class Orgao {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String nome;
    
    private String acronimo;

    @Column(name = "criado_em", updatable = false)
    private timestamp criado_em;

    @Column(name = "atualizado_em")
    private timestamp atualizado_em;

}
