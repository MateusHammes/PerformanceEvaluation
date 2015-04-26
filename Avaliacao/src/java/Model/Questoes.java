/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Mateus
 */
@Entity
public class Questoes {

    @SequenceGenerator(name = "genQuestoes", sequenceName = "seqQuestoes", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genQuestoes")
    @Id
    private int id;
    @ManyToOne
    private Campanha campanha;

    public Questoes() {
    }

}
