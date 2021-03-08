package br.com.sud.managed;

import br.com.sud.modelo.Contato;
import br.com.sud.modelo.Endereco;
import br.com.sud.modelo.Motorista;
import br.com.sud.servico.MotoristaServico;
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
public class ManagedMotorista implements Serializable {

    @EJB
    private MotoristaServico motoristaServico;
    private Motorista motorista;

    @PostConstruct
    public void Iniciar() {
        this.motorista = new Motorista();
        this.motorista.setEndereco(new Endereco());
        this.motorista.setContato(new Contato());

    }

    public void Salvar() {
        this.motoristaServico.save(motorista);
        Iniciar();
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

}
    