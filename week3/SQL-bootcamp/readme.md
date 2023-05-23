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
4. [Assessment Test 1](#s4)
5. [JOINS](#s5)
6. [Advanced Functions](#s6)
7. [Assessment Test 2](#s7)
8. [Creating Databases](#s8)
9. [Assessment Test 3](#s9)
10. [Conditional Expressions and Procedures](#s10)

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
sudo sh -c 'echo "deb http://apt.postgresql.org/pub/repos/apt $(lsb_release -cs)-pgdg main" > /etc/apt/sources.list.d/pgdg.list'
```

```console
wget --quiet -O - https://www.postgresql.org/media/keys/ACCC4CF8.asc | sudo apt-key add -
```

```console
sudo apt-get -y install postgresql
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
<br>

### Advanced Functions: <a name="s6"></a>
___

* Extract([DAY, MONTH, YEAR, WEEK] FROM date)
* Age(date) -> how old date is
* TO_CHAR()
* WHERE EXISTS -> if subquery has at least one row

<br>

### Test 2 <a name="s7"></a>
___

How can you retrieve all the information from the cd.facilities table?

```sql
SELECT 
	*
FROM
	cd.facilities;
```

You want to print out a list of all of the facilities and their cost to members. How would you retrieve a list of only facility names and costs?

```sql
SELECT 
	f.name
	,f.membercost
FROM
	cd.facilities AS f;
```

How can you produce a list of facilities that charge a fee to members?

```sql
SELECT 
	*
FROM 
	cd.facilities
WHERE 
	membercost > 0;
```

How can you produce a list of facilities that charge a fee to members, and that fee is less than 1/50th of the monthly maintenance cost? Return the facid, facility name, member cost, and monthly maintenance of the facilities in question.

```sql
SELECT 
	facid
	,name
	,membercost
	,monthlymaintenance
FROM 
	cd.facilities AS f 
WHERE 1=1 
	AND membercost > 0 
	AND membercost < monthlymaintenance/50
```

How can you produce a list of all facilities with the word 'Tennis' in their name?

```sql
SELECT
	*
FROM
	cd.facilities
WHERE 
	upper(name) LIKE '%TENNIS%'
```

How can you retrieve the details of facilities with ID 1 and 5? Try to do it without using the OR operator.

```sql
SELECT 
	*
FROM 
	cd.facilities
WHERE 
	facid IN (1, 5);
```

How can you produce a list of members who joined after the start of September 2012? Return the memid, surname, firstname, and joindate of the members in question.

```sql
SELECT 
	*
FROM 
	cd.members
WHERE 
	joindate >= '2012-09-01';
```

How can you produce an ordered list of the first 10 surnames in the members table? The list must not contain duplicates.

```sql
SELECT
	DISTINCT surname
FROM
	cd.members
ORDER BY surname
LIMIT 10;
```

You'd like to get the signup date of your last member. How can you retrieve this information?

```sql
SELECT
	MAX(joindate) 
FROM 
	cd.members;
```

Produce a count of the number of facilities that have a cost to guests of 10 or more.

```sql
SELECT 
	count(':)')
FROM
	cd.facilities
WHERE 
	guestcost >= 10;
```

Produce a list of the total number of slots booked per facility in the month of September 2012. 
Produce an output table consisting of facility id and slots, sorted by the number of slots.

```sql
SELECT 
	facid
	,sum(slots)
FROM
	cd.bookings
WHERE 1=1
	AND starttime >= '2012-09-01' 
	AND starttime < '2012-10-01'
GROUP BY facid
ORDER BY sum(slots)
```

Produce a list of facilities with more than 1000 slots booked. 
Produce an output table consisting of facility id and total slots, sorted by facility id.

```sql
SELECT 
	facid
	,sum(slots)
FROM
	cd.bookings
GROUP BY facid
HAVING sum(slots) > 1000
ORDER BY facid
```

How can you produce a list of the start times for bookings for tennis courts, for the date '2012-09-21'? Return a list of start time and facility name pairings, ordered by the time.

```sql
SELECT
	TO_CHAR(b.starttime, 'HH24:MI:SS') 
	,f.name
FROM cd.facilities AS f
JOIN cd.bookings   AS b ON f.facid = b.facid
WHERE 1=1
	AND TO_CHAR(b.starttime, 'YYYY-MM-DD') = '2012-09-21'
	AND upper(f.name) LIKE 'TENNIS COURT%'
```

How can you produce a list of the start times for bookings by members named 'David Farrell'?

```sql
SELECT 
	b.starttime
	,m.firstname || ' ' || m.surname AS name
FROM 
	cd.bookings AS b
JOIN 
	cd.members AS m 
ON 
	b.memid = m.memid
WHERE 1=1
	AND upper(m.firstname) = 'DAVID' 
	AND upper(m.surname) = 'FARRELL';
```
<br>

### Creating Databases: <a name="s8"></a>
___

```sql
CREATE TABLE table_name(
	column_name TYPE column_constraint,
	column_name TYPE column_constraint,
	table_constraint table_constraint
) INHERITS existing_table_name;
```

>**Keyword:_** SERIAL is a sequence data type

<br>

### Test 3: <a name="s9"></a>
___
```sql
-- Create a new database called "School" this database should have two tables: teachers and students.
-- The students table should have columns for student_id, first_name,last_name, homeroom_number, phone,email, and graduation year.
CREATE TABLE IF NOT EXISTS students(
	student_id SERIAL PRIMARY KEY,
	first_name VARCHAR(200) NOT NULL,
	last_name VARCHAR(200) NOT NULL,
	homeroom_number INTEGER,
	phone VARCHAR(20) NOT NULL UNIQUE,
	email VARCHAR(200) UNIQUE,
	graduation_year INTEGER
);

-- The teachers table should have columns for teacher_id, first_name, last_name,
-- homeroom_number, department, email, and phone.

CREATE TABLE IF NOT EXISTS teachers(
	teacher_id SERIAL PRIMARY KEY,
	first_name VARCHAR(200) NOT NULL,
	last_name VARCHAR(200) NOT NULL,
	homeroom_number INTEGER,
	department VARCHAR(200),
	phone VARCHAR(20) NOT NULL UNIQUE,
	email VARCHAR(200) UNIQUE
);

-- The constraints are mostly up to you, but your table constraints do have to consider the following:

--  We must have a phone number to contact students in case of an emergency.

--  We must have ids as the primary key of the tables

-- Phone numbers and emails must be unique to the individual.

-- Once you've made the tables, insert a student named Mark Watney (student_id=1) who has a phone number of 777-555-1234 and doesn't have an email. 
-- He graduates in 2035 and has 5 as a homeroom number.

INSERT INTO students(
	first_name
	,last_name
	,phone
	,graduation_year
	,homeroom_number
)
VALUES(
	'MARK'
	,'WATNEY'
	,'777-555-1234'
	,2035
	,5
);

-- Then insert a teacher names Jonas Salk (teacher_id = 1) who as a homeroom number of 5 and is from the Biology department. 
-- His contact info is: jsalk@school.org and a phone number of 777-555-4321.

INSERT INTO teachers(
	first_name
	,last_name
	,homeroom_number
	,department
	,email
	,phone
)
VALUES(
	'JONAS'
	,'SALK'
	,5
	,'BIOLOGY'
	,'jsalk@school.org'
	,'777-555-4321'
);

SELECT * FROM students;
SELECT * FROM teachers;

```

<br>

### Section 10: <a name="s10"></a>
___

```sql
SELECT 
	SUM(CASE rating
		WHEN 'R' THEN 1 ELSE 0 END) as r,
	SUM(CASE rating
		WHEN 'PG' THEN 1 ELSE 0 END) as pg,
	SUM(CASE rating
		WHEN 'PG-13' THEN 1 ELSE 0 END) as pg13
FROM film;
```
