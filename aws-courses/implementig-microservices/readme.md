# Implementing Microservices on AWS 

### Anota��es

___

<br>


Descrever� diferentes aspectos de arquitetura de microservi��es e como construir na AWS usando containers.
Recomenda AWS services para implementa��o de uma tipica aplica��o serveless de microservio para reduzier a complexidade operacional.

Serveless:
* N�o h� infraestrutura para provisionar ou administrar
* Escala automaticamente atrav�s de unidades de consumo
* _Pay for value_ 
* Built-in availability and fault tolerance

Em um monolito tradicional temos 3 diferentes camadas:
user interface, l�gica de negocio persistencia.
Microservi�os buscam dividir as funcionalidades de uma aplica��o em diferentes verticais - n�o tecnologias, mas cada um no seu dominio 

Imagem exemplo na pagina 3

Etcd -> etcd is a consistent and highly-available key value store used as Kubernetes' backing store for all cluster data.

User interface: Modern apps usam js para se comunitar com RESTful API. Static web content can be sered using Amazon Simple Storage Service (Amazon S3) and Amazon Cloudfront.

Microservices: AWS possui ferramentas integradas que suportam o desenvolvimento de microservi�os. Dois populares s�o AWS Lambda e Docker Container com AWS Fargate. 
Amazon Elastic Container Service (ECS) e Amazon Elastic Kubernets Service (EKS) eliminam a necessidade de instalar, operar e escalar sua infraestrutura.

Data Store: RDS, Amazon ElastiCache e Dynamo DB

Reduzido Complexidade =>

Lambda s�o bem integradas com API Gateway, permitindo a cria��o de aplica��es totalmente serveless.