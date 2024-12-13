# Proyecto: Estructuras de Datos y Algoritmos

Este proyecto tiene como objetivo enseñar cómo funcionan algunas estructuras de datos fundamentales y algoritmos. Entre los conceptos que se exploran están las pilas, las colas, la validación de cadenas de signos y el ordenamiento.

## Ejercicio 01: Validador de Signos
**Clase:** `SingValidator`

- Este ejercicio verifica si una cadena que contiene paréntesis `()`, corchetes `[]` y llaves `{}` está correctamente balanceada. Por ejemplo, `{[()]}` es válida, pero `{[(])}` no lo es.
- Para lograr esto, el programa utiliza una pila genérica que ayuda a mantener el control de los signos abiertos y cerrados.
- El método principal se llama `esValido(String s)`.

## Ejercicio 02: Ordenamiento de Pila
**Clase:** `StackSorter`

- Este ejercicio toma una pila de números y los ordena en orden ascendente.
- Utiliza una pila auxiliar para realizar el proceso de comparación y transferencia de elementos.
- El método principal que implementa esta funcionalidad es `ordenar(StackGeneric<Integer> stack)`.

## Ejercicios Adicionales
### Pilas (Stack y StackGeneric)
**Clases:** `Stack` y `StackGeneric`

- La clase `Stack` implementa una pila básica, donde puedes agregar (`push`), quitar (`pop`) y consultar el elemento superior (`peek`).
- La clase `StackGeneric` es una versión más flexible que permite trabajar con cualquier tipo de dato.


### Colas (Queue y QueueGeneric)
**Clases:** `Queue` y `QueueGeneric`

- La clase `Queue` representa una cola básica con métodos para agregar (`enqueue`), quitar (`dequeue`) y consultar el elemento al frente (`peek`).
- La clase `QueueGeneric` permite trabajar con colas que contienen cualquier tipo de dato.

