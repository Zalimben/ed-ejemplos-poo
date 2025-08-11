# Ejemplos POO en Java

Este repositorio contiene ejemplos sencillos para ilustrar conceptos de Programación Orientada a Objetos (POO) en Java. El código está organizado en paquetes temáticos con clases e interfaces que muestran herencia, polimorfismo, encapsulamiento y uso de interfaces.

Última actualización: 2025-08-10 20:15

## Requisitos
- Java 8 (1.8) o superior
- Apache Maven 3.x

## Estructura del proyecto

- Paquete `edatos.ejemplosPOO.Animales`
  - Clases: `Animales` (base), `Perro`, `Gato`, `Lobo`, `Humano`, `Yaguarete`.
  - Interfaces: `Caninos`, `Felinos`, `Taxonomia`.
  - Demo: `PruebaAnimales`.

- Paquete `edatos.ejemplosPOO.Figuras`
  - Clases/Abstractas: `Figura`, `Circulo`, `Rectangulo`, `Cuadrado`.
  - Interfaces: `Dibujable`.
  - Incluye métodos de área y perímetro y una clase `Prueba` de ejemplo.

- Paquete `edatos.ejemplosPOO.Personales`
  - Subpaquete `interfaces`: `Caminante`, `Trabajador`.
  - Subpaquete `usoInterfaces` (modelos y demos):
    - Modelos: `Persona`, `Empleado`, `EmpleadoHora` (compila como `EmpHora`), `Funcionario`, `Gerente`, `Jefe`, `Vendedor`, `Medicamento`.
    - Pruebas/demos: `TestPersona`, `TestEmpleados`, `TestInterfaces`, `TestMedicamento`.

## Cómo compilar

```bash
mvn clean package
```

Esto compila el proyecto y genera las clases en `target/classes`.

## Cómo ejecutar los ejemplos

Ejecutar la demo de animales:
```bash
java -cp target/classes edatos.ejemplosPOO.Animales.PruebaAnimales
```

Ejecutar la demo de figuras:
```bash
java -cp target/classes edatos.ejemplosPOO.Figuras.Prueba
```

Nota: Si es la primera vez, ejecute antes `mvn package` para compilar.

## Cómo ejecutar pruebas

```bash
mvn test
```

El proyecto usa JUnit 3.8.1 y contiene una prueba básica en `src/test/java`.

## Modificador `final` en Java

El modificador `final` sirve para indicar que algo no puede cambiarse o sobrescribirse después de definido. Puede aplicarse a variables, métodos y clases:

- Variables (campos o locales): una variable `final` solo puede asignarse una vez. Suele usarse para constantes. Ejemplo:
  ```java
  public static final double PI = 3.141592653589793;
  final String especie = "Felis catus"; // no puede reasignarse luego
  ```
  Nota: Si la variable `final` es una referencia a un objeto, no se puede cambiar la referencia, pero sí modificar el estado interno del objeto (si no es inmutable).

- Métodos: un método `final` no puede ser sobrescrito (override) por clases hijas.
  ```java
  public class Animal {
      public final String tipo() { return "Animal"; }
  }
  // class Perro extends Animal { @Override String tipo() { ... } } // <- No compila
  ```

- Clases: una clase `final` no puede ser heredada.
  ```java
  public final class Utilidades { /* métodos estáticos */ }
  // class MisUtilidades extends Utilidades { } // <- No compila
  ```

Cuándo usarlo:
- Para constantes: `public static final`.
- Para garantizar que un método no sea alterado por subclases (p. ej., por razones de seguridad o consistencia del modelo).
- Para evitar herencia de clases con diseño cerrado o utilitarias.

Relación con este proyecto: puedes marcar como `final` valores que conceptualmente no cambian (por ejemplo, una "especie" fija de un `Gato`) o métodos que no deberían sobreescribirse en jerarquías concretas.

## Notas
- El código está pensado con fines didácticos.
- La organización por paquetes ayuda a separar ejemplos por tema.
- Algunas clases de prueba (Prueba*/Test*) imprimen resultados por consola para observar el comportamiento.
