package br.com.sud.managed;

import br.com.sud.modelo.Contato;
import br.com.sud.modelo.Endereco;
import br.com.sud.modelo.Transportadora;
import br.com.sud.servico.TransportadoraServico;
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
public class ManagedTransportadora implements Serializable {

    @EJB
    private TransportadoraServico transportadoraServico;
    private Transportadora transportadora;

    @PostConstruct
    public void iniciar() {
        this.transportadora = new Transportadora();
        this.transportadora.setEndereco(new Endereco());
        this.transportadora.setContatos(new Contato());
    }

    public void salvar() {
        this.transportadoraServico.save(transportadora);
        iniciar();
        Mensagem.Mensagem("Salvo Com Sucesso");
    }
    public List<Transportadora> lsTransportadora(){
         return this.transportadoraServico.findAll();
        
    }

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }
    
}
