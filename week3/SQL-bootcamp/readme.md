# The complete SQL Bootcamp: Go from Zero to Hero

### course: [link](https://www.udemy.com/course/the-complete-sql-bootcamp/)
___

<br>

## Table of Contents 

1. [Section 1: Introduction](#s1)
   1. [What are and why use it?](#s1.1)
   2. [PostGre instalation on Linux](#s1.2)
2. [Section 2: Statement Fundamentals](#s2)
3. [Section 3: Group By Statement ](#s3)
4. [Assessment test 1](#s4)
5. [JOINS](#s5)

___

<br>

### Section 1: Introduction <a name="s1"></a>
___

**What are Databases and why use it?** <a name="s1.1"></a>

Databases are systems that alloy you to work with larg amount of data.
They are good for data integrity, can handle massive amounts of data, 
quickly combine diffrents datasets, automate spets throgh sql syntax,
can support data for websites and apps.

Can be used by a variety of fields, like:
* Analysts:
  * Marketing
  * Business
  * Sales

* Technical 
  * Data Scients
  * Software Engineers
  * Web Devs


**Installing PostGreSQL and PGAdmains on Linux:** <a name="s1.2"></a>

```console
sudo apt update
```

```console
curl https://www.pgadmin.org/static/packages_pgadmin_org.pub | sudo apt-key add
```

```console
sudo sh -c 'echo "deb https://ftp.postgresql.org/pub/pgadmin/pgadmin4/apt/$(lsb_release -cs) pgadmin4 main" > /etc/apt/sources.list.d/pgadmin4.list && apt update'
```

```console
sudo apt install pgadmin4
```

```console
sudo -u postgres psql
```

```console
psql -U postgres -d dvdrental -h localhost -p 5432
```




<br>

### Section 2: Statement Fundamentals  <a name="s2"></a>

___

**Challenge 1:**

Situation: We want to send out a promotional email to our existing customers!
Challenge: Use a SELECT statement to grab the first and last name of every
costumer and their email address

result:

```sql
SELECT 
	first_name || ' ' || last_name, 
	email
FROM customer;
```

**Challenge 2:**

Situation: 
  we have a visitor who isn't from the USA.
  They're from Australia and so they're not familiar with the Motion Picture Association of America's
  movie rating system such as PG, PG, 13, R, etc..
  So we need to know what are the types of ratings we have in our database.
  So what ratings do we have available?

result:

```sql
SELECT DISTINCT 
  rating 
FROM 
  film;
```

**Count:**
Yo can use other funcs inside count(), like count(distinct(name))

**Challenge 3 No. 1:**

What is the email for the customer with the name Nancy Thomas?

```sql
SELECT 
  email 
FROM 
  customer
WHERE 1=1 
  AND upper(first_name) = 'NANCY' 
  AND upper(last_name) = 'THOMAS';
```

**No. 2:**

Description for the movie Outlaw Hanky

```sql
SELECT
  description 
FROM
  film
WHERE 
  upper(title) = 'OUTLAW HANKY';
```

**No. 3:**

Phone Number for the customer that lies in 259 Ipoh Drive

```sql
SELECT 
  phone 
FROM 
  address 
WHERE 
  upper(address) = '259 IPOH DRIVE';
```

**Challenge 4 No. 1:**

What are the customer id of the 10 first customers that created a payment?

```sql
SELECT 
	customer_id
	,payment_date 
FROM 
	payment
ORDER BY 
	payment_date  
LIMIT 10;
```

**No. 2:**

```sql 
SELECT 
	title
-- 	,length
FROM 
	film
ORDER BY 
	length ASC
LIMIT 5;
```

**No. 3:**

**Bonus:**
```sql
SELECT 
	count(title)
FROM 
	film
WHERE length <= 50;
```

**General Challenges:**

```sql
SELECT 
	count(amount) 
FROM 
	payment
WHERE 
	amount > 5;
```

```sql
SELECT 
	count(*) 
FROM 
	actor
WHERE 
	first_name LIKE 'P%';
```

```sql
SELECT 
  count(distinct(district))
FROM 
  address;
```

```sql
SELECT 
  distinct(district)
FROM 
  address;
```

```sql
SELECT	
	count(*)
FROM 	
	film
WHERE 1=1
	AND rating = 'R'
	AND replacement_cost BETWEEN 5 AND 15;
```

```sql
SELECT	
	count(*)
FROM 	
	film
WHERE 1=1
	AND upper(title) LIKE '%TRUMAN%'
```

<br>

### Section 3: Group by <a name="s3"></a>
___

How many payments did each staff member handle and who gets the bonus?

```sql
select 
	staff_id
	,count(*)
from 
	payment
group by 
	staff_id
order by 
	count(*) desc
```

Avarage replacement cost per rating

```sql
select 
	round(avg(replacement_cost), 2)
	,rating 
from
	film
group by 
	rating;
```

Top 5 customer
```sql
select 
	customer_id
	,sum(amount)
from 
	payment
group by 	
	customer_id
order by 
	sum(amount) desc
limit 5;
```

what customer_id have more than 40 transactions?

```sql
select 
	customer_id
	,count(*)
from 
	payment
group by 
	customer_id 
having 
	count(*) >= 40;
```

Customer_id with more than 100 dollars spent with the staff member 2 

```sql
select 
	customer_id
	,sum(amount)
from 
	payment
where 
	staff_id = 2
group by 
	customer_id 
having 
	sum(amount) >= 100;
```
<br>

### Assessment test1: <a name="s4"></a>
___

1. Return the customer IDs of customers who have spent at least $110 with the staff member who has an ID of 2.
The answer should be customers 187 and 148.

```sql
SELECT
  customer_id
FROM 
  payment
WHERE 1=1  
  AND staff_id = 2 
GROUP BY 
  customer_id
HAVING 
  sum(amount) >= 110;
```

2. How many films begin with the letter J?
The answer should be 20.

```sql
SELECT
  count(*) as filmes
FROM
  film
WHERE 
  UPPER(title) LIKE 'J%';
```

3. What customer has the highest customer ID number whose name starts with an 'E' and has an address ID lower than 500?
The answer is Eddie Tomlin

```sql
SELECT
  first_name || ' ' || last_name as name
FROM
  customer
WHERE 1=1
  AND upper(first_name) LIKE 'E%'
  AND address_id < 500
ORDER BY
   customer_id DESC
LIMIT 1;
```

<br>

### Joins: <a name="s5"></a>
___

What are the emails of the costumers whot live in California?

```sql
SELECT
	email
FROM 
	customer JOIN address 
ON 
  customer.address_id = address.address_id 
WHERE 1=1
	AND upper(address.district) = 'CALIFORNIA';
```

Get a list of all the movies that 'Nick Wahlberg' has been in

```sql
SELECT 
 	film.title
FROM 
  film
LEFT JOIN film_actor ON film.film_id = film_actor.film_id 
INNER JOIN actor ON actor.actor_id = film_actor.actor_id
WHERE 1=1 
	AND upper(actor.first_name) = 'NICK'
	AND upper(actor.last_name) = 'WAHLBERG';
```
