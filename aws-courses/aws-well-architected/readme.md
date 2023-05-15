# AWS Well-Achitected 

### Course: [Link](https://explore.skillbuilder.aws/learn/course/internal/view/elearning/2045/aws-well-architected?trk=7625a020-4afb-4990-a453-69f0444e9ca5&sc_channel=el)

___

<br>

### O que vou aprender neste modulo?
___
* Descrever as ferramentas do AWS 
Well-Architected Framework

* Descrever principios de design na nuvem

* Descrever pilares da AWS Well-Architected 

* Descrever os usos do AWS Well-Architected

___

AWS Well-Acrthitected fala sobre estratégias e melhores práticas para arquitetar na nuvem. Provê maneiras de mensurar sua arquitetura contra as melhoras práticas da AWS e identificar como resolver problemas.

### Dr. Werner Vogel's video

In Short: No video, Werner diz que o documento Well-Architected traz as melhores práticas que eles, engenheiros da amazon, conseguiram pensar depois de anos de experiencia.
O documento abrange 4 diferentes areas:
Segurança, performance, confiabilidade e custo-beneficio 

E traz de 15 a 20 perguntas que você deve se fazer para mensurar a sua arquitetura.

Ele também diz que, com a transformação de harware para software quando falamos sobre infra, podemos construir aquilo que sempre desejamos mas nao conseguiamos devido as limitações de hardware.

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
    /        |         \
   /         |          \
   |         |           |  
Questions|Pillars|Design Principles

**Pillars**:

* Operational Execellence

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

* Security

   O pilar da segurança foca em proteger informação e o sistema

   * Quem pode fazer oque com **Identity And Access Management**

   * Detectar eventos de segurança com **Detective Controls**

   * Proteger sistemas com **Infrastructure Protection**

   * Confiabilidade e integridade dos dados

   * Respondendo à eventos de segurança

* Realiability

   Realiability foca em se recuperar de falhas e atender demandas 
   nas seguintes areas:

   * Foundations - Elementos fundamentais sobre setup e  **requerimentos cross-project** 

   * Workload Architecture - Decisões que tomamos ao desenhar 
   sistemas distribuidos

   * How we handle change

   * Recuperação de falhas através de failure management

* Performance Efficiency

   Como usar soluções de IT de forma eficiente

   * Selection - Selecionando os recursos corretos para computação,
   armazenamento, dbs e networking

   * Reviewing suas seleções afinal aws ta sempre ai inovando

   * Estando ciente da performance de suas soluções através de monitoramento

   * Fazendo architectural trade-offs para maximizar eficiencia 

* Cost Optimization

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

* **Game days?** 