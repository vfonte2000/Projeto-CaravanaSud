package br.com.sud.servico;

import br.com.sud.generico.ServicoGenerico;
import br.com.sud.modelo.Caravana;
import javax.ejb.Stateless;

/**
 *
 * @author Valcelio
 */
@Stateless
public class CaravanaServico extends ServicoGenerico<Caravana> {

    public CaravanaServico() {
        super(Caravana.class);
    }
}
