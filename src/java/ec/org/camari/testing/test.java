/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.camari.testing;

import ec.org.camari.entidades.clsCliente;
import ec.org.camari.entidades.clsFactura;
import ec.org.camari.funciones.clsReportes;
import java.util.ArrayList;

/**
 *
 * @author INTEL
 */
public class test {
    
    public static void main(String[] args){
        ArrayList<clsFactura> factura = new ArrayList<>();
        factura = clsReportes.clienteFacturaMayorMil();
        System.out.println(factura.toString());
    }
    
//    clsCliente c= new clsCliente();
//            c.setId(1);
//            c.setDireccion("puyo");
//            c.setNombre("stefania");
//            c.setRuc(1600589954);
//            System.out.println(c.toString());
//            
//            clsfactura f = new clsfactura (1, null,0,0,0,c);
//            System.out.println(f.isToString());
            
    
}
