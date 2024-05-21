import java.util.ArrayList;
/**
 * Write a description of class ProyectoU here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * Tengo que cambiar muchas cosas 
 * 
 */
public class ProyectoU
{
    private ArrayList  listaDmensajes = new ArrayList<String>();
    /**
     * Constructor for objects of class ProyectoU
     */
    public ProyectoU()
    {
        listaDmensajes = new ArrayList<String>();
    }

    public void agregarMensaje(String mensaje){
        listaDmensajes.add(mensaje);
    }
    
    public void remoerElemento(int x){
        listaDmensajes.remove( x );
    }     
        
    public void getMensaje(int x){
        System.out.println( listaDmensajes.get(x));
    }
    
    
}
