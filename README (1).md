
# Portfolio backend

Proyecto sobre un portfolio para el programa de Argentina Programa.


#### Enclances

 - [Portfolio Repositorio Front-end](https://github.com/matiasc-e/portfolio-frontend)
 - [Portfolio Firebase Deploy Front-end](https://portfolio-front-caa7e.web.app)
 - [Portfolio Render Deploy Back-end](https://portfolioback-1jsp.onrender.com/api/info/1)

 


## API Reference

```http
  API URL : 'https://portfolioback-1jsp.onrender.com'
```

#### Obtener a un usuario por id

```http
  GET /api/info/:id
```

```http
 Example : /api/info/1
```

#### Obtener todas las experiencias

```http
  GET /api/experience
```

#### Obtener todas las educaciones

```http
  GET /api/education
```

#### Obtener todas las skills

```http
  GET /api/skills
```

#### Obtener todos los proyectos

```http
  GET /api/proyects
```



### Para las peticiones POST/PUT/DELETE

- Saber el email y la contraseña por defecto.

- Hacer una peticion POST al siguiente endpoint mandando un json con los datos.

##### Ejemplo de peticion:

```http
  POST /login
```
```http
  {
    "email" : "emailcorrecto@gmail.com",
    "password" : "passwordcorrecto"
  }
```

- Si es correcto, en la respuesta -> headers -> Authorization te deberia manda un token

```http
  Authorization       Bearer {{token recibido}}
```

- Este token sirve para poder hacer las peticiones POST/PUT/DELETE

- Al momento de hacer una peticion se debe poneren el header una seccion "Authorization" con el token recibido.

![App Screenshot](https://i.postimg.cc/LXYpH5mD/Screenshot-8.png)


#### Crear una nueva experiencia

```http
  POST /api/experience
```
#### Ejemplo json:
```http
  {
    "titleExp" : 'title',
    "descExp" : 'description experience',
    "picExp" : 'https://imageupload.com',
    "startDateExp" : '22/22/12'
    "endDateExp" : '23/23/12'
  }
```

#### Crear un nueva educacion

```http
  POST /api/education
```
#### Ejemplo json:
```http
  {
    "titleEdu" : 'title',
    "descEdu" : ''description education'',
    "picEdu" : 'https://imageupload.com',
    "startDateEdu" : '22/22/12',
    "endDateEdu" : '23/23/12'
  }
```

#### Crear un nueva skill

```http
  POST /api/skills
```
#### Ejemplo json:
```http
  {
    "nameSk" : 'nueva skill',
    "percent" : 60
  }
```

#### Crear un nuevo proyecto

```http
  POST /api/proyects
```
#### Ejemplo json:
```http
  {
    "titlePro" : 'title'
    "descPro" : 'description proyect'
    "linkDemoPro" : 'https://demo.com'
    "linkRepoPro" : 'https://repo.com'
  }
```



## Peticiones PUT

#### Actualizar un usuario (solo hay 1 usuario)

```http
  PUT /api/info
```
#### Ejemplo json:
```http
  {
    "nameInfo" : 'nuevo name',
    "surnameInfo" : 'nuevo surname',
    "ubicationInfo" : 'nuevo ubication',
    "positionInfo" : 'nuevo position'
    "aboutMe" : 'nuevo aboutme'
    "infoPic" : 'https://nuevpic.com'
    "infoBanner" : 'https://nuevpic.com'
  }
```

#### Actualizar una experiencia

```http
  PUT /api/experience
```
#### Ejemplo json:
```http
  { 
    "idExp" : 1,
    "titleExp" : 'nuevo title',
    "descExp" : 'nuevo description experience',
    "picExp" : 'https://imageupload.com',
    "startDateExp" : '22/22/12'
    "endDateExp" : '23/23/12'
  }
```

#### Actualizar una educacion

```http
  PUT /api/education
```
#### Ejemplo json:
```http
  {
    "idEdu" : 1,
    "titleEdu" : 'nuevo title',
    "descEdu" : 'nuevo description education',
    "picEdu" : 'https://imageupload.com',
    "startDateEdu" : '22/22/12',
    "endDateEdu" : '23/23/12'
  }
```

#### Actualizar una skill

```http
  PUT /api/skills
```
#### Ejemplo json:
```http
  {
    "idSk" : 1,
    "nameSk" : 'nueva skill',
    "percent" : 60
  }
```

#### Actualizar un  proyecto

```http
  PUT /api/proyects
```
#### Ejemplo json:
```http
  {
    "idPro" : 1,
    "titlePro" : 'nuevo title'
    "descPro" : 'nuevo description proyect'
    "linkDemoPro" : 'https://demo.com'
    "linkRepoPro" : 'https://repo.com'
  }
```

## Peticiones DELETE

#### Eliminar una experiencia

```http
  DELETE /api/experience/:id
```
#### Ejemplo json:
```http
/api/experience/1
```

#### Eliminar una educacion

```http
  DELETE /api/education/:id
```
#### Ejemplo json:
```http
/api/education/1
```

#### Eliminar una skill

```http
  DELETE /api/skills/:id
```
#### Ejemplo json:
```http
/api/skills/1
```

#### Eliminar un proyecto

```http
  DELETE /api/proyect/:id
```
#### Ejemplo json:
```http
/api/proyect/1
```