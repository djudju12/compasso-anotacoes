# AWS Well-Achitected 

### Course: [Link](https://explore.skillbuilder.aws/learn/course/internal/view/elearning/2045/aws-well-architected?trk=7625a020-4afb-4990-a453-69f0444e9ca5&sc_channel=el)

___

<br>

Benefits 
* Builkd and deploy faster
* Lower or mitigate risks
* Make informed decisions
* Leans aws best practices
___

AWS Well-Acrthitected fala sobre estratégias e melhores práticas para arquitetar na nuvem. Provê maneiras de mensurar sua arquitetura contra as melhoras práticas da AWS e identificar como resolver problemas.

### Dr. Werner Vogel's video

In Short: No video, Werner diz que o documento Well-Architected traz as melhores práticas que eles, engenheiros da amazon, conseguiram pensar depois de anos de experiencia.
O documento abrange 4 diferentes areas:
Segurança, performance, confiabilidade e custo-beneficio 

E traz de 15 a 20 perguntas que você deve se fazer para mensurar a sua arquitetura.

Ele também diz que, com a transformação de harware 
 software quando falamos sobre infra, podemos construir aquilo que sempre desejamos mas nao conseguiamos devido as limitações de hardware.

___

### Well-Architected
___

Well-Architected permite que o cliente toma decisões informadas 
sobre sua arquitetura na nuvem, e que também possa entender o impacto das suas decisões de design

* Aumenta a atenção para as melhores práticas

* Aborda temas fundamental que muitas vezes sao negligenciados

* Prevê uma maneira consistente de calcular **workload** architecture

>**_Whats it this?:_** workload é definido como uma coleçao de aplicações, infra, politicas, governancia e operacoes interligadas que rodando na AWS prevê valor de negocio ou operacional

AWS Well-Architected Framework

Questions/Pillars/Design Principles

<br>

### Operational Execellence
___

 **Best Pratices Examples:**
   
   Use Multiple environments
   * Provide devs with individuals sandboxes and devs envs
   * Use infra as code
   * Increase controls as envs  prod
   * When envs are not use turn off

   Operate having a process to manage events, incidents and problems.
   Costumers should have defined processes to respond to:
   * Observed events
   * Incidents - Events that require intervention
   * Problems - Events that require intervention and either could happen again or that cannot currently be resolved

   Notify customer when they are impacted

   Incorportaiong feedback loops:
   * Activities should include feedback loops to indetify areas for improvement
   * Feedback should be used to preioritize and drive improvements
   * Feedback should come from the beggning of activities, user experience, and from business and dev teams
   * An example feedback mechanism is regular reviews of ops and workloads metrics with other teams
   * Clientes podem avaliar o feedback over time to recognize o sucesso da evolução

   <br>
   Habilidade de monitorar e rodar sistemas com intuito de entregar
   valor ao negocio e melhorar continuamente, dando suporte à 
   processos e procedimento

   As areas de focos incluem

   * Organização - Clientes precisam entender a prioridade de suas
   organizações, sua estrutura e como sua organização apoia membros
   do time para que os membros do time possam apoiar sua org.

   * Preparo - Clientes devem desenhar sua arquitetura para
   operaçoes. Eles precisam checar se seu workload e seu time estao
   operantes para tomar decisoes sobre ir live or implementar 
   grande mudanças

   * Operação - Clientes devem saber como operar seus workloads e 
   devem entender sua saude e a suas atividades. Através deste 
   entendimento é possivel identificar quando estão em risco.

   * Evolução - Clientes devem ter um processo para melhorar seu 
   workload e suas operações. Isso inclui implementação de 
   **feedback loop**, aprender com experiencia e compartilhar suas
   informações com o restante da organização.

   **Design principles:**

   * Clientes podem utilizar da mesma engenharia que usam em codigo para todo o ambiente e suas operaçoes
   * Podem fazer mudanças pequenas e reversiveis atraves de automação
   * Podem utilizar de gamedays para aprender com os erros  

   Organization:
   * É necessário um saber comum sobre o valor dos workloads e o função dos times que estão dando suporte 
   * Times precisam entender sua função no sucesso dos outros times e vice versa. Entender responsabilidade ajudara a focar e maximar os beneficios
   * Clientes devem promover suporte aos seus times.

   Prepare:
   * **Design telemetry:** É focado em garantir que os workloads provem a informação necessária (log,s metrics, events, traces...) para que o cliente entanda o seu estado interno atraves de todos os seus componentes.
   * **Improve Flow** enfatiza práticas que aceleram a velocidade de mudanças para produção, que limitam o progresso, e que permitem consertar as coisas antes de ir para prod
   * **Mitigate Deployment:** Praticas que permitem que o cliente indetifique rapidamente se alguma mudança teve um resultado indesejado.
   * **Operational readiness** é focado em esaber o quanto o workload esta preparado para entrar em prod

   Operate:
   * Um exemplo de insight tecnico das informações do workload é o impacto na saude do workload após uma mudança
   * Um exemplo de insight de negocio é a frequencia de sucesso dos updates
   * Runs books devem definir o que inicia a escalada de uma evento e o processo para a escalda. Deve indetificar o responsável

   Evolve:
   * Deve-se avaliar oportunidades para evolução através de analise de eventos que impactam o cliente, feedback loops, lessons learned, analysis of metrics, and cross-team reviews

