package br.com.sud.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Valcelio
 */
@Entity
@Table (name = "sudcaravana")
public class Caravana implements Serializable {

    @Id
    @SequenceGenerator(sequenceName = "seq_caravana", name = "seq_caravana",initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "seq_caravana", strategy = GenerationType.SEQUENCE)
    @Column(name = "id_caravana")
    private Long id;
    @Column(name = "ponto_de_origem", nullable = false, length = 50)
    private String pontoDeOrigem;
    @Column(name = "ponto_de_destino", nullable = false, length = 50)
    private String pontoDeDestino;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_de_saida", nullable = false)
    private Date dataDeSaida;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_de_chegada", nullable = false)
    private Date dataDeChegada;
    @Column(name = "valor_da_caravana", nullable = false)
    private BigDecimal valorDaCaravana;
    private String status;
    private String motorista1;
    private String motorista2;
    
    @JoinTable(
            name = "sudcaravana_tem_sudonibus", 
            joinColumns = {
                @JoinColumn(name = "sudcaravana_id", referencedColumnName = "id")
            },
            inverseJoinColumns = {
                @JoinColumn(name = "sudonibus_id", referencedColumnName = "id")
            }
    )
    @OneToMany
    private List<Onibus> onibus;
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "sudcaravana_tem_sudmembros", 
            joinColumns = {
                @JoinColumn(name = "sudcaravana_id", referencedColumnName = "id")
            },
            inverseJoinColumns = {
                @JoinColumn(name = "sudmembro_id", referencedColumnName = "id")
            }
    )
    private List<Membro> membros;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPontoDeOrigem() {
        return pontoDeOrigem;
    }

    public void setPontoDeOrigem(String pontoDeOrigem) {
        this.pontoDeOrigem = pontoDeOrigem;
    }

    public String getPontoDeDestino() {
        return pontoDeDestino;
    }

    public void setPontoDeDestino(String pontoDeDestino) {
        this.pontoDeDestino = pontoDeDestino;
    }

    public Date getDataDeSaida() {
        return dataDeSaida;
    }

    public void setDataDeSaida(Date dataDeSaida) {
        this.dataDeSaida = dataDeSaida;
    }

    public Date getDataDeChegada() {
        return dataDeChegada;
    }

    public void setDataDeChegada(Date dataDeChegada) {
        this.dataDeChegada = dataDeChegada;
    }

    public BigDecimal getValorDaCaravana() {
        return valorDaCaravana;
    }

    public void setValorDaCaravana(BigDecimal valorDaCaravana) {
        this.valorDaCaravana = valorDaCaravana;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMotorista1() {
        return motorista1;
    }

    public void setMotorista1(String motorista1) {
        this.motorista1 = motorista1;
    }

    public String getMotorista2() {
        return motorista2;
    }

    public void setMotorista2(String motorista2) {
        this.motorista2 = motorista2;
    }

    public List<Onibus> getOnibus() {
        return onibus;
    }

    public void setOnibus(List<Onibus> onibus) {
        this.onibus = onibus;
    }

    public List<Membro> getMembros() {
        return membros;
    }

    public void setMembros(List<Membro> membros) {
        this.membros = membros;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.pontoDeOrigem);
        hash = 17 * hash + Objects.hashCode(this.pontoDeDestino);
        hash = 17 * hash + Objects.hashCode(this.dataDeSaida);
        hash = 17 * hash + Objects.hashCode(this.dataDeChegada);
        hash = 17 * hash + Objects.hashCode(this.valorDaCaravana);
        hash = 17 * hash + Objects.hashCode(this.status);
        hash = 17 * hash + Objects.hashCode(this.motorista1);
        hash = 17 * hash + Objects.hashCode(this.motorista2);
        hash = 17 * hash + Objects.hashCode(this.onibus);
        hash = 17 * hash + Objects.hashCode(this.membros);
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
        final Caravana other = (Caravana) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.pontoDeOrigem, other.pontoDeOrigem)) {
            return false;
        }
        if (!Objects.equals(this.pontoDeDestino, other.pontoDeDestino)) {
            return false;
        }
        if (!Objects.equals(this.dataDeSaida, other.dataDeSaida)) {
            return false;
        }
        if (!Objects.equals(this.dataDeChegada, other.dataDeChegada)) {
            return false;
        }
        if (!Objects.equals(this.valorDaCaravana, other.valorDaCaravana)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.motorista1, other.motorista1)) {
            return false;
        }
        if (!Objects.equals(this.motorista2, other.motorista2)) {
            return false;
        }
        if (!Objects.equals(this.onibus, other.onibus)) {
            return false;
        }
        if (!Objects.equals(this.membros, other.membros)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Caravana{" + "id=" + id + ", pontoDeOrigem=" + pontoDeOrigem + ", pontoDeDestino=" + pontoDeDestino + ", dataDeSaida=" + dataDeSaida + ", dataDeChegada=" + dataDeChegada + ", valorDaCaravana=" + valorDaCaravana + ", status=" + status + ", motorista1=" + motorista1 + ", motorista2=" + motorista2 + ", onibus=" + onibus + ", membros=" + membros + '}';
    }
    
}
