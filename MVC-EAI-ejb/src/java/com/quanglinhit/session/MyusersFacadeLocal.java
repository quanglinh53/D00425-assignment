/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanglinhit.session;

import com.quanglinhit.entity.Myusers;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author quanglinh
 */
@Local
public interface MyusersFacadeLocal {

    void create(Myusers myusers);

    void edit(Myusers myusers);

    void remove(Myusers myusers);

    Myusers find(Object id);

    List<Myusers> findAll();

    List<Myusers> findRange(int[] range);

    int count();
    
    boolean checkLogin(String username, String password);
    
}
