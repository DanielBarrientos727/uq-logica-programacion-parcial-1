# Guía de Colaboración (CONTRIBUTING)

¡Hola! Esta guía está diseñada especialmente para estudiantes que están comenzando a utilizar **Git y GitHub** en el curso de **Lógica de Programación**. 

Aquí aprenderás los pasos básicos para trabajar en equipo, subir tus cambios y proponer mejoras en el repositorio.

---

## 🛠️ Flujo de Trabajo Básico con Git

### 1. Clonar el repositorio
Para descargar una copia del proyecto en tu computador, abre tu terminal y ejecuta:
```bash
git clone https://github.com/TU-USUARIO/uq-logica-programacion-parcial-1.git
```
*(Reemplaza la URL con la dirección exacta de tu repositorio).*

Luego, entra a la carpeta del proyecto:
```bash
cd uq-logica-programacion-parcial-1
```

### 2. Crear una nueva rama (Branch)
Nunca trabajes directamente sobre la rama principal (`main`). Crea siempre una rama con tu nombre o el tema en el que vas a trabajar:
```bash
git checkout -b feature/nombre-del-ejercicio
```
*Ejemplo:* `git checkout -b mi-nombre/ejercicio-nuevo`

### 3. Hacer cambios y guardar (Commit)
Realiza los ejercicios o modificaciones necesarias en tu editor de código. Una vez termines:

* **Paso A: Añadir los archivos modificados al área de preparación:**
  ```bash
  git add nombre-archivo.java
  ```
  *(O usa `git add .` si modificaste varios archivos).*

* **Paso B: Guardar los cambios con un mensaje claro (Commit):**
  ```bash
  git commit -m "Agrega solución del ejercicio X y documentación"
  ```

### 4. Subir tus cambios a GitHub (Push)
Envía tu rama con los cambios al repositorio remoto en GitHub:
```bash
git push origin feature/nombre-del-ejercicio
```

---

## 🔀 Crear un Pull Request (PR)

Una vez que hiciste el `push`, tus cambios ya están en GitHub. Para integrarlos al proyecto principal:

1. Entra a GitHub en tu navegador y ve a tu repositorio.
2. Verás un aviso que dice **"Compare & pull request"** (Comparar y crear solitud de extracción). Haz clic en ese botón.
3. Escribe un título breve y una descripción de lo que agregaste o resolviste.
4. Haz clic en **"Create pull request"**.
5. ¡Listo! Tu profesor o compañeros podrán revisar los cambios.

---

💡 **Consejo útil:** Si tienes dudas con algún comando de Git, recuerda que puedes consultar los apuntes de clase o preguntar a tus compañeros. ¡A practicar!
