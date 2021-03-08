package br.com.sud.modelo;

import br.com.sud.modelo.Caravana;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-03T18:27:37")
@StaticMetamodel(Membro.class)
public class Membro_ extends PessoaFisica_ {

    public static volatile SingularAttribute<Membro, String> Status;
    public static volatile SingularAttribute<Membro, String> numCpfCojuge;
    public static volatile SingularAttribute<Membro, String> ramo;
    public static volatile SingularAttribute<Membro, Date> VencRecomendacao;
    public static volatile SingularAttribute<Membro, Caravana> caravana;
    public static volatile SingularAttribute<Membro, String> numMembro;

}