import java.util.*;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    // Random para seleccionar respuestas
    private Random rnd;
    // ArrayList de respuestas para elegir
    private ArrayList<String> respuestas;
    // Diccionario de palabras clave
    private HashMap<String, String> palabrasClave;
    
    /**
     * Construct a Responder
     */
    public Responder()
    {
        // Inicializamos los atributos
        rnd = new Random(System.currentTimeMillis());
        // Creamos cinco frases para el arrayList
        respuestas = new ArrayList<String>();
        respuestas.add("I cannot reproduce that error");
        respuestas.add("You need to contact you OS support");
        respuestas.add("Can you repeat it, please?");
        respuestas.add("Have you tryed rebooting?");
        respuestas.add("Its not an error, its a feature");
        respuestas.add("That sounds interesting. Tell me more...");
        
        palabrasClave = new HashMap();
        palabrasClave.put("Hello", "Hello, how can i help you?");
        palabrasClave.put("help", "Can i help?");
        palabrasClave.put("error", "It seems like a problem with your OS");
        palabrasClave.put("shutdown", "Have you updated your graphic card drivers?");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int num = rnd.nextInt(respuestas.size());
        String texto = respuestas.get(num);
        return texto;
    }
    
    /**
     * Generate a response with a key word.
     * @return   A string that should be displayed as the response
     */
    public String generateResponseWithKey(String key)
    {
        String texto = palabrasClave.get(key);
        return texto;
    }
    
    /**
     * Check if a word is in the key word list
     * @return True if its in, false if not
     */
    public boolean checkWord(String word)
    {
        return palabrasClave.containsKey(word);
    }
}
