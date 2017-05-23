
package ec.org.camari.testing;

import ec.org.camari.entidades.clsCliente;
import ec.org.camari.entidades.clsFactura;
import ec.org.camari.entidades.clsProducto;
import ec.org.camari.funciones.crudCliente;
import ec.org.camari.funciones.crudFactura;
import ec.org.camari.funciones.crudProducto;


public class testcamari {
    
     public static void main(String[] args){
         
//         TABLA CLIENTES

      clsCliente a =new clsCliente(4,"1600569139","Carla","Puyo");        
        
//    crudCliente ac = new crudCliente();
//
//    clsCliente a = new clsCliente();
//    a.setId(9);
//    ac.Eliminar(a);

//      System.out.println("CAMARI");
//        System.out.println("=============================================");
//        System.out.println("Propietario: Stefania");
//        System.out.println(a.toString());
//        System.out.println("INSERTANDO");
//        if (ac.save(a)) {
//            System.out.println("Guardado");
//        }else{
//            System.out.println("error!!!!");
//        }
//        System.out.println("Comprobando si hay datos");
//        
//        System.out.println(ac.findbyId(a).toString());

//            TABLA FACTURA

    clsFactura c =new clsFactura(1,a,null,26,0.12,28); 
        
    crudFactura d = new crudFactura();
//
//    clsFactura c = new clsFactura();
//    c.setNo(3);
//    d.Eliminar(c);

      System.out.println("CAMARI");
        System.out.println("=============================================");
        System.out.println("Propietario: Stefania");
        System.out.println(c.toString());
        System.out.println("INSERTANDO");
        if (d.save(c)) {
            System.out.println("Guardado");
        }else{
            System.out.println("error!!!!");
        }
        System.out.println("Comprobando si hay datos");
        
//        System.out.println(d.findbyId(c).toString());

//             TABLA PRODUCTO

    clsProducto e =new clsProducto(1,"CARAMELOS",26,28); 
        
    crudProducto f = new crudProducto();

//    clsProducto e = new clsProducto();
//    e.setNo(2);
//    f.Eliminar(e);

//        System.out.println("CAMARI");
//        System.out.println("=============================================");
//        System.out.println("Propietario: Stefania");
//        System.out.println(e.toString());
//        System.out.println("INSERTANDO");
//        if (f.save(e)) {
//            System.out.println("Guardado");
//        }else{
//            System.out.println("error!!!!");
//        }
//        System.out.println("Comprobando si hay datos");
        
//        System.out.println(f.findbyId(e).toString());
         




//         clsCliente c = new clsCliente();
//         c.setId(1);
//         c.setNombre("Stefania");
//         c.setDireccion("Puyo");
//         c.setRuc("1600569139");
//         
//         System.out.println(c.toString());
//         
//         clsFactura f = new clsFactura(1, c, null, 0, 0, 0);
//         System.out.println(f.getCliente().getNombre());
         
     }
    
    
}
