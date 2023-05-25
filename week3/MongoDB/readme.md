# MongoDB BootCamp 
### Course: [link](https://www.udemy.com/course/mongodb-with-spring-boot-spring-data-mongorepository-mlab-cloudfoundry/)
___

<br>

### Intro <a name="s1"></a>
___

**What is MongoDB?**
Documented oriented DB that stores BJON (binary json). Very flexible and can handle large amouts of data.

**SQL vs NoSql**

NoSQL databases dont have relationships, all that is in one record. For example, if you want the data of 
a Student you have to do joins with departament and subject tables. In a NoSql, all the data are in one
record. Because of that, NoSql querys are usually faster.

But some NoSql databases support relationships aswell

Basically is a big pool of json, but in binary.

**Some keys points:**

* Tables in NoSql are called collection
* Eache collection have some set of fields
* Sub Document (reference)

Sping boot with MongoDB:

```java
# Here we need to provide the details of our database
# application.properties
spring.data.mongodb.host=localhost
spring.data.mongodb.port=2701
spring.data.mongodb.database=Spring
```


