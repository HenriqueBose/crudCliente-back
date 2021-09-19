# crudCliente-back
Para executar este projeto será necessário instalar algumas dependencias:

# Java 8
# Spring-boot 2.4.4
# Maven 4.0
Apos clonar o projeto em uma pasta, será necessário instalar as dependencias do maven encontradas na pom.xml
no meu caso como eu já tinha uma .m2 lotada, foi necessário remove-la e deixar o ```maven clean install``` instalar tudo do 0.<br>

Ao ultilizar a IDE Intelijj, assim que todas as dependencias do maven forem instaladas com sucesso ele irá gerar
a configuração de inicialização com o Tomcat já embarcado.
# Hibernate 5.4



# Postgres 13
Para o banco, será necessário criar um servidor inicializa-lo<br>
No meu caso fiz o uso do [pgAdmin4](https://www.pgadmin.org/download/)<br>
As especificações do banco devem seguir as que estão no application.properties<br>

```spring.datasource.url = jdbc:postgresql://localhost:5432/springboot-crud```<br>
```spring.datasource.username = postgres```<br>
```spring.datasource.password = admin```

Após iniciar o banco, será necessário rodar o script de criação dos esquemas e da inserção
dos usuários ```admin``` e ```comum``` que possuem roles diferentes no sistema.<br>
Link do repositório do SQL:
[banco.sql](https://github.com/HenriqueBose/sqlCrud-Clientes)

