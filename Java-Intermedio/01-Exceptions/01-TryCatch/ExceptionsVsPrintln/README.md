# Try-Catch — ¿Por qué usar excepciones?

## Idea principal

Una excepción sirve para representar un problema que impide que una operación continúe normalmente y permitir que ese problema se propague hacia una parte superior del programa para decidir cómo manejarlo.

### Ejemplo

Imaginemos una operación grande:

COMPRAR ZAPATILLAS
├── Verificar producto
├── Verificar talla
├── Verificar color
└── Realizar pago

Cada parte puede tener un problema diferente:

- Verificar talla → Talla 42 no disponible
- Verificar color → Color negro no disponible
- Realizar pago → Fondos insuficientes

### Usando solamente println

```java
System.out.println("Fallo comprar zapatillas: no hay talla 42");