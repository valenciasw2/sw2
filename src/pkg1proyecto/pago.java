/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1proyecto;

/**
 *
 * @author Administrator
 */
public class pago {
    
Boolean pago_fisico = true ;
boolean libro;
boolean Membresia;
boolean Mebresia_Actualizacion;
boolean Video;

public void pagos(){
    if(pago_fisico==true){
         this.generar_orden_compra();
          }
    if(libro==true){
       this.orden_de_entrega_libros();
          }
    
    if(Membresia==true){
        this.activacion();
          }
            
    if(Video==true){
         this.video_compra();
           }  
    if(Mebresia_Actualizacion=true){
        this.actualizar();
    }
     
}


public void generar_orden_compra(){
    
    System.out.println("se genera la orden numero :25455");
    
}
public boolean orden_de_entrega_libros(){
   System.out.println("se genera el duplicado");
   return true;
}
public boolean activacion(){
    System.out.println("su cuenta esta activada");
    return true;
}
 public boolean video_compra(){
    System.out.println("Su video se enviara. por la compra de este se le obsequia un video de primeros auxilios");
    return true;
}
 public boolean actualizar(){
    System.out.println("su informacion esta actualizada");
    return true;
}



    
}
