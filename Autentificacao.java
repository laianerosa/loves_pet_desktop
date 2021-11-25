/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import javax.swing.JOptionPane;


class Autentificacao {
	
    /** Recebe um login e uma senha e faz a verificação
     * @param login
     * @param senha
     * @return boolean
     */
		
    public boolean autentificar( String login, String senha){
        boolean par = false;
        
        if(login.equals("User1") && senha.equals("123")){
            par = true;
        }
        else{
        JOptionPane.showMessageDialog(null, "Login ou senha invÃ¡lidos");
        
        }
        
        return par;
    }
    
}
