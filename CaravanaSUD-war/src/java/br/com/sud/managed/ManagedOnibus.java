package br.com.sud.managed;

import br.com.sud.modelo.Onibus;
import br.com.sud.servico.OnibusServico;
import br.com.sud.utilitario.Mensagem;
import java.io.Serializable;
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
public class ManagedOnibus implements Serializable {
    
    @EJB
    private OnibusServico onibusServico;
    private Onibus onibus;
    
    @PostConstruct
    public void Ininiar() {
        this.onibus = new Onibus();
        
    }

    public void salvar() {
        this.onibusServico.save(onibus);
        Mensagem.Mensagem("salvo com sucesso");
        Ininiar();
    }
    
    public Onibus getOnibus() {
        return onibus;
    }
    
    public void setOnibus(Onibus onibus) {
        this.onibus = onibus;
    }
    
}
