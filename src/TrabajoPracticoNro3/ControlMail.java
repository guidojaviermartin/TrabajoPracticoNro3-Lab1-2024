package TrabajoPracticoNro3;

import javax.swing.JOptionPane;

public class ControlMail {
      
    public boolean verificaMail(String mail1){
       int arroba = 0, charEspecial = 0;
       boolean punto= false;
       for(int i=0;i<mail1.length();i++){
           if(mail1.charAt(i) == '@'){
                arroba++;       
           }
           if(mail1.charAt(i) == '.'){
               punto=true;
           }
            if(mail1.charAt(i) == 'ñ'){
                charEspecial++;       
           }
       }
       return punto&&(arroba>0&&arroba<2)&&charEspecial==0;
    }
    public boolean enviarMensajeDeError(String jt1, String jt2){
        boolean aux=false;
        if(jt1.equals("")|| jt1.equals("ejemplo@ejemplo.com")||jt2.equals("")||jt2.equals("**********")){
            JOptionPane.showInputDialog("*** Error: 'Usuario y/o Contraseña' vacios ***");
            
        }
        return aux;
    }
}
