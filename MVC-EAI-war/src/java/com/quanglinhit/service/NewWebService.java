/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanglinhit.service;

import com.quanglinhit.session.MyusersFacade;
import com.quanglinhit.session.MyusersFacadeLocal;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author quanglinh
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {
    @EJB
    private MyusersFacadeLocal userLogin;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    
    @WebMethod(operationName = "checkLogin")
    public boolean checkLogin(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        return userLogin.checkLogin(username, password);
    }
}
