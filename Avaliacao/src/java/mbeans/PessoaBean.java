/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbeans;

import Model.Pessoa;
import dao.PessoaDao;
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
public class PessoaBean {

    /**
     * Creates a new instance of Pessoa
     */
    public PessoaBean() {
    }

    private PessoaDao pessoaDao = new PessoaDao();
    private Pessoa pessoa = new Pessoa();
    private DataModel pessoas;

    public DataModel getPessoas() {
        if (pessoas == null) {
            pessoas = new ListDataModel(pessoaDao.findAll());
        }
        return pessoas;
    }

    public void setPessoas(DataModel pessoas) {
        this.pessoas = pessoas;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String insert() {
        pessoaDao.insert(pessoa);
        return "pessoa_listar";
    }

    public String select() {
        pessoa = (Pessoa) pessoas.getRowData();
        return "pessoa_form";
    }

    public String editar() {
        pessoaDao.update(pessoa);
        return "pessoa_listar";
    }

}
