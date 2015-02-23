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
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return "That sounds interesting. Tell me more...";
    }
}
