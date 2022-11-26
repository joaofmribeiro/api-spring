# Projeto Java Web com Spring Boot
[![GitHub license](https://img.shields.io/github/license/joaofmribeiro/java-springboot)](https://github.com/joaofmribeiro/api-spring/blob/main/LICENCE.md)


## Sobre o o sistema
Desenvolvimento de um sistema (API REST) de usuários e departamentos, que apresenta os seguintes casos de uso:

- Buscar todos usuários;
- Buscar um usuário pelo seu id;
- Inserir um novo usuário.

![Image](https://github.com/joaofmribeiro/java-springboot/blob/master/img/Dominio.png)


#### Configurações do banco de dados

```
# Dados de conexão com o banco H2
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# Configuração do cliente web do banco H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Configuração para mostrar o SQL no console
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

### Tecnlogias utilizadas

- Spring Tools Suíte (Java);
- Postman.

#### Autor

João Francisco Mendonça Ribeiro

(Adaptação feita com base no original -  canal devSuperior)

