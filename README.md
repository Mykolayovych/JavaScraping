Java Scraping is a web scraping 
application built in Java that extracts 
job listings from various job boards and websites. 
The project aims to collect relevant job information such 
as job titles, employers, location, posting dates and tags 
from multiple sources and store them in a centralized database.

Before starting the JavaScrapingApplication, you need to create 
a PostgreSQL database - jobs locally and write the connection 
data in application.properties:
* spring.datasource.url=jdbc:postgresql://localhost:5432/jobs
* spring.datasource.username=postgres
* spring.datasource.password=1111

Once the application starts, it will be available to 
receive messages at http://localhost:8080.

This program is aimed at analyzing vacancies from the job site job.techstars.com. 
Where we have two endpoints with two different values: minified — to get only 
general information about jobs, detailed — to get competitive data 
from a job that includes all fields valid for a given job.

Java Scraping is created using the following technologies:
* Java
* Spring Boot (data, JPA, security)
* Liquibase
* PostgreSQL
* H2

The application provides the following endpoints:
* GET /detailed-jobs?function=text - gets a detailed list of jobs.
* GET /minimized-jobs?function=text - gets information about minimized jobs in the list.

The results of the program are saved in the jobs.backup file. 
You can download this backup with already analyzed data. 
You can then copy the backup data to your database via PgAdmin.
