
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanramon
 */
public class Validaciones {
boolean validado=false;

    public boolean isValidado() {
        return validado;
    }

    public void setValidado(boolean validado) {
        this.validado = validado;
    }
   
    
    public void validarNumeroControl(String numero){
        
        try{
            Integer.parseInt(numero);
            
            if(numero.length()>8 || numero.length()<8){
                showMessageDialog(null,"El numero de control debe ser de 8 numeros");
                validado=false;
            }else{
                validado=true;
            }
        }catch(NumberFormatException e){
            showMessageDialog(null,"El dato introducido no es un numero de control");
        }

    }
    
 
    
    
    public void validarNombre(String cadena){
        if(isNumeric(cadena)==true){
            showMessageDialog(null,"El nombre no puede ser un valor numerico");
            validado=false;
            
        }else{
            
        }
        
        
        char caracter ;
        for(int i = 0;i<cadena.length();i++){
               caracter = cadena.charAt(i);
               System.out.println(caracter);
              if(isNumeric(caracter+"")==true){
                  showMessageDialog(null,"Este no es un nombre valido");
                  validado=false;
                  break;
              }else{
                  validado=true;
              }
        }
        
    }
    
    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
    
    public static void main(String ar[]){
        Validaciones validar = new Validaciones();
        validar.validarNombre("1223");
    }
}
