# Aws Cloud Essentials 

### Course: [Aws Cloud Essentials](https://explore.skillbuilder.aws/learn/course/482/play/8084/aws-foundations-getting-started-with-the-aws-cloud-essentials)
___

### What exactly is cloud computing?
___

Cloud computing enbales you to stop thinking of your infra as hardware, and instead think of (and use) it as software. You dont need to pay for hardware that you dont need (over provisioning), just pay for what you use.

### Benefits of cloud computing 

* **Trade capital expense for variable expense** 
   
   You pay for what you use

* **Benefit from massive economies of scale**

   Because its easy to scale and everyone uses this kind of thing

* **Stop guessing about capacity**

   You dont need to guess the capacity before deploy, its easy to scale up or down

* **Increase speed and agility**

   New things are easy and fast to use

* **Focus on what matters**

   Stop wasting money with datacents and keep focus on projects

* **Go global in minuts**

   Easy to deploy on anywhere

### Cloud computing deployment models
___

* **Cloud**

   Totalmente implantanda em Nuvem. Podem ser criadas em nuvem ou passadas para nuvem

* **Hybrid**

   Conecta infra da nuvem com coisas que existem e nao estao ainda na nuvem

* **On-premises (private cloud)**

   Deployment usando virtualiza��o e gerenciamento de recursos na nuvem se chama private cloud. 
   Nao tira muito proveito da nuvem, mas pode ser bom para oferecer servi�os dedicados.

### AWS?
___

AWS � uma plataforma de nuvem segura que oferece uma grande quantidade de produtos globais da nuvem.
AWS prev� acesso � demanda � computa�ao, armazenamento, internet, db e outros IT recursos e ferramentas de administra��o.
Voc� paga por apenas os recursos que usa.
Servi�os AWS trabalham juntos, como blocos construtores.

### AWS Global infra
___

Uma **AWS Region** is a geographical area

   * Replica��o de dados entre Regions s�o controlados por voc�

   * Comunica��o entre Regions utilizam AWS backbone network infra

Cada Region prev� redund�ncia e conectividade.
Uma Region �, tipicamente, uma ou main **Availability Zones**


### Availability Zones
___

Cada Region possu� diversas Availability Zones. Cada uma representa uma parte da infra da amazon totalmente isolada

* H� 69 Availability Zones no mundo
* Availability Zones s�o discretes data centers 
* **Fault Isolations**(?)
* S�o conectados com outras Availability Zones usando high-speed private networking
* Voc� escolhe a sua
* AWS recomenda replicar data e recurso entre Availability Zones para resiliencia

### Data centers 
___

AWS datacents possuem um design securo. Onde os dados s�o armazenados e processados.
Cada datacenter possue redundancia, networking, conectividade e est�o em lugares diferentes.
Um datacenter tem entre 50_000 e 80_000 servidores fisicos.

>**_Note:_** Edge locations s�o locais fisicos de cache. Se um usuario fzr uma requis�o que pega algo de longe, ser� armezado nesse cache.

### Selecionando uma Region
___

Determine a Region correta para os seus servios, apps utilizando estes fatores

* Data governance, legal requirements

* Proximity to customers

* Services avaible within the Regions

* Costs
  
### Compute service

* EC2

   Prov� virtualiza��o altamente escalonavel

|                    | Type               | Use case             |
|--------------------|--------------------|----------------------|
| General Purpose    | a1, m4, m5, t2, t3 | Broad                |
| Compute optimized  | c4, c5             | High Perf            |
| Memory Op          | r4, r5, x1, z1     | In-memory dbs        |
| Accelerated Comput | f1, g3, g4, p2, p3 | ML                   |
| Storage Op         | d2, h1, i3         | Distributed file sys |


| Service             | Key Concepts                                 | Characteristics                                                                           | Ease of USE                                                                              |
|---------------------|----------------------------------------------|-------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------|
| EC2                 | Infra as serivice(IaaS) Instance-based VM's  | Provision vms that you can manage as you choose                                           | A famililar concept to many IT professionals                                             |
| Lambda              | Serverless computing function-based low-cost | Write and deploy code that runs on a schedule or event Use when possible                  | A relatively new concept for many IT staff members, but easy to use after  you learn how |
| EC2 EKS FARGATE ECR | Container-based computing instance-based     | Spun up and run jobs more quickly                                                         | Fargate reduces admin over head, but you can use option that give you more control       |
| Elastic Bean stalk  | Plataform as a Service (PaaS) For web-apps   | Focus on your code Can easily tie into other services-dbs, domain  name system (DNS), etc | Fast and easy to get started                                                             |


**AWS EC2 AUTOSCALLING**

x
* ECR 

   Facil de usar com Docker

* Elastic Beanstalk

   Utilizado para fazer deploy em servidores conhecidos como IIS

* Lambda

   Usado para rodar c�digo sem um servidor, s� � cobrado quando o codigo � executado

* Elastic Kubernets Service 

   Torna muito facil o deploy, gerenciamento e provisionamento de aplica��es containerzadas que usam Kubernets

* AWS Fargate

   Permite que rode cont�iners sem precisar gerenciar servidores ou clusters

### Storage

Feita em buckets tal qual GCP. Da pra controlar quem mexeu etc. 

**EB2** Storage EC2 

**PRESIGNED URLS PARA URLS COMO TEMPO DE VIDA**  

