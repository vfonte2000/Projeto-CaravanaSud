package br.com.sud.modelo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.validator.constraints.br.CNPJ;

/**
 *
 * @author Valcelio
 */
@Entity
@Table (name = "sudtransportadora")
public class Transportadora implements Serializable {
    
    @Id
    @SequenceGenerator(sequenceName = "seq_transportadora", name = "seq_transportadora",allocationSize = 1)
    @GeneratedValue(generator = "seq_transportadora",strategy = GenerationType.SEQUENCE)
    @Column(name = "id_transportadora")       
    private Long id;
    @Column (name = "nome_fatasia",nullable = false)
    private String nomeFatasia;
    @Column (name = "inscricao_estadual")
    private String  inscricaoEstadual;

    private String cnpj;
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
    @OneToOne(cascade = CascadeType.ALL)
    private Contato contatos;
    @OneToMany
    private List<Motorista> motorista;
    @OneToMany
    private List<Onibus>onibus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeFatasia() {
        return nomeFatasia;
    }

    public void setNomeFatasia(String nomeFatasia) {
        this.nomeFatasia = nomeFatasia;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContatos() {
        return contatos;
    }

    public void setContatos(Contato contatos) {
        this.contatos = contatos;
    }

    public List<Motorista> getMotorista() {
        return motorista;
    }

    public void setMotorista(List<Motorista> motorista) {
        this.motorista = motorista;
    }

    public List<Onibus> getOnibus() {
        return onibus;
    }

    public void setOnibus(List<Onibus> onibus) {
        this.onibus = onibus;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.nomeFatasia);
        hash = 41 * hash + Objects.hashCode(this.inscricaoEstadual);
        hash = 41 * hash + Objects.hashCode(this.cnpj);
        hash = 41 * hash + Objects.hashCode(this.endereco);
        hash = 41 * hash + Objects.hashCode(this.contatos);
        hash = 41 * hash + Objects.hashCode(this.motorista);
        hash = 41 * hash + Objects.hashCode(this.onibus);
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
        final Transportadora other = (Transportadora) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nomeFatasia, other.nomeFatasia)) {
            return false;
        }
        if (!Objects.equals(this.inscricaoEstadual, other.inscricaoEstadual)) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.contatos, other.contatos)) {
            return false;
        }
        if (!Objects.equals(this.motorista, other.motorista)) {
            return false;
        }
        if (!Objects.equals(this.onibus, other.onibus)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Transportadora{" + "id=" + id + ", nomeFatasia=" + nomeFatasia + ", inscricaoEstadual=" + inscricaoEstadual + ", cnpj=" + cnpj + ", endereco=" + endereco + ", contatos=" + contatos + ", motorista=" + motorista + ", onibus=" + onibus + '}';
    }
   
}
