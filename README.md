# 🧪 Examen Práctico - Gestión de Precios

## 🎯 Objetivo

El objetivo de este examen es evaluar la capacidad de implementar una API RESTful en Java utilizando Spring Boot, siguiendo buenas prácticas de arquitectura y validación mediante Postman.

## 📌 Requisitos del examen

Desarrollar una API con las siguientes características:

### ✅ Funcionalidades requeridas

1. **Crear un endpoint POST para crear un `Price`**  
   - Ruta sugerida: `POST /api/prices`  
   - El cuerpo del request debe contener los datos necesarios para registrar un nuevo precio:
     ```json
     {
       "startDate": "2025-01-01T00:00:00",
       "description": "price",
       "priceProduct": 100.50,
       "currency": "USD"
     }
     ```

2. **Aplicar la arquitectura explicada en clase**  
   - Controlador (`Controller`)
   - Servicio (`Service`)
   - Repositorio (`Repository`)
   - Entidad (`Entity`)
   - DTOs si se desea

3. **Probar la funcionalidad con Postman**  
   - Validar que el `Price` se esté insertando correctamente en la base de datos
   - Adjuntar evidencia de la prueba (captura de pantalla o colección exportada)

## 🗂️ Estructura del proyecto sugerida

```
src/
 └── main/
     └── java/
         └── com/example/prices/
             ├── controller/
             │   └── PriceController.java
             ├── service/
             │   └── PriceService.java
             │   └── PriceServiceImpl.java
             ├── repository/
             │   └── PriceRepository.java
             ├── model/
             │   └── Price.java
             └── ...
```

## ✅ Criterios de evaluación (10 puntos)

| Criterio                          | Puntaje |
|----------------------------------|---------|
| Calidad del código               | 4 pts   |
| Endpoint funcionando             | 2 pts   |
| Evidencia de pruebas en Postman  | 2 pts  |
| Estructura y arquitectura        | 2 pts   |

## 💡 Recomendaciones

- Usa anotaciones como `@RestController`, `@Service`, `@Repository`, `@Entity`.
- Asegúrate de que el endpoint retorne respuestas adecuadas (201, errores, etc.).
- El proyecto debe compilar sin errores.
