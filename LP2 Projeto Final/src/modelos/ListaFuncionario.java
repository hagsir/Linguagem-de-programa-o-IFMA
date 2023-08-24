/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import java.util.ArrayList;
import elementos.Funcionario;
/**
 *
 * @author joaop
 */
public class ListaFuncionario{

    private static ArrayList<Funcionario> lista = new ArrayList<>();
    
        public boolean salvarFunc(Funcionario c) {
        if(c!=null){
            lista.add(c);
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<Funcionario> retornarTodosFunc() {
        return lista;
    }
    
}
