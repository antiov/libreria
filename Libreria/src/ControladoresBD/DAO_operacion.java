/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladoresBD;

import Modelo.modeloOperacion;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author luis-valerio
 */
public class DAO_operacion {
    
    private static SessionFactory factory;
    
        public String insertOperacion(modeloOperacion mOp) {
        String algo = "";
        factory = new Configuration().configure().buildSessionFactory();
        Session ss = factory.openSession();
        try {
            Transaction tx = ss.beginTransaction();

            ss.save(mOp);
            tx.commit();

            algo = "Operacion Agregada";
        } catch (Exception ex) {
            System.out.println("Error query " + ex.getMessage());
            algo = "Error query " + ex.getMessage();
        } finally {

        }
        return algo;
    }
}
