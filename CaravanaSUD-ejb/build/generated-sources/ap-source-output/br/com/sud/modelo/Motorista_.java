package br.com.sud.modelo;

import br.com.sud.modelo.Transportadora;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-03T18:27:37")
@StaticMetamodel(Motorista.class)
public class Motorista_ extends PessoaFisica_ {

    public static volatile SingularAttribute<Motorista, String> categoria;
    public static volatile SingularAttribute<Motorista, Date> validadeCNH;
    public static volatile SingularAttribute<Motorista, String> NunCNH;
    public static volatile SingularAttribute<Motorista, Transportadora> transportadora;

}