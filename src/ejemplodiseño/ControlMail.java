/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplodiseño;

/**
 *
 * @author Javier
 */
public class ControlMail {
    String mail;

    public ControlMail() {
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public ControlMail(String mail) {
        this.mail = mail;
    }
    
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
//       System.out.println("*** encontro el arroba: "+arroba +" veces");
//       System.out.println("*** encontro el punto: "+punto);
       return punto&&(arroba>0&&arroba<2)&&charEspecial==0;
    }
}
