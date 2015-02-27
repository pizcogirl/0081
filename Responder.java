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
    private HashMap<HashSet, String> palabrasClave;

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
        HashSet<String> listado = new HashSet();
        HashSet<String> listado2 = new HashSet();
        HashSet<String> listado3 = new HashSet();
        HashSet<String> listado4 = new HashSet();
        HashSet<String> listado5 = new HashSet();
        HashSet<String> listado6 = new HashSet();
        palabrasClave = new HashMap();
        listado.add("hello");
        palabrasClave.put(listado, "Hello, how can i help you?");
        listado2.add("app");
        listado2.add("free");
        palabrasClave.put(listado2, "No sorry");
        listado3.add("app");
        palabrasClave.put(listado3, "Yes we have an app");
        listado4.add("crash");
        listado4.add("linux");
        listado4.add("problem");
        palabrasClave.put(listado4, "Update your OS");
        listado5.add("linux");
        listado5.add("problem");
        palabrasClave.put(listado5, "We dont give support to linux");
        listado6.add("crash");
        listado6.add("linux");
        palabrasClave.put(listado6, "Really?");
    }

    /**
     * Generate a response.
     * @param word The word to check if its a key word or not
     * @return A string that should be displayed as the response
     */
    public String generateResponse(HashSet palabras)
    {
        String texto = "";
        if (palabrasClave.containsKey(palabras))
        {
            texto = palabrasClave.get(palabras);
        }
        else
        {
            if(respuestas.size() > 0)
            {
                int num = rnd.nextInt(respuestas.size());
                texto = respuestas.get(num);
                respuestas.remove(texto);
            }
            else
            {
                texto = "I cant understand you";
            }
        }
        return texto;
    }

}
