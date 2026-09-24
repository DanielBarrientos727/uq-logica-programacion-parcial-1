# Parcial I - Lógica de Programación (02N - 2026-2)

[![Java Version](https://img.shields.io/badge/Java-17%2B-orange.svg)](https://www.oracle.com/java/)
[![University](https://img.shields.io/badge/Universidad-Del%20Quind%C3%ADo-green.svg)](https://www.uniquindio.edu.co/)
[![Faculty](https://img.shields.io/badge/Facultad-Ingenier%C3%ADa-blue.svg)](https://www.uniquindio.edu.co/)

Repositorio con los ejercicios, análisis de Pensamiento Computacional y soluciones en Java correspondientes al **Parcial I del curso de Lógica de Programación (Grupo 02N - 2026-2)** del Programa de Ingeniería de Sistemas y Computación de la Universidad del Quindío.

---

## 🎯 Resultados de Aprendizaje Evaluados

* **R.A.1:** Identificar los fundamentos del proceso de solución de problemas mediante la construcción de aplicaciones basadas en el uso de un computador en el contexto de la Ingeniería de Sistemas y Computación.
* **R.A.2:** Analizar un contexto de manera crítica para la identificación de requisitos funcionales, aplicando principios éticos y morales para solucionar problemas del entorno.

---

## 📐 Estructura del Parcial y Contenido

El parcial consta de **3 puntos principales**, estructurados bajo la metodología de **Pensamiento Computacional**:

* Abstracción
* Descomposición
* Reconocimiento de Patrones
* Codificación

Además, se aplica la **modularización mediante funciones**.

### 1. Expresiones Lógicas en Contexto (1.0 pt)

#### 1.A — Validación de Acceso a Parque de Diversiones

* **Condición:** Edad ≥ 12 y estatura > 1.40 m, o edad > 60 años (acceso especial).
* **Valores de prueba:** `edad = 58`, `estatura = 1.45`
* **Resultado:** `true`
* **Justificación:** Cumple con la condición de edad ≥ 12 y estatura > 1.40 m.

#### 1.B — Descuento en Tienda Deportiva

* **Condición:** (Compra > $200.000 y cliente frecuente) o edad > 65 años.
* **Valores de prueba:** `valorCompra = 180000`, `clienteFrecuente = false`, `edad = 68`
* **Resultado:** `true`
* **Justificación:** Cumple la condición de edad > 65 años.

---

### 2. Pensamiento Computacional y Solución Modular (3.0 pts)

#### 2.A — Análisis de Consumo Diario de Agua (1.5 pts)

Calcula el consumo promedio diario de agua por persona en una vivienda a partir del total de litros utilizados y la cantidad de habitantes.

El consumo se clasifica de la siguiente manera:

* **Consumo promedio ≤ 100 L/persona:** `"Consumo adecuado"`
* **Consumo promedio > 100 L/persona:** `"Consumo elevado"`

#### 2.B — Servicio de Lavandería para Mascotas (1.5 pts)

Calcula la tarifa del servicio de lavado según el peso de la mascota e incluye un descuento cuando corresponda.

| Peso de la Mascota | Valor por Kg | Descuento |
| :----------------- | :----------- | :-------- |
| **Hasta 10 kg**    | $35.000      | 10%       |
| **Más de 10 kg**   | $50.000      | No aplica |

---

### 3. Funciones Independientes (1.0 pt)

#### 3.A — Cálculo de Consumo de Combustible (0.5 pts)

Calcula el consumo de combustible utilizando la fórmula:

$$
\text{Consumo} = \frac{\text{Distancia Recorrida (km)}}{\text{Cantidad de Combustible (L)}}
$$

La función recibe los parámetros necesarios y retorna el consumo obtenido en **km/L**.

#### 3.B — Clasificación del Consumo (0.5 pts)

Clasifica el nivel de eficiencia según el rendimiento obtenido:

* **Consumo ≥ 15:** `"Consumo eficiente"`
* **10 ≤ Consumo ≤ 14.99:** `"Consumo moderado"`
* **Consumo < 10:** `"Consumo alto"`

---

## 🛠️ Tecnologías y Metodologías Aplicadas

* **Lenguaje:** Java (JDK 17 o superior)
* **Metodología:** Pensamiento Computacional

  * Abstracción
  * Descomposición
  * Reconocimiento de Patrones
  * Codificación
* **Diseño:** Modularización mediante funciones de responsabilidad única

---

## 📊 Rúbrica de Evaluación

| Componente    |  Puntos | Criterios Evaluados                                                                   |
| :------------ | :-----: | :------------------------------------------------------------------------------------ |
| **Punto 1**   |  1.0 pt | Construcción correcta de expresiones booleanas y su evaluación                        |
| **Punto 2.A** | 1.5 pts | Documentación de las 4 fases de Pensamiento Computacional + implementación en Java    |
| **Punto 2.B** | 1.5 pts | Documentación de las 4 fases de Pensamiento Computacional + aplicación de condiciones |
| **Punto 3.A** | 0.5 pts | Función de cálculo matemático con parámetros y retorno único                          |
| **Punto 3.B** | 0.5 pts | Función de clasificación condicional                                                  |

> ⚠️ **Nota:** La nota final del parcial depende del factor de sustentación oral (0.0 a 1.0).
>
> **Nota Final = Nota Escrita × Factor de Sustentación**

---

## 🚀 Ejecución del Proyecto

### 1. Clonar el repositorio

```bash
git clone https://github.com/tu-usuario/uq-logica-programacion-parcial-1.git
```

### 2. Acceder al proyecto

```bash
cd uq-logica-programacion-parcial-1
```

### 3. Compilar y ejecutar

La ejecución dependerá de la estructura y clases definidas en el proyecto.

---

## 👨‍💻 Autor

**Daniel Barrientos**

Estudiante de Ingeniería de Sistemas y Computación
**Universidad del Quindío — 2026-2**
