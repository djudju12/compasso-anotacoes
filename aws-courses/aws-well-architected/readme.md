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

AWS Well-Acrthitected fala sobre estrat�gias e melhores pr�ticas para arquitetar na nuvem. Prov� maneiras de mensurar sua arquitetura contra as melhoras pr�ticas da AWS e identificar como resolver problemas.

### Dr. Werner Vogel's video

In Short: No video, Werner diz que o documento Well-Architected traz as melhores pr�ticas que eles, engenheiros da amazon, conseguiram pensar depois de anos de experiencia.
O documento abrange 4 diferentes areas:
Seguran�a, performance, confiabilidade e custo-beneficio 

E traz de 15 a 20 perguntas que voc� deve se fazer para mensurar a sua arquitetura.

Ele tamb�m diz que, com a transforma��o de harware para software quando falamos sobre infra, podemos construir aquilo que sempre desejamos mas nao conseguiamos devido as limita��es de hardware.

___

### Well-Architected
___

Well-Architected permite que o cliente toma decis�es informadas 
sobre sua arquitetura na nuvem, e que tamb�m possa entender o impacto das suas decis�es de design

* Aumenta a aten��o para as melhores pr�ticas

* Aborda temas fundamental que muitas vezes sao negligenciados

* Prev� uma maneira consistente de calcular **workload** architecture

>**_Whats it this?:_** workload � definido como uma cole�ao de aplica��es, infra, politicas, governancia e operacoes interligadas que rodando na AWS prev� valor de negocio ou operacional

AWS Well-Architected Framework
    /        |         \
   /         |          \
   |         |           |  
Questions|Pillars|Design Principles

**Pillars**:

* Operational Execellence

   Habilidade de monitorar e rodar sistemas com intuito de entregar
   valor ao negocio e melhorar continuamente, dando suporte � 
   processos e procedimento

   As areas de focos incluem

   * Organiza��o - Clientes precisam entender a prioridade de suas
   organiza��es, sua estrutura e como sua organiza��o apoia membros
   do time para que os membros do time possam apoiar sua org.

   * Preparo - Clientes devem desenhar sua arquitetura para
   opera�oes. Eles precisam checar se seu workload e seu time estao
   operantes para tomar decisoes sobre ir live or implementar 
   grande mudan�as

   * Opera��o - Clientes devem saber como operar seus workloads e 
   devem entender sua saude e a suas atividades. Atrav�s deste 
   entendimento � possivel identificar quando est�o em risco.

   * Evolu��o - Clientes devem ter um processo para melhorar seu 
   workload e suas opera��es. Isso inclui implementa��o de 
   **feedback loop**, aprender com experiencia e compartilhar suas
   informa��es com o restante da organiza��o.

* Security

   O pilar da seguran�a foca em proteger informa��o e o sistema

   * Quem pode fazer oque com **Identity And Access Management**

   * Detectar eventos de seguran�a com **Detective Controls**

   * Proteger sistemas com **Infrastructure Protection**

   * Confiabilidade e integridade dos dados

   * Respondendo � eventos de seguran�a

* Realiability

   Realiability foca em se recuperar de falhas e atender demandas 
   nas seguintes areas:

   * Foundations - Elementos fundamentais sobre setup e  **requerimentos cross-project** 

   * Workload Architecture - Decis�es que tomamos ao desenhar 
   sistemas distribuidos

   * How we handle change

   * Recupera��o de falhas atrav�s de failure management

* Performance Efficiency

   Como usar solu��es de IT de forma eficiente

   * Selection - Selecionando os recursos corretos para computa��o,
   armazenamento, dbs e networking

   * Reviewing suas sele��es afinal aws ta sempre ai inovando

   * Estando ciente da performance de suas solu��es atrav�s de monitoramento

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
   
   * Optimize over time tirando proveito de novos servi�os e features


### Well-Architected questions 
___

Uma serie de quest�es que ajuda a avaliar o quanto uma arquitetura esta alinhada com as melhores pr�ticas do AWS 

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

* Embarcar em assuntos referentes a procedimentos internos antes do lan�amento


No modelo tradicional, clientes:

* Devem CHUTAR quanta infra ser� necessaria

* Testes em escala s�o dificeis

* Medo de mudan�as

* Experimentos nao era faceis de fazer

* Arquitetura ficava congelada no tempo 

Em nuvem 

* N�o h� necessidade de chutas a infra

* D� pra testar com escalas de produ��o

* Experimentar se torna mais f�cil atrav�s da automa��o

* Permite que a arquitetura evolua

* Data-Driven arquiteturas

* **Game days?** 