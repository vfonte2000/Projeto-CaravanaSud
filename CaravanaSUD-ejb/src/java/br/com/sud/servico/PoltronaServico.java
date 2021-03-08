package br.com.sud.servico;

import br.com.sud.generico.ServicoGenerico;
import br.com.sud.modelo.Poltrona;
import javax.ejb.Stateless;

/**
 *
 * @author Valcelio
 */
@Stateless
public class PoltronaServico extends ServicoGenerico<Poltrona>{

    public PoltronaServico() {
        super(Poltrona.class);
    }
    
    
}
