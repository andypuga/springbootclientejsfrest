/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Programador3
 */
@Entity
@Table(name = "TIPO_VALOR")
public class TipoValor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_TIPOVALOR")
    private Integer idTipovalor;
    @Size(max = 30)
    @Column(name = "TIPOVALOR")
    private String tipovalor;
  
    public TipoValor() {
    }

    public TipoValor(Integer idTipovalor) {
        this.idTipovalor = idTipovalor;
    }

    public Integer getIdTipovalor() {
        return idTipovalor;
    }

    public void setIdTipovalor(Integer idTipovalor) {
        this.idTipovalor = idTipovalor;
    }

    public String getTipovalor() {
        return tipovalor;
    }

    public void setTipovalor(String tipovalor) {
        this.tipovalor = tipovalor;
    }

  
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipovalor != null ? idTipovalor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoValor)) {
            return false;
        }
        TipoValor other = (TipoValor) object;
        if ((this.idTipovalor == null && other.idTipovalor != null) || (this.idTipovalor != null && !this.idTipovalor.equals(other.idTipovalor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TipoValor[ idTipovalor=" + idTipovalor + " ]";
    }
    
}
