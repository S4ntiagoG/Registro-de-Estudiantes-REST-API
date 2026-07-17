# Registro de Estudiantes REST API

## Tecnologías

* Java 21
* Spring Boot 3
* Gradle

## ¿Por qué Spring Boot?

Elegí Spring Boot porque ya tenía configurado el entorno Java y permite crear APIs REST de forma rápida y sencilla con muy poco código.

## Cómo ejecutar

1. Clonar el repositorio:

```bash
git clone URL_DEL_REPOSITORIO
cd registro-estudiantes
```

2. Ejecutar la aplicación:

```bash
gradlew.bat bootRun
```

3. La API quedará disponible en:

```
http://localhost:8080
```

## Endpoints

### Registrar estudiante

POST /estudiantes

Ejemplo:

```json
{
  "id": "000156364",
  "nombre": "Cristiano Ronaldo",
  "carrera": "Ingeniería de Sistemas e Informatica"
}
```

### Listar estudiantes

GET /estudiantes
