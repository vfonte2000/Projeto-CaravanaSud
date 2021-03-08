package br.com.sud.modelo;

import br.com.sud.modelo.Contato;
import br.com.sud.modelo.Endereco;
import br.com.sud.modelo.Motorista;
import br.com.sud.modelo.Onibus;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-03T18:27:37")
@StaticMetamodel(Transportadora.class)
public class Transportadora_ { 

    public static volatile SingularAttribute<Transportadora, Endereco> endereco;
    public static volatile SingularAttribute<Transportadora, Contato> contatos;
    public static volatile ListAttribute<Transportadora, Motorista> motorista;
    public static volatile SingularAttribute<Transportadora, String> inscricaoEstadual;
    public static volatile SingularAttribute<Transportadora, Long> id;
    public static volatile SingularAttribute<Transportadora, String> nomeFatasia;
    public static volatile SingularAttribute<Transportadora, String> cnpj;
    public static volatile ListAttribute<Transportadora, Onibus> onibus;

}