### Security
___

   **Best Pratices Examples:**

   You have to apply overarching best practices to every area of security
   Use AWS Organizations and AWS Control Tower to manage accounts, and set common guardrails to encourage best practices

   Responding to security events:
   * Easy way to gain access
   * Rigth tool to deploy (AWS CloudFormation)
   * Conduct Game Days
   * Create a new, trusted env to conduct your investigations

   Managing humand and machine identities
   * AWS Identity and Access Manage is an AWS service that ensures only authorized and authenticated users and services are able to access your resources.
   * You must configure strong sign-in mechanisms, multi-factor, minimum pass length, and educate users to avoid reused pass
   * Centralized identity providers using AWS SSO
   * Identities that require secrests, for example pass to a db or third-party apps, must be stored with automatic rotation using the latest industry standards in a specialized service. You can use AWS Secrets Manager for this.
   * Define access requiremens
   * grant least privilege
   * Limit public and cross-account access
   * Reduce permissions continuously

   Control access in all layers:
   * Use edge services (for example, amazon cloudfront with aws waf)
   * Divide amazon virtual private cloud (amazon vpc) into layers using subnets
   * Use all controls avaible

   Use aws managed services:
   * Managed service takes care of underlying instances of compute and therefore patching adn hardening
   * Customers can focus on securing their workload

   Automate response to events:
   * AWS provides detective mechanisms that allow you to automate the running of you playbook when certain events happen

   Detective Controls:
   * Inventorying assets and their detailed attributes promotes more effective decision making to help establish operation baselines
   * **Internal auditing** is an examination of controls related to information systems, to ensure that practices meet policies and requirements, and that you set the correct automated notifications based on defined condidtions. 

   Infra security:
   * Trust boundaries
   * System security config and maintenance
   * Operation system authentication
   * Policy enforcement points

   AWS data protection:
   * Identify the data within your workload. This may include classifications to indicate if the data is intended to be publicy avaible, if is data to identify customer or if is legally privileged or marked as sensitive
   * AWS make it easy for you to encrypt data and manage keys. AWS key management service (AWS KMS)
   * Use mechanisms to keep people away from data: For example, use dashboards instead of direct acess to data store
   * Enforce encruption in transit
   * Encrypt on transit and rest. In amazon S3 you simply enable AWS KMS. For transit (SSL/TLS) you can easily configure encrypton to be handled by services including cloudfront and elastic load balancing (ELB)

   O pilar da segurança foca em proteger informação e o sistema

   * Quem pode fazer oque com **Identity And Access Management**

   * Detectar eventos de segurança com **Detective Controls**  

   * Proteger sistemas com **Infrastructure Protection**

   * Confiabilidade e integridade dos dados

   * Respondendo à eventos de segurança

   **Design principles:**
   
   * Implement a strong identity foundation
   * Use fine-grained acess control
   * Apply security at all layers
   * Atuomate security best practices
   * Prepare for secury events and automation   

