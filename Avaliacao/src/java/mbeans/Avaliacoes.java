/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbeans;

import Model.Campanha;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Mateus
 */
@ManagedBean
@RequestScoped
public class Avaliacoes {

    /**
     * Creates a new instance of Avaliacoes
     */
    public Avaliacoes() {
    }
    
    private Campanha campanha = new Campanha();
    
    
}
