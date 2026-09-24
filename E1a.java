//Ejercicio E1a

import java.util.Scanner;

// Usamos Snanner para poder ingresar datos, todo en una terminal, ya que asi es más fácil
// Creamos la función main, que es la función principal, y que es donde se ejecuta el programa.

public class E1a {
    
    // Aquí comienza el main, dónde inicia la ejecución del programa en cuestión

    public static void main(String[] args) {

        // Luego, por aquí dizque comienza todo eso de la ejecución del programa, en dónde se le pide los datos al usuario. 

        int edad = ingresarEntero("¿Cuál es su edad?");

        // Bueno, el int crea una variable entera que se llama edad. 

        double altura = ingresarRealD("¿Cuál es su altura?");

        // Ese double crea una variable que puede tener decimales, y se llama pues altura.
        // Pues entiendo esto, al usuario se le dice: Ole, ¿Cuál es su edad? y luego, ¿Cuál es su altura? y el usuario pues responde con un número entero y un número decimal respectivamente, digamos, tengo 12 años
        // Y mido 1.50 metros, entonces el programa pues guarda esos datos en las variables edad y altura, y luego hace un cálculo, que está más abajo, en la función calculoRestriccion, que básicamente dice: 
        // si tienes 12 años o más y mides más de 1.40 metros, entonces puedes entrar a la atracción, si no, no puedes entrar. Y si tienes más de 60 años, también puedes entra

        String restriccion = calculoRestriccion(edad, altura);

        // Gaby, pues aquí creo una función la cual pues es calculoRestricción, que hace el cálculo de si puedes entrar o no a la atracción, y pues guarda el resultado en la variable restricción
        
        generarMensaje(restriccion);

        // Aquí, como arriba ya se hizo el cálculo y toda esa vuelta
        //  y se guardó el resultado en la variable que se llama restriccion, 
        // lo que hacemos es pasar ese resultado a generarMensaje() para que lo muestre en pantalla del usuario, aunque esto puede salir en nuestra terminal.

    }

    public static int ingresarEntero(String mensaje) {

        // La función ingresarEntero() la creamos. Ella sólo recibe pues números enteros. Dizque, recibe un mensaje, y luego guardar un numero entero.

        Scanner sc = new Scanner(System.in);

        // Acá creamos una herramienta, que se llama Scanner, que nos permite ingresar datos desde la terminal, y luego guardarlos en una variable determinada. 

        System.out.print(mensaje);

        // Aca imprimimos el mensaje que le pasamos a la función, que en este caso es "¿Cuál es su edad?" que para eso sirve la función System.out.print() que es para imprimir en pantalla. 
        // Por ello, usamos Scaneer para que el usuario pueda ingresar su edad, y luego guardarla en una variable y que luego como System.out.print() nos muestre el mensaje en pantalla.

        int valor = sc.nextInt();

        // Aquí el usuario debe de digitar su edad, luego, se guarda en la variable valor, que es del tipo int, que es para guardar números enteros. Que es 32 bits, y que puede guardar números desde -2,147,483,648 hasta 2,147,483,647.

        return valor;

        // Acá retorna el valor que el usuario ingresó, que es su edad, y que luego se guarda en la variable edad. Esa misma esta en el Main. 
    }

