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
@Table (name="sexo")
public class Sexo implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name="IdSexo", nullable=false)
    private Integer IdSexo;
    @Column(name="Descricao", unique=true, nullable=false, length=9)
    private String descricao;

    @OneToMany(mappedBy="sexo", fetch=FetchType.LAZY)
    @ForeignKey(name="PessoaSexo")
    private List<Pessoa> pessoas;
    
    public Sexo() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdSexo() {
        return IdSexo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setIdSexo(Integer IdSexo) {
        this.IdSexo = IdSexo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.IdSexo);
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
        final Sexo other = (Sexo) obj;
        if (!Objects.equals(this.IdSexo, other.IdSexo)) {
            return false;
        }
        return true;
    }
    
}
