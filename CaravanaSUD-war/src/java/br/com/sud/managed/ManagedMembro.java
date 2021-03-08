package br.com.sud.managed;

import br.com.sud.modelo.Contato;
import br.com.sud.modelo.Endereco;
import br.com.sud.modelo.Membro;
import br.com.sud.servico.MembroServico;
import br.com.sud.utilitario.Mensagem;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Valcelio
 */
@ManagedBean
@ViewScoped
public class ManagedMembro implements Serializable {

    @EJB
    private MembroServico membroServico;

    private Membro membro;
    private boolean conjuge;

    @PostConstruct
    public void iniciar() {
        this.membro = new Membro();
        this.membro.setEndereco(new Endereco());
        this.membro.setContato(new Contato());
    }

    public void salvar() {
        this.membroServico.save(membro);
        Mensagem.Mensagem("Membro Salvo Com Sucesso !");
        iniciar();
    }

    public void teste() {
          conjuge = true;
          System.out.println("asdasd");
    }

    public List<Membro> lsMembro() {
        return this.membroServico.findAll();
    }

    public Membro getMembro() {
        return membro;
    }
   
    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    public boolean isConjuge() {
        return conjuge;
    }

    public void setConjuge(boolean conjuge) {
        this.conjuge = conjuge;
    }

}
