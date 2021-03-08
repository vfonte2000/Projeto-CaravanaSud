package br.com.sud.servico;

import br.com.sud.generico.ServicoGenerico;
import br.com.sud.modelo.Transportadora;
import javax.ejb.Stateless;

/**
 *
 * @author Valcelio
 */
@Stateless
public class TransportadoraServico extends ServicoGenerico<Transportadora> {

    public TransportadoraServico() {
        super(Transportadora.class);
    }

}
