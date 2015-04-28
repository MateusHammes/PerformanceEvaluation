
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class PessoaAvaliacao implements Serializable {

    @SequenceGenerator(name = "genPessoaAvaliacao", sequenceName = "seqPessoaAvaliacao", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genPessoaAvaliacao")
    @Id
    private int id;
    @ManyToOne
    private Pessoa avaliador;
    @ManyToOne
    private Pessoa pessoaAvaliada;
    @ManyToOne
    private Campanha campanha;
    @ManyToOne
    private Questoes questoes;

    private float valor;
    private String observacao;

    public PessoaAvaliacao() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(Pessoa avaliador) {
        this.avaliador = avaliador;
    }

    public Pessoa getPessoaAvaliada() {
        return pessoaAvaliada;
    }

    public void setPessoaAvaliada(Pessoa pessoaAvaliada) {
        this.pessoaAvaliada = pessoaAvaliada;
    }

    public Campanha getCampanha() {
        return campanha;
    }

    public void setCampanha(Campanha campanha) {
        this.campanha = campanha;
    }

    public Questoes getQuestoes() {
        return questoes;
    }

    public void setQuestoes(Questoes questoes) {
        this.questoes = questoes;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
