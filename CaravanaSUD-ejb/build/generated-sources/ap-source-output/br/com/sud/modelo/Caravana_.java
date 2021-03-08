package br.com.sud.modelo;

import br.com.sud.modelo.Membro;
import br.com.sud.modelo.Onibus;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-03T18:27:37")
@StaticMetamodel(Caravana.class)
public class Caravana_ { 

    public static volatile SingularAttribute<Caravana, Date> dataDeSaida;
    public static volatile SingularAttribute<Caravana, String> motorista2;
    public static volatile SingularAttribute<Caravana, String> motorista1;
    public static volatile ListAttribute<Caravana, Membro> membros;
    public static volatile SingularAttribute<Caravana, String> pontoDeOrigem;
    public static volatile SingularAttribute<Caravana, Long> id;
    public static volatile SingularAttribute<Caravana, String> pontoDeDestino;
    public static volatile SingularAttribute<Caravana, Date> dataDeChegada;
    public static volatile SingularAttribute<Caravana, BigDecimal> valorDaCaravana;
    public static volatile SingularAttribute<Caravana, String> status;
    public static volatile ListAttribute<Caravana, Onibus> onibus;

}