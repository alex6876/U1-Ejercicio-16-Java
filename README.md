# 🎮 Ejercicio — Registro de Videojuego

---

## 📝 Descripción

El sistema implementa la clase Videojuego para controlar la información básica de un título de la biblioteca del usuario, garantizando que el recuento de tiempo no sea negativo y determinando si se considera un juego prolongado al superar las 50 horas acumuladas.

---

## 🚀 Funcionalidades e Implementación

### 📦 Clase Videojuego

* **Atributos:**
* **nombre** (String): Título o nombre del videojuego.
* **genero** (String): Género al que pertenece la obra (ej. Terror, Acción, RPG).
* **horasJugadas** (double): Cantidad total de horas acumuladas en el juego.


* **Métodos Implementados:**
* **Constructor Videojuego:** Registra el título, género y horas jugadas iniciales, asegurando que si las horas son negativas se inicialicen en 0 por defecto.
* **registrarSesion(double horas):** Incrementa el contador global sumando las horas transcurridas en una nueva sesión de juego.
* **esJuegiProlongado():** Evalúa el tiempo total invertido, retornando true si alcanza o supera las 50 horas de juego, o false en caso contrario.
* **mostrar():** Imprime en consola el nombre del título, género, total de horas jugadas y si califica como un juego prolongado.



---

## 💻 Programa Principal (main)

El flujo principal ejecuta la siguiente simulación de partida:

1. Instancia el juego "Alan Wake" de género "Terror" con 0 horas iniciales.
2. Registra tres sesiones consecutivas de 15 horas cada una.
3. Registra una cuarta sesión de 28 horas adicionales.
4. Despliega en pantalla los detalles del videojuego, confirmando que se considera un juego prolongado al acumular un total de 73 horas jugadas.
