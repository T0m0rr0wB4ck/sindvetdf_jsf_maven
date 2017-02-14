package br.com.sindvetdf.model.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="tipoEndereco")
public class TipoEndereco implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name="idTipoEndereco", nullable=false)
    private Integer idTipoEndereco;
    @Column(name="DescricaoTipoEndereco", length=35, nullable=false)
    private String descricaoTipoEndereco;
    
    @OneToMany(mappedBy="tipoendereco", fetch=FetchType.LAZY)
    @ForeignKey(name="Endereco_TipoEndereco")
    private List<Endereco> enderecos;

    public TipoEndereco() {
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public Integer getIdTipoEndereco() {
        return idTipoEndereco;
    }

    public void setIdTipoEndereco(Integer idTipoEndereco) {
        this.idTipoEndereco = idTipoEndereco;
    }

    public String getDescricaoTipoEndereco() {
        return descricaoTipoEndereco;
    }

    public void setDescricaoTipoEndereco(String descricaoTipoEndereco) {
        this.descricaoTipoEndereco = descricaoTipoEndereco;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.idTipoEndereco);
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
        final TipoEndereco other = (TipoEndereco) obj;
        if (!Objects.equals(this.idTipoEndereco, other.idTipoEndereco)) {
            return false;
        }
        return true;
    }
    
    
    
}