### Reliability
___

   Best Practices:
   * Ensure that you are using automatic scaling to match demand
   * Use runbooks
   * Integrate tests as part of deploy
   * Use immutable infra (blue-green deploy for example ensures that if a change is neede, the architecture is build onto new infra and deployed into prod)

   Service-oriented Architecture
   Microservices Archtecture
   * Your workload must to operate reliably despite data loss or latency.
   * These best practices prevent failures and improve mean time between failures (MTBF)
   * Architectural choices to prevent failures include implementing loosely coupled dependencies
   * Making all resposes idempotent (that is, eache request is completed exactly one)
   * Architectural choices to mitigate failures when they occurs include **graceful degradation**, throttling requests, failing fast and limiting queues

   Failure management failures:
   * Have a backup and disaster recovery, DR, strategy. Make regular exercises on these topics to ensure reliability
   * Enable consistent and prompt responses to failures that are not well understood by documenting the investigation process in playbooks
   * Run tests that include load testing and perf evaluation in add to functionail unit tests and integration tests
   * Use chaos engineering. Run tsts that inject failures regularly and compare you hypothesis to the actual result

   na nuvem:
   * Recuperar de falhas automaticamente
   * Testar os recuperadores
   * Escalar horizontalmente 
   * Manage change in automation

   Foundational requirements:
   São requirementos cujo o escopo vai além de um projeto ou workload. Antes de arquitetar sistemas, fundações que afetam reliability devem ser garantidos

   Service limits -> Service quotas (AWS defaults plus requested increase)
   Service limits -> Fixed limits

   * Recuperação de falhas através de failure management

   * Fault-isolated boundaries limit the effect of a failure within a workload to a limited number of components. Components outside of the bondary are unaffected bu the failure. 

   * Deploy the workload to multiple locations
   * Use bulkhead architectures. Like the bulkheads on a ship, this pattern ensures that a failure is contained to a small subset of requests/users so that the number of impaired request is limited


   **Realiability foca em se recuperar de falhas e atender demandas**
   **nas seguintes areas:**

   * Foundations - Elementos fundamentais sobre setup e  **requerimentos cross-project** 

   * Workload Architecture - Decisões que tomamos ao desenhar 
   sistemas distribuidos

   * How we handle change

### Performance Efficiency
___

   Como usar soluções de IT de forma eficiente

   * Selection - Selecionando os recursos corretos para computação,
   armazenamento, dbs e networking

   * Reviewing suas seleções afinal aws ta sempre ai inovando

   * Estando ciente da performance de suas soluções através de monitoramento

   * Fazendo architectural trade-offs para maximizar eficiencia 



   Best practices:

   Optimal server config for a particular workload may vary based on app design
   Often multiple approaches are requireto to get optiam performance. One key best practice is to appropriately size compute, storage, database and networking resources.

   If possible for your workload, start by utilizing a reference arch or looking ate the amazon builder library or one of the quick start deployment aws.

   Benchmarking and load testing allow you yo experiement with different sizes of resources and features.

   You should reatp this processos to evaluate new size options and features as they become avaible

   Review: Load testing
   * Use AWS CloudFormation to define your arch as code, allowing you to version control and modify over time. This allow you to provision different envs in a controlled way, but more importantly, allows you to bring up production-scale test envs.
   * After you implement your architecture you must monitor its performance so that you can remediate. You can use Amazon CloudWatch to collect metrics, logs files, and set **alarms** as well as initiate actions through Amazon Kineses, Amazons SQS and AWS Lambda
   
   Efficiency:
   * When you architect solutions think about trade-offs, you could trade consistency, durability and space for time or latency to deliver higher performance.
   * As you make changes on the workload, collect and evaluate metrics to determine the impact of those changes.
   * Proximity and caching mechanisms: You can use Amazon CloudFront to cache content closer to the end user with the edges locations. You can implement in the database layer using Amazon Elasticache. Or read-replicas of your databse RDS, this can be easy to implement.

   * Democratize advanced tech (because you can try new things easy)
   * Go global in minutes
   * Use serverless arch   
   * Experiment more often
   * Consider mechanical sympath (making sure that we understand how each component of the system works)

