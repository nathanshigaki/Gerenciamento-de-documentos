package com.govmt.sgd.model;

@Entity
@Table(name = "documentos")
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id; 

    private Orgao orgao.getId();  
    private string sigdoc; 

    @Column(name = "chegou_em")
    private date chegouEm;  

    @Column(name = "concluiu_em")
    private date concluiuEm;   

    @Column(name = "em_espera")
    private int emEspera;
    private BigDecimal valor;  
    private string situacao;
    
    @Column(name = "caracterizacao_ti")
    private string caracterizacaoTi;   
    private Boolean iniciado;  
    private Boolean condes; 
    private string resumo; 
    
    @Column(name = "tipo_contratacao")
    private string tipoContratacao;   
    private string objeto;
    private string recomendacao;

    @Column(name = "parecer_final")
    private string parecerFinal;

    @Column(name = "deletado_em")
    private timestamp deletadoEm;

    @Column(name = "criado_em", updatable = false)
    private timestamp criadoEm;

    @Column(name = "atualizado_em")
    private timestamp atualizadoEm;
}
