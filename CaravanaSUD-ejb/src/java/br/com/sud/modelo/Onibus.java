package br.com.sud.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Valcelio
 */
@Entity
@Table(name = "sudonibus")
public class Onibus implements Serializable {

    @Id
    @SequenceGenerator(sequenceName = "seq_onibus", name = "seq_onibus", allocationSize = 1)
    @GeneratedValue(generator = "seq_onibus", strategy = GenerationType.SEQUENCE)
    @Column(name = "id_onibus")
    private Long id;
    private String marca;
    private String capacidade;
    @Temporal(TemporalType.DATE)
    @Column(name = "ano_fabricacao")
    private Date anoFabricacao;
    private String modelo;
    private String placa;
    @OneToMany
    private List<Poltrona> poltrona;
    @OneToOne
    private Transportadora transportadora;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public Date getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Date anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public List<Poltrona> getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(List<Poltrona> poltrona) {
        this.poltrona = poltrona;
    }

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.id);
        hash = 31 * hash + Objects.hashCode(this.marca);
        hash = 31 * hash + Objects.hashCode(this.capacidade);
        hash = 31 * hash + Objects.hashCode(this.anoFabricacao);
        hash = 31 * hash + Objects.hashCode(this.modelo);
        hash = 31 * hash + Objects.hashCode(this.placa);
        hash = 31 * hash + Objects.hashCode(this.poltrona);
        hash = 31 * hash + Objects.hashCode(this.transportadora);
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
        final Onibus other = (Onibus) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.capacidade, other.capacidade)) {
            return false;
        }
        if (!Objects.equals(this.anoFabricacao, other.anoFabricacao)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        if (!Objects.equals(this.poltrona, other.poltrona)) {
            return false;
        }
        if (!Objects.equals(this.transportadora, other.transportadora)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Onibus{" + "id=" + id + ", marca=" + marca + ", capacidade=" + capacidade + ", anoFabricacao=" + anoFabricacao + ", modelo=" + modelo + ", placa=" + placa + ", poltrona=" + poltrona + ", transportadora=" + transportadora + '}';
    }

}
