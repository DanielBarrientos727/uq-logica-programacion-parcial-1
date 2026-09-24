# Funciones para reutilizar

Estas funciones permiten **ingresar diferentes tipos de datos** desde el teclado.

## Código de las funciones

public static String ingresarTexto(String mensaje) {

    Scanner sc = new Scanner(System.in);

    System.out.print(mensaje);

    String texto = sc.nextLine();

    return texto;
}

public static double ingresarRealD(String mensaje) {

    Scanner sc = new Scanner(System.in);

    System.out.print(mensaje);

    double valor = sc.nextDouble();

    return valor;
}

public static int ingresarEntero(String mensaje) {

    Scanner sc = new Scanner(System.in);

    System.out.print(mensaje);

    int valor = sc.nextInt();

    return valor;
}

public static float ingresarRealF(String mensaje) {

    Scanner sc = new Scanner(System.in);

    System.out.print(mensaje);

    float valor = sc.nextFloat();

    return valor;
}

## ¿Para qué sirve cada función?

### `ingresarTexto()`

Se usa cuando necesitas pedir **palabras o frases**.

String nombre = ingresarTexto("Ingrese su nombre: ");

Ejemplos:

* Nombre
* Ciudad
* Carrera
* Respuesta `"si"` / `"no"`

---

### `ingresarRealD()`

Se usa para números con **decimales**, utilizando `double`.

double estatura = ingresarRealD("Ingrese su estatura: ");

Ejemplos:

* Estatura → `1.75`
* Peso → `74.5`
* Precio → `12500.50`
* Temperatura → `23.6`

Para el parcial del parque:

double estatura = ingresarRealD("Ingrese su estatura en metros: ");

---

### `ingresarEntero()`

Se usa para **números sin decimales**, utilizando `int`.

int edad = ingresarEntero("Ingrese su edad: ");

Ejemplos:

* Edad → `19`
* Cantidad de productos → `5`
* Número de personas → `10`
* Opción de menú → `1`

Para el parcial:

int edad = ingresarEntero("Ingrese su edad: ");
---

### `ingresarRealF()`

También sirve para números con decimales, pero utilizando `float`.

float temperatura = ingresarRealF("Ingrese la temperatura: ");

Ejemplos:

* Temperatura
* Medidas decimales
* Valores donde `float` sea suficiente

**Para tu parcial probablemente no necesites `float`.** Si la profesora está trabajando con `double`, utiliza `ingresarRealD()`.

---

## Para memorizarlo rápido

String → texto
int    → número entero
double → número decimal
float  → número decimal

## Lo que más vas a usar en el parcial

int edad = ingresarEntero("Edad: ");

double estatura = ingresarRealD("Estatura: ");

Con esas dos funciones ya puedes resolver buena parte de los ejercicios de entrada de datos del parcial.
