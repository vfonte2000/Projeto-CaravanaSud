package br.com.sud.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.validator.constraints.Email;

/**
 *
 * @author Valcelio
 */
@Entity
@Table (name = "sudContato")

public class Contato implements Serializable {

    @Id
    @SequenceGenerator(sequenceName = "seq_contato", name = "seq_contato", allocationSize = 1)
    @GeneratedValue(generator = "seq_contato", strategy = GenerationType.SEQUENCE)
    @Column(name = "id_contato")
    private Long id;
    private String email;
    private String telefone;
    private String teleSecudario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTeleSecudario() {
        return teleSecudario;
    }

    public void setTeleSecudario(String teleSecudario) {
        this.teleSecudario = teleSecudario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.id);
        hash = 73 * hash + Objects.hashCode(this.email);
        hash = 73 * hash + Objects.hashCode(this.telefone);
        hash = 73 * hash + Objects.hashCode(this.teleSecudario);
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
        final Contato other = (Contato) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.teleSecudario, other.teleSecudario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Contato{" + "id=" + id + ", email=" + email + ", telefone=" + telefone + ", teleSecudario=" + teleSecudario + '}';
    }
}