    public static double ingresarRealD(String mensaje) {

        // Se crea la función ingresarRealD() que es para ingresar números decimales, y que recibe un mensaje, que en este caso es "¿Cuál es su altura?"
        // Y luego guarda el número decimal que el usuario ingresa en una variable, que es del tipo double, que es para guardar números decimales. 
        // Double es de 64 bit. No usamos int ya que la altura es un número decimal, y no un número entero. Yo, mido 1.74. Gaby digamos que 1.50, y eso no es un número entero, por eso usamos double.
        // A su vez, adentro del () está el String mensaje, que es para textos. Y recibe ¿Cuál es su altura? y luego lo imprime en pantalla, para que el usuario sepa qué debe ingresar. El usuario va a digitar su medidas. 


        Scanner sc = new Scanner(System.in);

        // Se crea un objeto o herramienta Scanner, que nos permite ingresar datos desde la terminal.
        // sc es el nombre que le damos a ese objeto. O sea, Scanner es la clase, y sc es el objeto que creamos de esa clase. 
        // Seria mejor ponerle un nombre más descriptivo, como por ejemplo "scanner" o "entrada" o "lector", pero bueno, se le puso sc. XDDDD luego lo modificamos para que sea más descriptivo, cuando Gaby quiera.
        // Según el pdf que pille de la corporación universitaria empresarial Alexander Von Humboldt, System.in es para reconocer entradas del teclado. 

        System.out.print(mensaje);

        // Imprime el mensje que le pasamos a la función, que en este caso es "¿Cuál es su altura?" y luego el usuario digita su altura y ya, como 1.57 para ejemplificar. 

        double valor = sc.nextDouble();

        // sc.nextDouble() va a leer el número decimal que el usuario que quiera usar el programa va a colocar. 
        //Valor pues almacena el número decimal que el usuario digita, o sea la altura. 
        //según el pdf que pille de la corporación universitaria empresarial Alexander Von Humboldt, universidad antitesis de mi alma, nextDouble() es para leer un número decimal,
        //  y nextInt() es para leer un número entero. Y nextLine() es para leer una línea de texto.


        return valor;

        // Retorna el valor que el usuario ingresó, que es su altura, y que luego se guarda en la variable altura. Y la devuelve a la pantalla del usuario. 
    }
        // Cierre de la función ingresarRealD()

    public static String calculoRestriccion(int edad, double altura) {
    
        // Se crea la función calculoRestriccion() que recibe dos parámetros, o sea la edad y lo que es la
        // altura, y que devuelve un mensaje, que es si puede entrar o no a la atracción. 
        // Se requiere tanto int edad como double altura. Arriba en el comentario lo puse. Pero, resumen int pa' la edad que es entero y double pa' la altura que es decimal. 
        // le ponemos strinlecg ya que devuelve un mensaje, Pa' numeros, usamos o int o double, pero pa' texto usamos string. 

        String mensaje = " ";

        // Pues "" es un espacio en blanco, y lo usamos para que el mensaje que se va a mostrar en pantalla no esté vacío, aunque no es relevante, pero es importante mencionar ello. 

        if (edad >= 12 && altura > 1.40) {

        //Acá hacemos el calculo de si puede entrar o no a la atracción, y lo hacemos con un if, que evalua si o no la edad es mayor o igual a 12 y la altura pues. 

            mensaje = "Bienvenido, puede ingresar a la atracción";

            // Si cumple con la condición, entonces el mensaje que se va a mostrar en pantalla es "Bienvenido, puede ingresar a la atracción".

        } else {

            mensaje = "No puede ingresar a la atracción :(";

            // Sino, pues sale ese mensaje. Por ello else, ya que if es para la condición, y else es para el caso contrario.
        }

        if (edad > 60) {

            mensaje = "Bienvenido, puede ingresar a la atracción";

            // Si es mayor a 60 años, entonces puede entrar a la atracción, aunque no cumpla con la condición de edad y altura. 
        }

        return mensaje;
    }

    public static void generarMensaje(String restriccion) {
        // Recibe el resultado de la restricción y lo muestra en pantalla.  

        String mensaje = restriccion;
        
        // Acá se guarda el resultado de la restricción en la variable mensaje 

        System.out.println(mensaje);
        // Acá se imprime el mensaje en pantalla, que es el resultado de la restricción.
    }
}

// Acá termina el código, y pues básicamente lo que hace es pedirle al usuario su edad y altura, y luego hacer un cálculo para ver si puede entrar a la atracción o no. Y terminar el main.

