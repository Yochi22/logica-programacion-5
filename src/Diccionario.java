import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {

    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("pintura", "paint");
        diccionario.put("silla", "chair");
        diccionario.put("escritorio", "desktop");
        diccionario.put("bombillo", "light bulb");
        diccionario.put("computador", "computer");
        diccionario.put("tijera", "scissors");
        diccionario.put("portarretrato", "portrait");
        diccionario.put("ventana", "window");
        diccionario.put("arbol", "tree");
        diccionario.put("vidrio", "glass");
        diccionario.put("mascota", "pet");
        diccionario.put("celular", "cellphone");
        diccionario.put("zapato", "shoe");
        diccionario.put("terraza", "terrace");
        diccionario.put("reloj", "clock");
        diccionario.put("televisor", "tv");
        diccionario.put("fiesta", "party");
        diccionario.put("audifonos", "earphones");
        diccionario.put("vestido", "dress");
        diccionario.put("manzana", "apple");

        String[] palabrasEspanol = diccionario.keySet().toArray(new String[0]);
        Random rand = new Random();
        String[] palabrasRandom = new String[5];
        for (int i = 0; i < 5; i++) {
            int Aleatorio = rand.nextInt(palabrasEspanol.length);
            palabrasRandom[i] = palabrasEspanol[Aleatorio];
        }

        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        for (String palabraEsp : palabrasRandom) {
            System.out.print("Traduce la palabra  " + palabraEsp + "  al inglés: ");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase(diccionario.get(palabraEsp))) {
                System.out.println("Es Correcto");
                respuestasCorrectas++;
            } else {
                System.out.println("Es Incorrecto. La respuesta correcta es: " + diccionario.get(palabraEsp));
                respuestasIncorrectas++;
            }
        }

        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }
}
