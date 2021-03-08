package br.com.sud.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Valcelio
 */
@Entity
@Table(name ="sudpessoa_fisica")
@PrimaryKeyJoinColumn(name = "id_pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public class PessoaFisica extends Pessoa implements Serializable {

    @Column(nullable = false, length = 15)
    private String sexo;
    @Column(name = "estado_civil", nullable = false, length = 15)
    private String estadoCivil;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.sexo);
        hash = 11 * hash + Objects.hashCode(this.estadoCivil);
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
        final PessoaFisica other = (PessoaFisica) obj;
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.estadoCivil, other.estadoCivil)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + "sexo=" + sexo + ", estadoCivil=" + estadoCivil + '}';
    }
}
