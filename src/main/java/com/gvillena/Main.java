/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gvillena;

import java.io.FileWriter;
import java.io.StringWriter;
import org.json.simple.*;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        JSONObject obj = new JSONObject();
        obj.put("nombre", "foo");
        obj.put("numero", new Integer(100));
        obj.put("saldo", new Double(1000.21));
        obj.put("cliente_vip", new Boolean(true));
        obj.put("nickname", null);
        System.out.println("RESULTADO\n");
        System.out.println(obj);        
                
        // TODO code application logic here
    }
    
}
