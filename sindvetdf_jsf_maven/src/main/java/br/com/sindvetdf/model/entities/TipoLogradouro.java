package br.com.sindvetdf.model.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="tipoLogradouro")
public class TipoLogradouro implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name="idTipoLogradouro", nullable=false)
    private Integer idTipoLogradouro;
    @Column(name="DescricaoTipoLogradouro", length=35, nullable=false)
    private String descricaoTipoLogradouro;
    
    @OneToMany
    @ForeignKey(name="Endereco_TipoLogradouro")
    private List<Endereco> enderecos;

    public TipoLogradouro() {
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
    
    
    public Integer getIdTipoLogradouro() {
        return idTipoLogradouro;
    }

    public void setIdTipoLogradouro(Integer idTipoLogradouro) {
        this.idTipoLogradouro = idTipoLogradouro;
    }

    public String getDescricaoTipoLogradouro() {
        return descricaoTipoLogradouro;
    }

    public void setDescricaoTipoLogradouro(String descricaoTipoLogradouro) {
        this.descricaoTipoLogradouro = descricaoTipoLogradouro;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.idTipoLogradouro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoLogradouro other = (TipoLogradouro) obj;
        if (!Objects.equals(this.idTipoLogradouro, other.idTipoLogradouro)) {
            return false;
        }
        return true;
    }    
}
