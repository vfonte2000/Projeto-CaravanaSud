package br.com.sud.servico;

import br.com.sud.generico.ServicoGenerico;
import br.com.sud.modelo.Onibus;
import javax.ejb.Stateless;

/**
 *
 * @author Valcelio
 */
@Stateless
public class OnibusServico extends ServicoGenerico<Onibus> {

    public OnibusServico() {
        super(Onibus.class);
    }
    
}
