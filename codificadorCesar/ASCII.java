
/**
 *ASCII esta clase es para que cualquier letras/simbolo/caracter que hayamos ingresado
 *devuelva el valor numerico para poder usarlo dentro de un cifrado
 *lo que nos ayudara a cambiarlo 
 *
 *
 *
 *
 */
public class ASCII
{
    /** 
     * Mensajes. Los mensajes representan texto en formato ASCII (formato de 128 s ́ımbolos, que incluye letras
        y caracteres num ́ericos, espacios y caracteres b ́asicos de control, etc.). Un mensaje est ́a organizado en
        lineas (los renglones del mensaje) de hasta 80 caracteres, y almacenado internamente en una lista.
    */
    
    /**
     * Con las siguientes lineas de codigo vamos a poder devolver y cambiar cualquie sea el caracter que hayan ingresado y devolver s cifrado 
     */
    
    
    
    
    private char letra;
    public ASCII(char valor){
    
        letra = valor;
    }
    
    public char getChar(){
        return letra;
    }
    
    public int getCharNum(){
        return letra;
    
    }
    
    public void sumar (int num){
        letra = (char) (letra + num);
        }
}
