/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.camari.funciones;

import ec.org.camari.accesodatos.AccesoDatos;
import ec.org.camari.accesodatos.ConjuntoResultado;
import ec.org.camari.accesodatos.Parametro;
import ec.org.camari.entidades.clsProducto;
import java.util.ArrayList;

/**
 *
 * @author INTEL
 */
public class crudProducto {
    
    public static boolean save(clsProducto producto){
        
        boolean resultado =false;
        
        String sql = "INSERT INTO public.producto(nombre, stock, precioVenta) VALUES(?,?,?)";
        
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, producto.getNombre()));
       lstPar.add(new Parametro(2, producto.getStock()));
        lstPar.add(new Parametro (3, producto.getPrecioVenta()));
        
        
        try {
            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
            
        } catch (Exception e) {
        System.out.println(e.getMessage());
        }
        return resultado;
        
        
    } 
    
    public boolean Eliminar(clsProducto producto) {
        boolean res = false;
        String sql = "DELETE FROM public.producto " + "WHERE id=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, producto.getId()));

        try {
            res = AccesoDatos.ejecutaComando(sql, lstPar);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return res;
    }
    
    public boolean Actualizar(clsProducto producto) {
        boolean res = false;
        clsProducto miproducto=(clsProducto)(producto);
        String sql = "UPDATE public.producto "
                + "SET nombre=?,stock=?,precioVenta=?" + " WHERE " + "id=?";

        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, producto.getNombre()));
        lstPar.add(new Parametro(2, producto.getStock()));
        lstPar.add(new Parametro(3, producto.getPrecioVenta()));

        try {
            res = AccesoDatos.ejecutaComando(sql, lstPar);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return res;
    }
    
     public clsProducto findbyId(clsProducto pro) {
        clsProducto productos = null;
        String sql = "SELECT id, nombre, stock, precioVenta "+
                "FROM public.producto WHERE id=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, pro.getId()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                productos = new clsProducto();
                productos.setId(cres.getInt("id"));
                productos.setNombre(cres.getString("nombre"));
                productos.setStock(cres.getInt("stock"));
                productos.setPrecioVenta(cres.getInt("precioVenta"));
               
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return productos;
    }
     
      public static clsProducto findbyId(int id) {
        clsProducto productos = null;
       
        String sql = "SELECT id, nombre, stock, precioVenta "+
                "FROM public.producto WHERE id=?";
       
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, id));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
               
                productos = new clsProducto();
                 productos.setId(cres.getInt("id"));
                 productos.setNombre(cres.getString("nombre"));
                 productos.setStock(cres.getInt("stock"));
                 productos.setPrecioVenta(cres.getdouble("precioVenta"));
                 System.out.println(productos.toString());

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return productos;
    }

}
