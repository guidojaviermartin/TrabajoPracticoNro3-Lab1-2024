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
    
    public void verificaMail(String mail){
       this.mail = mail; 
    }
}
