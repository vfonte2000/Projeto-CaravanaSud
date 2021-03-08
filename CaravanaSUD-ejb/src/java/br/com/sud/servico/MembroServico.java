package br.com.sud.servico;

import br.com.sud.generico.ServicoGenerico;
import br.com.sud.modelo.Membro;
import javax.ejb.Stateless;

/**
 *
 * @author Valcelio
 */
@Stateless
public class MembroServico extends ServicoGenerico<Membro> {

    public MembroServico() {
        super(Membro.class);
    }
}
