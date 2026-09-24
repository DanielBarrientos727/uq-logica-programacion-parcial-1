# Java — Resumen condensado de los ejercicios

## Idea general

Los programas de este parcial siguen casi siempre este patrón:

Pedir datos
   ↓
Guardar en variables
   ↓
Enviar datos a una función
   ↓
Hacer cálculo o comparación
   ↓
Devolver resultado
   ↓
Mostrar resultado

La idea principal es separar la lógica en funciones pequeñas y claras.

---

# 1. Estructura básica de un programa


import java.util.Scanner;

public class E1a {
    public static void main(String[] args) {
        // código
    }
}

### ¿Qué significa esto?

- `import java.util.Scanner;` → importa la clase `Scanner` para leer datos del usuario.
- `public class E1a` → define la clase del programa.
- `public static void main(String[] args)` → es el punto de entrada.
- Todo lo que ejecuta el programa va dentro de `main`.

---

# 2. Scanner: leer datos desde teclado


Scanner sc = new Scanner(System.in);


`Scanner` permite leer lo que escribe el usuario.

int edad = sc.nextInt();
double altura = sc.nextDouble();
boolean frecuente = sc.nextBoolean();
String nombre = sc.nextLine();

### Métodos más usados

- `nextInt()` → lee enteros
- `nextDouble()` → lee decimales
- `nextBoolean()` → lee `true` o `false`
- `nextLine()` → lee texto completo

---

# 3. Variables

Una variable guarda un dato.

int edad = 19;
double altura = 1.72;
boolean clienteFrecuente = true;
String nombre = "Daniel";

### Tipos básicos

| Tipo | Sirve para | Ejemplo |
|------|------------|---------|
| `int` | números enteros | `18`, `42`, `1000` |
| `double` | números con decimales | `1.75`, `3.14` |
| `boolean` | verdadero/falso | `true`, `false` |
| `String` | texto | `"Hola"`, `"Juan"` |

### Diferencia entre `=` y `==`

edad = 19;       // asigna un valor
edad == 19;      // compara si es igual

- `=` → asignar
- `==` → comparar

---

# 4. `main` y funciones

public static void main(String[] args) {
    int edad = ingresarEntero("¿Cuál es su edad? ");
    System.out.println("Tu edad es: " + edad);
}

Una función permite reutilizar código y separar responsabilidades.

public static int ingresarEntero(String mensaje) {
    Scanner sc = new Scanner(System.in);
    System.out.print(mensaje);
    int valor = sc.nextInt();
    return valor;
}

### Partes de una función

public static double ingresarRealD(String mensaje)

- `public` → se puede usar desde fuera de la clase
- `static` → se puede llamar sin crear un objeto
- `double` → tipo de dato que devuelve
- `ingresarRealD` → nombre de la función
- `String mensaje` → parámetro recibido

### `return`

return valor;

Significa: “devuelvo este resultado”.

Ejemplo:

public static double ingresarRealD(String mensaje) {
    Scanner sc = new Scanner(System.in);
    System.out.print(mensaje);
    double valor = sc.nextDouble();
    return valor;
}

---

# 5. `if`, `else` y `else if`

## `if`

if (edad >= 12) {
    System.out.println("Puede entrar");
}

Se ejecuta si la condición es `true`.

## `else`

if (peso <= 10) {
    System.out.println("Descuento");
} else {
    System.out.println("Sin descuento");
}

Si no se cumple el `if`, entra al `else`.

## `else if`

```java
if (consumo >= 15) {
    System.out.println("Consumo eficiente");
} else if (consumo >= 10) {
    System.out.println("Consumo moderado");
} else {
    System.out.println("Consumo alto");
}
```

Se usa cuando hay varias condiciones.

---

# 6. Operadores de comparación

| Operador | Significado | Ejemplo |
|----------|-------------|---------|
| `>` | mayor que | `edad > 60` |
| `<` | menor que | `peso < 10` |
| `>=` | mayor o igual | `edad >= 12` |
| `<=` | menor o igual | `peso <= 10` |
| `==` | igual a | `clienteFrecuente == true` |
| `!=` | distinto de | `edad != 18` |

---

# 7. Operador lógico `&&`

if (edad >= 12 && altura > 1.40) {
    System.out.println("Puede ingresar");
}

`&&` significa “Y”.

Las dos condiciones deben cumplirse.

true && true  = true
true && false = false
false && true = false
false && false = false

---

# 8. `System.out.print()` y `System.out.println()`

## `print()`

System.out.print("¿Cuál es su edad? ");

Muestra texto sin saltar de línea.

## `println()`

System.out.println("Hola");
System.out.println("Mundo");
```

Muestra texto y luego salta a la siguiente línea.

---

# 9. Concatenación de textos

String mensaje = "Clasificación: " + clasificacion;

El `+` sirve para unir texto con variables.

System.out.println("El promedio es: " + promedio);


También sirve para sumar números:

int total = 5 + 3; // 8

---

# 10. Operaciones matemáticas

peso * 35000
consumoHogar / personas
valor * 0.10

### Ejemplo de porcentaje

double descuento = 200000 * 0.10;

Eso significa el 10% de 200000:

200000 * 0.10 = 20000


Entonces:

```java
double precioFinal = 200000 - descuento;


