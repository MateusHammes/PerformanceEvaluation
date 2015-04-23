/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbeans;

import Model.CampanhaAvaliacao;
import dao.CampanhaDao;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Mateus
 */
@ManagedBean
@RequestScoped
public class CampanhaBean {

    /**
     * Creates a new instance of Campanha
     */
    public CampanhaBean() {
    }

    private CampanhaDao campanhaDao = new CampanhaDao();
    private CampanhaAvaliacao campanha = new CampanhaAvaliacao();
    private DataModel campanhas;

    public DataModel getCampanhas() {
        if (campanhas == null) {
            campanhas = new ListDataModel(campanhaDao.findAll());
        }
        return campanhas;
    }

    public void setCampanhas(DataModel campanhas) {
        this.campanhas = campanhas;
    }

    public CampanhaAvaliacao getCampanha() {
        return campanha;
    }

    public void setCampanha(CampanhaAvaliacao campanha) {
        this.campanha = campanha;
    }

    public String insert() {
        campanhaDao.insert(campanha);
        return "campanha_listar";
    }

    public String select() {
        campanha = (CampanhaAvaliacao) campanhas.getRowData();
        return "campanha_form";
    }

    public String editar() {
        campanhaDao.update(campanha);
        return "campanha_listar";
    }

}
