
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fuent
 */
public class FactoryStack {
    public FactoryStack(){}
    
    public Stack factoryStack(String tipo){
        if (tipo.equals("1")){
            //TODO: arreglar tipo de dato-interfaz arrayList-Stack(List)?
            //return new ArrayList();
            return null;
        }else if(tipo.equals("2")){
            return new Pila();
        }else{
            return null;
        }
    }
    
}
