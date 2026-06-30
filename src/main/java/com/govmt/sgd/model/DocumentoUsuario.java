package com.govmt.sgd.model;

@Entity
@Table(name = "documento_usuarios")
public class DocumentoUsuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne()
    @JoinColumn(name = "documento_id")
    private Documento documento;

    @ManyToOne()
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    private String cargo;

    @Column(name = "criado_em", updatable = false)
    private timestamp criadoEm;

    @Column(name = "atualizado_em")
    private timestamp atualizadoEm;
}
