import java.util.Scanner;

public class ClasificadorSO {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int windows = 0;
        int linux = 0;
        int macos = 0;

        System.out.println("=================================");
        System.out.println("       TEST: ¿QUÉ SO VA CONTIGO?");
        System.out.println("=================================");

        // Pregunta 1
        System.out.println("\n1. ¿Qué valoras más en un sistema operativo?");
        System.out.println("1. Facilidad y compatibilidad");
        System.out.println("2. Personalización y control");
        System.out.println("3. Diseño y ecosistema");

        int respuesta1 = scanner.nextInt();

        if (respuesta1 == 1) {
            windows += 2;
        } else if (respuesta1 == 2) {
            linux += 2;
        } else if (respuesta1 == 3) {
            macos += 2;
        }

        // Pregunta 2
        System.out.println("\n2. ¿Qué tan importante es poder modificar el sistema?");
        System.out.println("1. Poco");
        System.out.println("2. Mucho");
        System.out.println("3. Me interesa, pero sin complicarme");

        int respuesta2 = scanner.nextInt();

        if (respuesta2 == 1) {
            windows += 1;
            macos += 1;
        } else if (respuesta2 == 2) {
            linux += 2;
        } else if (respuesta2 == 3) {
            windows += 1;
        }

        // Pregunta 3
        System.out.println("\n3. ¿Qué te importa más?");
        System.out.println("1. Juegos");
        System.out.println("2. Programación");
        System.out.println("3. Diseño y creatividad");

        int respuesta3 = scanner.nextInt();

        if (respuesta3 == 1) {
            windows += 2;
        } else if (respuesta3 == 2) {
            linux += 2;
        } else if (respuesta3 == 3) {
            macos += 2;
        }

        // Pregunta 4
        System.out.println("\n4. ¿Qué prefieres?");
        System.out.println("1. Que todo funcione de inmediato");
        System.out.println("2. Tener control total");
        System.out.println("3. Una experiencia muy integrada");

        int respuesta4 = scanner.nextInt();

        if (respuesta4 == 1) {
            windows += 2;
        } else if (respuesta4 == 2) {
            linux += 2;
        } else if (respuesta4 == 3) {
            macos += 2;
        }

        // Pregunta 5
        System.out.println("\n5. ¿Qué te parece más atractivo?");
        System.out.println("1. Compatibilidad con muchísimo software");
        System.out.println("2. Software libre y código abierto");
        System.out.println("3. Integración entre dispositivos");

        int respuesta5 = scanner.nextInt();

        if (respuesta5 == 1) {
            windows += 2;
        } else if (respuesta5 == 2) {
            linux += 2;
        } else if (respuesta5 == 3) {
            macos += 2;
        }

        // Mostrar resultados
        System.out.println("\n=================================");
        System.out.println("             RESULTADO");
        System.out.println("=================================");

        System.out.println("Windows: " + windows + " puntos");
        System.out.println("Linux:   " + linux + " puntos");
        System.out.println("macOS:   " + macos + " puntos");

        // Determinar resultado
        if (windows > linux && windows > macos) {

            System.out.println("\nTu perfil encaja más con Windows.");

        } else if (linux > windows && linux > macos) {

            System.out.println("\nTu perfil encaja más con Linux.");

        } else if (macos > windows && macos > linux) {

            System.out.println("\nTu perfil encaja más con macOS.");

        } else {

            System.out.println("\nTienes un perfil bastante equilibrado.");
        }

        scanner.close();
    }
}