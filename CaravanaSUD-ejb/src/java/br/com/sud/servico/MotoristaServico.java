package br.com.sud.servico;

import br.com.sud.generico.ServicoGenerico;
import br.com.sud.modelo.Motorista;
import javax.ejb.Stateless;

/**
 *
 * @author Valcelio
 */
@Stateless
public class MotoristaServico extends ServicoGenerico<Motorista> {

    public MotoristaServico() {
        super(Motorista.class);
    }
}
