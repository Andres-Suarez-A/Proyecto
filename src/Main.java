import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        List<Pregunta> preguntas = new ArrayList<>();
        preguntas.add(new Pregunta("¿Qué género prefieres?", new String[]{"Accion", "Comedia", "Drama", "Terror", "Ciencia Ficcion", "Romance", "Aventura"}));
        preguntas.add(new Pregunta("¿Qué ritmo prefieres?", new String[]{"Rapido", "Lento"}));
        preguntas.add(new Pregunta("¿Qué duración prefieres?", new String[]{"Hasta 1:30", "Hasta 2 horas", "Hasta 3 horas"}));
        preguntas.add(new Pregunta("¿Para qué tipo de edades?", new String[]{"Apta para todo publico", "Para mayores de 13 años", "Para mayores de 18 años"}));

        String genero = "";
        String ritmo = "";
        String duracion = "";
        String edades = "";

        for (Pregunta pregunta : preguntas) {
            System.out.println(pregunta.getTexto());
            for (int i = 0; i < pregunta.getOpciones().length; i++) {
                System.out.println((i + 1) + ". " + pregunta.getOpciones()[i]);
            }

            int respuesta = scanner.nextInt() - 1;

            if (respuesta < 0 || respuesta >= pregunta.getOpciones().length) {
                System.out.println("Respuesta inválida. Por favor, elige un número válido.");
                int i = 0;
                i--;
                break;
            }

            if (pregunta.getTexto().contains("género")) {
                genero = pregunta.getOpciones()[respuesta];
            } else if (pregunta.getTexto().contains("ritmo")) {
                ritmo = pregunta.getOpciones()[respuesta];
            } else if (pregunta.getTexto().contains("duración")) {
                duracion = pregunta.getOpciones()[respuesta];
            } else if (pregunta.getTexto().contains("edades")) {
                edades = pregunta.getOpciones()[respuesta];
            }
        }

        Recomendador recomendador = new Recomendador();
        Recomendacion resultado = recomendador.recomendar(genero, ritmo, duracion, edades);

        System.out.println("Te recomendamos ver: " + resultado.getNombre());if (!resultado.getEnlace().isEmpty()) {
            System.out.println("Año de lanzamiento: "+ resultado.getAño());
            System.out.println("Donde mirar: "+ resultado.getDondemirar());
            System.out.println("Sinopsis: "+ resultado.getSinopsis());
            System.out.println("Puedes verlo aquí: " + resultado.getEnlace());
            System.out.println("Lo puedes descargar aqui: "+ resultado.getDescargar());
        }
        while (continuar) {
            System.out.print("¿Quieres continuar? (si o no): ");
            scanner.nextLine();
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("no")) {
                continuar = false;
                System.out.println("Hasta luego");
                break;
            } else if (respuesta.equalsIgnoreCase("si")) {
                main(args);
            } else {
                System.out.println("Respuesta incorrecta, por favor responde entre 'si' o 'no'");
            }
        }
        scanner.close();
    }
}
