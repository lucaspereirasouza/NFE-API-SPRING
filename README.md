<br/>
<div align="center">
<a href="https://github.com/ShaanCoding/ReadME-Generator">
</a>
<h3 align="center">Exam Spring boot</h3>
<p align="center">
NFe XML treater in spring boot
<br/>
<br/>
</p>
</div>

## Installation and Manual

## Docker

### archive docker-compose.yaml


docker compose up

```docker-compose
services:
  db:
    image: mysql:latest
    restart: always
    ports:
      - 3306:3306
    container_name: examMySQLDatabase
    environment:
      MYSQL_ROOT_PASSWORD: _root@123
      MYSQL_DATABASE: examDB
      MYSQL_USER: exam
      MYSQL_PASSWORD: exam@123
  phpmyadmin:
    image: phpmyadmin:latest
    restart: always
    ports:
      - 8081:80
    container_name: phpmyadminExam
```

ports:
* spring boot : 8080
* mysql: 3306
* Possibily Apache: 80

### Spring boot
git clone https://github.com/lucaspereirasouza/examSpringBoot.git
Import the project inside spring boot and run
...

#### 

## API Reference

#### Default Path

```http
  GET /v1/inovacoes/
```

### Controllers:

Client:
CRUD:

/create
/get/{id}
/get (get all)
/delete/{id}


Product:
CRUD:
/create
/get/{id}
/get
/update
/delete/{id}



Purchase:
CRUD:
/create
/get/{id}
/get
/update
/delete/{id}



QRCodeController for Purchase:
CRUD:
/create
/get/{id}
/get
/update
/delete/{id}



NFe:
CRUD:
/create
/get/{id}
/get
/update
/delete/{id}

Entities Diagram:
...


## Authors

- [@lucaspereirasouza](https://www.github.com/lucaspereirasouza)
