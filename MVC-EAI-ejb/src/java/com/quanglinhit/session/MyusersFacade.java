/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanglinhit.session;

import com.quanglinhit.entity.Myusers;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author quanglinh
 */
@Stateless
public class MyusersFacade extends AbstractFacade<Myusers> implements MyusersFacadeLocal {
    @PersistenceContext(unitName = "MVC-EAI-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MyusersFacade() {
        super(Myusers.class);
    }

    @Override
    public boolean checkLogin(String username, String password) {
        Query query = em.createNamedQuery("Myusers.checkLogin");
        query.setParameter("username", username);
        query.setParameter("password", password);
        
        try {
            query.getSingleResult();
            return true;
        } catch (Exception e) {
            
        }
        return false;
    }
    
}
