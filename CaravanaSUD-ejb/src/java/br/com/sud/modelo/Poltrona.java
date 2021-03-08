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

/**
 *
 * @author Valcelio
 */
@Entity
@Table(name = "sudpoltrona")
public class Poltrona implements Serializable {

    @Id
    @SequenceGenerator(sequenceName = "seq_poltrona", name = "seq_poltrona", allocationSize = 1)
    @GeneratedValue(generator = "seq_poltrona", strategy = GenerationType.SEQUENCE)
    @Column(name = "id_poltrona")
    private Long id;
    private String status;
    @Column(name = "num_poltrona")
    private int numPoltrona;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumPoltrona() {
        return numPoltrona;
    }

    public void setNumPoltrona(int numPoltrona) {
        this.numPoltrona = numPoltrona;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.status);
        hash = 79 * hash + this.numPoltrona;
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
        final Poltrona other = (Poltrona) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (this.numPoltrona != other.numPoltrona) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Poltrona{" + "id=" + id + ", status=" + status + ", numPoltrona=" + numPoltrona + '}';
    }

}
