package br.com.sud.modelo;

import br.com.sud.modelo.Poltrona;
import br.com.sud.modelo.Transportadora;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-03T18:27:37")
@StaticMetamodel(Onibus.class)
public class Onibus_ { 

    public static volatile SingularAttribute<Onibus, String> marca;
    public static volatile SingularAttribute<Onibus, String> capacidade;
    public static volatile SingularAttribute<Onibus, Date> anoFabricacao;
    public static volatile SingularAttribute<Onibus, Long> id;
    public static volatile SingularAttribute<Onibus, String> modelo;
    public static volatile ListAttribute<Onibus, Poltrona> poltrona;
    public static volatile SingularAttribute<Onibus, Transportadora> transportadora;
    public static volatile SingularAttribute<Onibus, String> placa;

}