---

# 11. Cómo se estructura un ejercicio típico

La mayoría de los ejercicios siguen este patrón:

int edad = ingresarEntero("¿Cuál es su edad? ");
double altura = ingresarRealD("¿Cuál es su altura? ");

String resultado = calculoRestriccion(edad, altura);
System.out.println(resultado);

O sea:

Pedir datos
   ↓
Guardar en variables
   ↓
Llamar a la función
   ↓
Recibir el resultado
   ↓
Mostrarlo


---

# 12. Ejercicio E1a — Restricción de una atracción

## Qué pide

- edad
- altura

## Condición principal


if (edad >= 12 && altura > 1.40)


Se permite entrar si:

- la persona tiene 12 años o más
- y mide más de 1.40 metros

Además:

if (edad > 60)


También puede entrar si es mayor de 60 años.

## Idea de la función


public static String calculoRestriccion(int edad, double altura)

Recibe edad y altura y devuelve un mensaje final como:

"Bienvenido, puede ingresar"

---

# 13. Ejercicio E1b — Descuento para clientes

## Qué pide

- valor de compra
- si es cliente frecuente
- edad

## Condición principal

if (valorCompra > 200000 && clienteFrecuente == true)

Se aplica descuento si:

- la compra es mayor a 200000
- y además es cliente frecuente

También se revisa:

if (edad > 65)

para aplicar una condición adicional.

---

# 14. Ejercicio E2a — Consumo de agua

## Qué pide

- consumo del hogar
- cantidad de personas

## Cálculo

double promedio = consumoHogar / personas;

Se divide el consumo total entre la cantidad de personas.

## Condición

if (promedio <= 100)

- si es menor o igual a 100: consumo adecuado
- si es mayor: consumo excesivo

---

# 15. Ejercicio E2b — Precio de la mascota

## Qué pide

- peso de la mascota

## Fórmulas

double mascotaPeso10 = peso * 35000;
double mascotaMayor = peso * 50000;

## Condición

if (peso <= 10)

Si pesa 10 kg o menos, se calcula un descuento del 10%.

double descuento = mascotaPeso10 * 0.10;
mascotaPeso10 = mascotaPeso10 - descuento;


---

# 16. Ejercicio E3b — Clasificación de consumo

## Qué pide

- consumo

## Lógica

if (consumo >= 15) {
    // Consumo eficiente
} else if (consumo >= 10) {
    // Consumo moderado
} else {
    // Consumo alto
}


Primero revisa la mejor condición; si no se cumple, prueba la siguiente.

---

# 17. Cómo leer una función

Cuando vemos algo como:


public static String calculoDescuento(double valorCompra, boolean clienteFrecuente, int edad)

se puede leer así:

> “La función `calculoDescuento` recibe tres datos: un decimal, un booleano y un entero; y devuelve un texto.”

Es la forma más simple de entender una función.

---

# 18. Patrón que se repite en casi todos los ejercicios


int edad = ingresarEntero("¿Cuál es su edad? ");

String resultado = calculoRestriccion(edad, altura);

System.out.println(resultado);


O también

double peso = ingresarRealD("¿Cuál es el peso? ");
String mensaje = calculoPrecio(peso);
System.out.println(mensaje);

### Responsabilidades típicas

- `ingresar...()` → pedir datos
- `calcular...()` → hacer lógica
- `generar...()` → crear el mensaje final
- `System.out.println()` → mostrar resultado

---

# 19. Chuleta rápida


int      → número entero
double   → número decimal
boolean  → true / false
String   → texto

Scanner  → leer entrada del usuario
nextInt  → lee enteros
nextDouble → lee decimales
nextBoolean → lee true/false

if       → condición
else     → caso contrario
else if  → otra condición
&&       → Y

>        → mayor que
<        → menor que
>=       → mayor o igual
<=       → menor o igual
==       → comparar igualdad
=        → asignar valor

return   → devolver resultado
+        → concatenar o sumar
*        → multiplicar
/        → dividir

---

# 20. La idea más importante

No se trata solo de memorizar Java.

La verdadera idea es convertir un problema real en lógica:

¿Qué datos necesito?
   ↓
¿Qué tipo de dato son?
   ↓
¿Qué condiciones deben cumplirse?
   ↓
¿Qué operación necesito hacer?
   ↓
¿Qué resultado quiero entregar?
   ↓
¿Cómo lo muestro al usuario?

Eso es lo que realmente se está practicando en estos ejercicios.

---

# 21. Plantilla útil para estudiar

import java.util.Scanner;

public class MiPrograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad = ingresarEntero("Edad: ");
        double altura = ingresarRealD("Altura: ");

        String resultado = calculoRestriccion(edad, altura);
        System.out.println(resultado);
    }

    public static int ingresarEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        return sc.nextInt();
    }

    public static double ingresarRealD(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    public static String calculoRestriccion(int edad, double altura) {
        if (edad >= 12 && altura > 1.40) {
            return "Puede ingresar";
        } else {
            return "No puede ingresar";
        }
    }
}

Este patrón se repite en casi todos los ejercicios del parcial.
