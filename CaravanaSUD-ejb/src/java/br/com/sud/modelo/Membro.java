package br.com.sud.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Valcelio
 */
@Entity
@PrimaryKeyJoinColumn(name = "id_pessoa")
@Table(name = "sudmembro")
public class Membro extends PessoaFisica implements Serializable {

    @Column(name = "num_membro", nullable = false)
    private String numMembro;
    @Column(name = "num_cpf_conjuge")
    private String numCpfCojuge;
    @Column(nullable = false, length = 50)
    private String ramo;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date VencRecomendacao;
    private String Status;
    @OneToOne
    private Caravana caravana;

    public String getNumMembro() {
        return numMembro;
    }

    public void setNumMembro(String numMembro) {
        this.numMembro = numMembro;
    }

    public String getNumCpfCojuge() {
        return numCpfCojuge;
    }

    public void setNumCpfCojuge(String numCpfCojuge) {
        this.numCpfCojuge = numCpfCojuge;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public Date getVencRecomendacao() {
        return VencRecomendacao;
    }

    public void setVencRecomendacao(Date VencRecomendacao) {
        this.VencRecomendacao = VencRecomendacao;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Caravana getCaravana() {
        return caravana;
    }

    public void setCaravana(Caravana caravana) {
        this.caravana = caravana;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.numMembro);
        hash = 97 * hash + Objects.hashCode(this.numCpfCojuge);
        hash = 97 * hash + Objects.hashCode(this.ramo);
        hash = 97 * hash + Objects.hashCode(this.VencRecomendacao);
        hash = 97 * hash + Objects.hashCode(this.Status);
        hash = 97 * hash + Objects.hashCode(this.caravana);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Membro other = (Membro) obj;
        if (!Objects.equals(this.numMembro, other.numMembro)) {
            return false;
        }
        if (!Objects.equals(this.numCpfCojuge, other.numCpfCojuge)) {
            return false;
        }
        if (!Objects.equals(this.ramo, other.ramo)) {
            return false;
        }
        if (!Objects.equals(this.VencRecomendacao, other.VencRecomendacao)) {
            return false;
        }
        if (!Objects.equals(this.Status, other.Status)) {
            return false;
        }
        if (!Objects.equals(this.caravana, other.caravana)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Membro{" + "numMembro=" + numMembro + ", numCpfCojuge=" + numCpfCojuge + ", ramo=" + ramo + ", VencRecomendacao=" + VencRecomendacao + ", Status=" + Status + ", caravana=" + caravana + '}';
    }
}
