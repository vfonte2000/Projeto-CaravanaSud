package br.com.sud.managed;

import br.com.sud.modelo.Caravana;
import br.com.sud.servico.CaravanaServico;
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
public class ManagedCaravana implements Serializable {

    @EJB
    private CaravanaServico caravanaServico;
    private Caravana caravana;

    @PostConstruct
    public void iniciar() {
        this.caravana = new Caravana();
    }

    public void salvar() {
        this.caravanaServico.save(caravana);
        iniciar();
    }
    
    public Caravana getCaravana() {
        return caravana;
    }

    public void setCaravana(Caravana caravana) {
        this.caravana = caravana;
    }
}
