
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Questoes implements Serializable {

    @SequenceGenerator(name = "genQuestoes", sequenceName = "seqQuestoes", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genQuestoes")
    @Id
    private int id;
    private String descricao;
    private char tipo; ///A - alternativa, D - descritiva, 
    private boolean obrigatoria;
    private String RespostaDesejavel;

    public Questoes() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public boolean isObrigatoria() {
        return obrigatoria;
    }

    public void setObrigatoria(boolean obrigatoria) {
        this.obrigatoria = obrigatoria;
    }

    public String getRespostaDesejavel() {
        return RespostaDesejavel;
    }

    public void setRespostaDesejavel(String RespostaDesejavel) {
        this.RespostaDesejavel = RespostaDesejavel;
    }

}
