package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
public class Cargo {

    @Id
    @SequenceGenerator(name = "genCargo", sequenceName = "seqCargo", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genCargo")
    private int id;
    private String nome;

    public Cargo() {
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

}
