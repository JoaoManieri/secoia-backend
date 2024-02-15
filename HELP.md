# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/index.html#web)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/index.html#using.devtools)
* [Validation](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/index.html#io.validation)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)


# Clientes

    Criar, editar e listar todos os clientes, esta é a responsabilidade deste endpoint.
    URL : http://localhost:8080/cliente

### [POST] Novo cliente

 - Criar novo cliente
 - Cria um novo cliente com as informações fornecidas:

### Campos

- `nomeFantasia` (string): Nome fantasia do cliente.
- ``nomeReal`` (string): Nome real do cliente.
- ``cnpj`` (string): CNPJ do cliente.
- ``simplesNacionalAtivo`` (boolean): Indica se o cliente está ativo no Simples Nacional.
- ``ramoDeAtividade`` (string): Ramo de atividade do cliente.
- ``listaDeEnderecos`` (array de objetos): Lista de endereços do cliente. Cada endereço possui os seguintes campos:
    - ``cep`` (string): CEP do endereço.
    - ``rua`` (string): Nome da rua.
    - ``numero`` (string): Número do endereço.
    - ``bairro`` (string): Bairro do endereço.
    - ``cidade`` (string): Cidade do endereço.
    - ``estado`` (string): Estado do endereço.
    - ``complemento`` (string, opcional): Complemento do endereço.
- ``listaDeContatos`` (array de objetos): Lista de contatos do cliente. Cada contato possui os seguintes campos:
    - ``nome`` (string): Nome do contato.
    - ``cargo`` (string): Cargo do contato.
    - ``telefone`` (string): Número de telefone do contato.
    - ``celular`` (string): Número de celular do contato.
    - ``email`` (string): Endereço de e-mail do contato.
- ``usuarioCriadorId`` (integer): ID do usuário que está criando o cliente.
- ``fatorCompetitivo`` (string, opcional): Fator competitivo do cliente.
- ``gestorDaContaUsuarioId`` (integer): ID do usuário que é o gestor da conta do cliente.
- ``analistaDaContaUsuarioId`` (integer): ID do usuário que é o analista da conta do cliente.

### Códigos de Resposta
- ``200 OK``: Requisição bem-sucedida.
- ``400 Bad Request``: Erro na requisição devido a dados inválidos.
- ``500 Internal Server Error``: Erro interno do servidor ao processar a requisição.


### Exemplo de solicitação de cadastro
`````json
{
  "nomeFantasia": "nome apenas",
  "nomeReal": "Nome Real",
  "cnpj": "CNPJ",
  "simplesNacionalAtivo": true,
  "ramoDeAtividade": "Ramo de Atividade",
  "listaDeEnderecos": [
    {
      "cep": "CEP1",
      "rua": "Rua 1",
      "numero": "1",
      "bairro": "Bairro 1",
      "cidade": "Cidade 1",
      "estado": "Estado 1",
      "complemento": "Complemento 1"
    },
    {
      "cep": "CEP2",
      "rua": "Rua 2",
      "numero": "2",
      "bairro": "Bairro 2",
      "cidade": "Cidade 2",
      "estado": "Estado 2",
      "complemento": "Complemento 2"
    }
  ],
  "listaDeContatos": [
    {
      "nome": "Contato 1",
      "cargo": "Cargo 1",
      "telefone": "Telefone 1",
      "celular": "Celular 1",
      "email": "Email 1"
    },
    {
      "nome": "Contato 2",
      "cargo": "Cargo 2",
      "telefone": "Telefone 2",
      "celular": "Celular 2",
      "email": "Email 2"
    }
  ],
  "usuarioCriadorId": 0,
  "fatorCompetitivo": "Fator Competitivo",
  "gestorDaContaUsuarioId": 0,
  "analistaDaContaUsuarioId": 0
}
`````
