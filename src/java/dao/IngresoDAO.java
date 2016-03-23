/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Ingreso;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Query;

public class IngresoDAO {
    
    private Session sesion;
    
    public Ingreso verificaDatos(Ingreso usuario) throws Exception {
        Ingreso user = null;
        
        try{
            sesion = HibernateUtil.getSessionFactory().openSession();
            String hq = "From Ingreso Where nickname = '" + usuario.getNickname()
                    + "' and contrasenia = '" + usuario.getContrasenia() + "'";
            Query query = sesion.createQuery(hq);
            
            if(!query.list().isEmpty()){
                user = (Ingreso) query.list().get(0); 
            }
            
        } catch(Exception e) {
               throw e;            
        }
     
        return user;   
    }
}
