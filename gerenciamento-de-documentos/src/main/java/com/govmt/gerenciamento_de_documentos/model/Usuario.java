package com.govmt.gerenciamento_de_documentos.model;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String senha;

    private List<String> permissoao;

    @Column(name = "criado_em", updatable = false)
    private timestamp criadoEm;

    @Column(name = "atualizado_em")
    private timestamp atualizadoEm;
}
