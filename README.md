# Terminal-de-Transporte
## Backend 🚀 

**Importante: El proyecto se encuentra en la rama development**

En este reto se desarrolla una aplicación que le permita a una terminal de transporte gestionar los horarios de los viajes, en donde tiene que haber la posibilidad de registrar destinos, buses con sus capacidades y se debe llevar un registro de los viajes que se han realizado con los pasajeros que han ido a bordo del bus con sus datos personales para poder gestionar quien usa el sistema de transporte.

**1. Se crearon dos interfaces y dos clases abstractas.**

  **Interface IViaje:** Define los métodos implementados por el servicio ViajeService.

  **Interface IPasajero:** Define los métodos implementados por PasajeroService.

  **Clase Abstracta AbBus:** Proporciona la estructura básica para la implementación de las clases que representan los buses.

  **Clase Abstracta AbDestino:** Proporciona la estructura básica para la implementación de las clases que representan los buses.

**2. Prohibido el uso de ciclos FOR, siempre que la intención sea recorrer un arreglo deben usar el api Stream.**
En la api solo se utilizó stream.

**3. Aplicar patrones de diseño, identificar al menos 2 en tu código al final a la hora de documentar.**

Identifiqué el patron Facade que es un patrón de diseño estructural que proporciona una interfaz simplificada a una biblioteca, un framework o cualquier otro grupo complejo de clases. Un facade es una clase que proporciona una interfaz simple a un subsistema complejo que contiene muchas partes móviles. Un facade puede proporcionar una funcionalidad limitada en comparación con trabajar directamente con el subsistema. Sin embargo, tan solo incluye las funciones realmente importantes para los clientes.

**4. Desarrollar el proyecto bajo una estructura adecuada y por capas (Controller, Service y repository)**
Se utilizaron las siguientes capas Controller, Service, Repository, model

**5. Se debe utilizar java y spring boot como framework para construir la api y como gestor de dependencias**
Se utilizó el Java y Spring Boot como framework.

**6. Mínimo dos controllers**
Se crearon 4 Controladores para hacer la gestion de los viajes

## Para hacer las validaciones en Postman
Es necesario tener en cuenta los siguientes endpoints. Nota: El programa tambien puede encontrar por id sin tener que traer todos los objetos

![image](https://user-images.githubusercontent.com/107648922/216707162-25aebe2d-2432-4eba-b501-642086749ce9.png)

## Estructura para buses

**El id de los buses es la placa y es de tipo Long - POST **

![image](https://user-images.githubusercontent.com/107648922/216707901-baa01045-97bd-4346-97fe-619e2ce82b3a.png)

## Estructura para Destinos - POST

**El id de los destinos se genera solo cuando se agrega, se autoincremente de 1 en 1 y es de tipo int **

![image](https://user-images.githubusercontent.com/107648922/216708222-7bbbe82e-9fe5-4dc1-be81-eff0354ba573.png)

## Estructura para Pasajeros - POST

**El id de los Pasajeros se genera solo cuando se agrega, se autoincremente de 1 en 1 y es de tipo Long **

![image](https://user-images.githubusercontent.com/107648922/216708413-528b91f8-f262-4679-81e4-7d6ced25e164.png)

## Estructura para registrar Viaje - POST 

Solo se pone el id generado automaticamente cada vez que se agrega un destino y un pasajero,y la placa del bus, y asi se registra un viaje. Nota: el viaje puede registrar varios pasajeros, solo es añadir mas pasajeros y registrarlos en el viaje

![image](https://user-images.githubusercontent.com/107648922/216709033-053a7174-850d-428d-aefc-9bc098608009.png)
![image](https://user-images.githubusercontent.com/107648922/216710982-d68bba89-8d9e-48a7-a579-1c26457575a2.png)



