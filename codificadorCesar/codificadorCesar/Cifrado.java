
/**
 * en este primer intento consegui que cualquier sea el valor ingresado sin 
 * distinguir si es letra o simbolo con el podamos cifrar el String
 * 
 */
public class Cifrado
{
    private String texto = "";
    
    public Cifrado(){
     
        
    }
    
    
    public String cifrado(String mensaje, int desp){
        assert desp>0 : "numero no valido";    
        texto = "";
         desp= desp % 128;
        for(int pos = 0; pos<mensaje.length(); pos++){
            char actual= mensaje.charAt(pos); 
             actual= (char)(actual + desp);
            texto = texto + actual;
        }
        return texto;
        
        }
    
        
        public String deCodificador(String mensaje, int desp){
        assert desp>0 : "numero no valido" ;    
         texto = "";
         desp= desp % 128;
        for(int pos = 0; pos<mensaje.length(); pos++){
            char actual= mensaje.charAt(pos); 
             actual= (char)(actual - desp);
            texto = texto + actual;
        }
        return texto;
    }   
      
   }