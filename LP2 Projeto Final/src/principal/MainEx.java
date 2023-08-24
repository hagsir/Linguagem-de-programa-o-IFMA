/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.Color;
import modelos.ListaCliente;
import modelos.ListaFuncionario;

/**
 *
 * @author joaop
 */
public class MainEx {
    
    public static void main(String args[]) {
        
        ListaCliente listaCli = new ListaCliente();
        ListaFuncionario listaFunc = new ListaFuncionario();
        
        frmLogin frame = new frmLogin(listaCli, listaFunc);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(1,2,7));

    }
    
}
