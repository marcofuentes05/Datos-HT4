
/**
 *
 * @author Marco Fuentes
 */

public class FactoryStack {
    public FactoryStack(){}    
    public Stack factoryStack(String tipo){
        if (tipo.equals("1")){
            return new PilaArrayList();
        }else if(tipo.equals("2")){
            return new PilaVector();
        }else if (tipo.equals("3")){
            return new PilaLista(1);
        }else if (tipo.equals("4")){
            return new PilaLista(2);
        }else if (tipo.equals("5")){
            return new PilaLista(3);
        }else{
            return null;
        }
    }
    
}
