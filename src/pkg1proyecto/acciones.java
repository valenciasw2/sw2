/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1proyecto;

/**
 *
 * @author Administrator
 */
public class acciones {

    public acciones() {
    }
    
    public void productoFisico(){
        pago p;
       p= new pago();
       p.pago_fisico=true;
    }
    
    public void libro (){
        pago p;
       p= new pago();
       p.libro=true;
       p.pagos();
      
    }
    
    public void Membresia(){
        pago p;
        p=new pago();
        p.Membresia=true;
        p.pagos();
    }
    
    public void Actualizacion(){
        pago p;
        p=new pago();
        p.Mebresia_Actualizacion=true;
        p.pagos();
    }
    
}
