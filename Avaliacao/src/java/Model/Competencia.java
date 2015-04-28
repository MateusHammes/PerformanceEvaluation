package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Competencia {

    @Id
    @SequenceGenerator(name = "genCompetencia", sequenceName = "seqCompetencia", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genCompetencia")
    private int id;
    private String nome;
    private char tipo;

    public Competencia() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

}
