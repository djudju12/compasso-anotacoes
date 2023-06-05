# Implementing Microservices on AWS 

### Anotações

___

<br>


Descreverá diferentes aspectos de arquitetura de microservições e como construir na AWS usando containers.
Recomenda AWS services para implementação de uma tipica aplicação serveless de microservio para reduzier a complexidade operacional.

Serveless:
* Não há infraestrutura para provisionar ou administrar
* Escala automaticamente através de unidades de consumo
* _Pay for value_ 
* Built-in availability and fault tolerance

Em um monolito tradicional temos 3 diferentes camadas:
user interface, lógica de negocio persistencia.
Microserviços buscam dividir as funcionalidades de uma aplicação em diferentes verticais - não tecnologias, mas cada um no seu dominio 

Imagem exemplo na pagina 3

Etcd -> etcd is a consistent and highly-available key value store used as Kubernetes' backing store for all cluster data.

User interface: Modern apps usam js para se comunitar com RESTful API. Static web content can be sered using Amazon Simple Storage Service (Amazon S3) and Amazon Cloudfront.

Microservices: AWS possui ferramentas integradas que suportam o desenvolvimento de microserviços. Dois populares são AWS Lambda e Docker Container com AWS Fargate. 
Amazon Elastic Container Service (ECS) e Amazon Elastic Kubernets Service (EKS) eliminam a necessidade de instalar, operar e escalar sua infraestrutura.

Data Store: RDS, Amazon ElastiCache e Dynamo DB

Reduzido Complexidade =>

Lambda são bem integradas com API Gateway, permitindo a criação de aplicações totalmente serveless.