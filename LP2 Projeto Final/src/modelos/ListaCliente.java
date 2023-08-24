/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import java.util.ArrayList;
import elementos.Cliente;
/**
 *
 * @author joaop
 */
public class ListaCliente{

    private static ArrayList<Cliente> lista = new ArrayList<>();
    

    public boolean salvar(Cliente c) {
        if(c!=null){
            lista.add(c);
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<Cliente> retornarTodos() {
        return lista;
    }

}