### Cost Optimization
___

   best practice:
   Mange demand and supply with the right amount of resource:
   * Manage demand with a queue or buffer 
   * Supply the right amount of resources throug AWS Auto Scaling (demand based or time based)

   Expenditure awaraness
   * Tag resources
   * Track project lifecycle and profile applications
   * monotr usage and spend
   * use aws cost explorer
   * use partner tool

   Use AWS Cost explorer to catogarize and track your AWS cost
   * For exampole, you can use AWS Cost Explorer to see which services you use mnost, which Availability Zones most of your traffic is in etc. You can check more in [Whats is Cost Explorer?](https://docs.aws.amazon.com/cost-management/latest/userguide/ce-what-is.html)

   Optimize over time:
   * Review existing arch decision to be ensure that its the best 

   * On-demand instances allow you to pay by the hour withou long term commitment
   * Saving Plans and Reserved Instances allow you to commit to a spend leve or usage amount, and receive savings to 72% off on-demand pricing
   * With Spot Instances, you can consume on unused EC2 capacity at significant discounts. Spot Instances are appropriate when the syscan can tolaerate using a fleet of servers where individual server can come and go dynamically

   * Analyze avaible services
   * Take advantage of managed AWS services
   * Consider application-level services
   * Automation can reduce costs

   * Practice Cloud Financial Management - Perceba valor de negocio
   e sucesso financeiro conforme voce otimiza seu custo e uso

   * Expenditure and usage awareness - Controlando e entendendo
   onde seu dinheiro esta sendo gasto com **expenditure awareness**

   * Cost-effective resources - Selecionando recursos que possuem
   alto custo-beneficio como **Reserved Instances** e **Spot**

   * Managing demand and supply resources such as auto scalling, 
   caching or queuing
   
   * Optimize over time tirando proveito de novos serviços e features


### Well-Architected questions 
___

Uma serie de questões que ajuda a avaliar o quanto uma arquitetura esta alinhada com as melhores práticas do AWS 

| _Incidente Response_                         | Pillar 
|______________________________________________|
| **SEC 12. How do you ensure that you have the| Question
| appropriate incidente response?              |
|______________________________________________|
|Putting in place the tools ahead of a security| Question context
|incident, the....                             |
|______________________________________________|
|Best Practices:                               | Best practices
| * Pre-Provisioned acces ...                  |
|______________________________________________|


### Common uses of Well-Architected 

* Learning how to build cloud-native archs

* Building a backlog of improvements to deacrease tech debt and risk

* Comparar capacidade ou maturidade de diferentes produtos ou times

* Embarcar em assuntos referentes a procedimentos internos antes do lançamento


No modelo tradicional, clientes:

* Devem CHUTAR quanta infra será necessaria

* Testes em escala são dificeis

* Medo de mudanças

* Experimentos nao era faceis de fazer

* Arquitetura ficava congelada no tempo 

Em nuvem 

* Não há necessidade de chutas a infra

* Dá pra testar com escalas de produção

* Experimentar se torna mais fácil através da automação

* Permite que a arquitetura evolua

* Data-Driven arquiteturas

* **Game days:** Run failure tests to see if all the recovering planes ar working

### Tool

The AWS Well-Architected Tool is and architecture review tool that provides customers and partners with a consistent approach to reviewing their archi against aws best practices.

