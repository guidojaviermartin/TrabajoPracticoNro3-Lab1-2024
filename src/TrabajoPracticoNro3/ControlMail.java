
package TrabajoPracticoNro3;

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
}
