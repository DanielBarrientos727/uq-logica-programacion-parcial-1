# Parcial I - Lógica de Programación (02N - 2026-2)

[![Java Version](https://img.shields.io/badge/Java-17%2B-orange.svg)](https://www.oracle.com/java/)
[![University](https://img.shields.io/badge/Universidad-Del%20Quind%C3%ADo-green.svg)](https://www.uniquindio.edu.co/)
[![Faculty](https://img.shields.io/badge/Facultad-Ingenier%C3%ADa-blue.svg)](https://www.uniquindio.edu.co/)

Repositorio con los ejercicios, análisis de Pensamiento Computacional y soluciones en Java correspondientes al **Parcial I del curso de Lógica de Programación (Grupo 02N - 2026-2)** del Programa de Ingeniería de Sistemas y Computación de la Universidad del Quindío.

---

## 🎯 Resultados de Aprendizaje Evaluados

- **R.A.1:** Identificar los fundamentos del proceso de solución de problemas mediante la construcción de aplicaciones basadas en el uso de un computador en el contexto de la Ingeniería de Sistemas y Computación[cite: 1].
- **R.A.2:** Analizar un contexto de manera crítica para la identificación de requisitos funcionales, aplicando principios éticos y morales para solucionar problemas del entorno[cite: 1].

---

## 📐 Estructura del Parcial y Contenido

El parcial consta de 3 puntos principales estructurados bajo la metodología de **Pensamiento Computacional** (*Abstracción, Descomposición, Reconocimiento de Patrones y Codificación*) y modularización mediante funciones[cite: 1].

### 1. Expresiones Lógicas en Contexto (1.0 pto)[cite: 1]
- **1.A — Validación de Acceso a Parque de Diversiones:**[cite: 1]
  - *Condición:* Edad $\ge 12$ y estatura $> 1.40\text{ m}$, o edad $> 60$ años (acceso especial)[cite: 1].
  - *Valores de prueba:* `edad = 58`, `estatura = 1.45`[cite: 1].
  - *Resultado:* `true` (Cumple edad $\ge 12$ y estatura $> 1.40\text{ m}$).
- **1.B — Descuento en Tienda Deportiva:**[cite: 1]
  - *Condición:* (Compra $> \$200.000$ y cliente frecuente) o edad $> 65$ años[cite: 1].
  - *Valores de prueba:* `valorCompra = 180000`, `clienteFrecuente = false`, `edad = 68`[cite: 1].
  - *Resultado:* `true` (Cumple edad $> 65$).

---

### 2. Pensamiento Computacional y Solución Modular (3.0 pts)[cite: 1]

#### 2.A — Análsis de Consumo Diario de Agua (1.5 pts)[cite: 1]
- **Descripción:** Calcula el consumo promedio diario de agua por persona en una vivienda a partir del total de litros utilizados y la cantidad de habitantes[cite: 1]. Determina el estado:
  - Consumo promedio $\le 100\text{ L/persona}$: **"Consumo adecuado"**[cite: 1].
  - Consumo promedio $> 100\text{ L/persona}$: **"Consumo elevado"**[cite: 1].

#### 2.B — Servicio de Lavandería para Mascotas (1.5 pts)[cite: 1]
- **Descripción:** Calcula el tarifa del servicio de lavado según el peso de la mascota e incluye un descuento cuando corresponda[cite: 1]:

| Peso de la Mascota | Valor por Kg | Descuento |
| :--- | :--- | :--- |
| **Hasta 10 kg** | \$35.000 | 10% |
| **Más de 10 kg** | \$50.000 | No aplica |

---

### 3. Funciones Independientes (1.0 pto)[cite: 1]

#### 3.A — Cálculo de Consumo de Combustible (0.5 pts)[cite: 1]
- **Fórmula:**
  $$\text{Consumo} = \frac{\text{Distancia Recorrida (km)}}{\text{Cantidad de Combustible (L)}}$$
[cite: 1]
- Recibe los parámetros requeridos y retorna el consumo obtenido ($\text{km/L}$)[cite: 1].

#### 3.B — Clasificación del Consumo (0.5 pts)[cite: 1]
- Clasifica el nivel de eficiencia en función del rendimiento previamente determinado[cite: 1]:
  - $\text{Consumo} \ge 15$: **"Consumo eficiente"**[cite: 1].
  - $10 \le \text{Consumo} \le 14.99$: **"Consumo moderado"**[cite: 1].
  - $\text{Consumo} < 10$: **"Consumo alto"**[cite: 1].

---

## 🛠️ Tecnologías y Metodologías Aplicadas

- **Lenguaje:** Java (JDK 17 o superior)[cite: 1]
- **Metodología:** Pensamiento Computacional (Abstracción, Descomposición, Reconocimiento de Patrones, Codificación)[cite: 1]
- **Diseño:** Modularización con funciones de responsabilidad única[cite: 1]

---

## 📊 Rúbrica de Evaluación

| Componente | Puntos | Criterios Evaluados |
| :--- | :--- | :--- |
| **Punto 1** | 1.0 pt | Construcción correcta de expresiones booleanas y su evaluación[cite: 1]. |
| **Punto 2.A** | 1.5 pts | Documentación de las 4 fases de Pensamiento Computacional + Implementación en Java[cite: 1]. |
| **Punto 2.B** | 1.5 pts | Documentación de las 4 fases de Pensamiento Computacional + Aplicación de condiciones[cite: 1]. |
| **Punto 3.A** | 0.5 pts | Función de cálculo matemático con parámetros y retorno único[cite: 1]. |
| **Punto 3.B** | 0.5 pts | Función de clasificación condicional[cite: 1]. |

> ⚠️ **Nota:** La nota final del parcial depende del factor de sustentación oral ($0.0 \text{ a } 1.0$), donde $\text{Nota Final} = \text{Nota Escrita} \times \text{Factor de Sustentación}$[cite: 1].

---

## 🚀 Ejecución del Proyecto

1. Clonar el repositorio:
   ```bash
   git clone [https://github.com/tu-usuario/uq-logica-programacion-parcial-1.git](https://github.com/tu-usuario/uq-logica-programacion-parcial-1.git)
   cd uq-logica-programacion-parcial-1
