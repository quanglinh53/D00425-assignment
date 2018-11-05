/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanglinhit.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author quanglinh
 */
@Entity
@Table(name = "MYUSERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Myusers.findAll", query = "SELECT m FROM Myusers m"),
    @NamedQuery(name = "Myusers.findById", query = "SELECT m FROM Myusers m WHERE m.id = :id"),
    @NamedQuery(name = "Myusers.findByUsername", query = "SELECT m FROM Myusers m WHERE m.username = :username"),
    @NamedQuery(name = "Myusers.findByPassword", query = "SELECT m FROM Myusers m WHERE m.password = :password"),
    
    // check login
    @NamedQuery(name = "Myusers.checkLogin", query = "SELECT m FROM Myusers m WHERE m.username = :username AND m.password = :password"),
    
    @NamedQuery(name = "Myusers.findByRoll", query = "SELECT m FROM Myusers m WHERE m.roll = :roll")})
public class Myusers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 100)
    @Column(name = "USERNAME")
    private String username;
    @Size(max = 100)
    @Column(name = "PASSWORD")
    private String password;
    @Size(max = 50)
    @Column(name = "ROLL")
    private String roll;

    public Myusers() {
    }

    public Myusers(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Myusers)) {
            return false;
        }
        Myusers other = (Myusers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.quanglinhit.entity.Myusers[ id=" + id + " ]";
    }
    
}
