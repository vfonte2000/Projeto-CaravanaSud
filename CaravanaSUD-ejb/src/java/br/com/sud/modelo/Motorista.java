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
@Table(name = "sudmotorista")
public class Motorista extends PessoaFisica implements Serializable {

    @Column(nullable = false, length = 4)
    private String categoria;
    @Column(name = "validade_cnh", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date validadeCNH;
    @Column(name = "num_cnh", nullable = false, length = 14)
    private String NunCNH;
    @OneToOne
    private Transportadora transportadora;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getValidadeCNH() {
        return validadeCNH;
    }

    public void setValidadeCNH(Date validadeCNH) {
        this.validadeCNH = validadeCNH;
    }

    public String getNunCNH() {
        return NunCNH;
    }

    public void setNunCNH(String NunCNH) {
        this.NunCNH = NunCNH;
    }

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.categoria);
        hash = 11 * hash + Objects.hashCode(this.validadeCNH);
        hash = 11 * hash + Objects.hashCode(this.NunCNH);
        hash = 11 * hash + Objects.hashCode(this.transportadora);
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
        final Motorista other = (Motorista) obj;
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        if (!Objects.equals(this.validadeCNH, other.validadeCNH)) {
            return false;
        }
        if (!Objects.equals(this.NunCNH, other.NunCNH)) {
            return false;
        }
        if (!Objects.equals(this.transportadora, other.transportadora)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Motorista{" + "categoria=" + categoria + ", validadeCNH=" + validadeCNH + ", NunCNH=" + NunCNH + ", transportadora=" + transportadora + '}';
    }

}
