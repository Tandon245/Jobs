
# Jobs Application
This is a simple Spring Boot application that allows users to manage job postings. It is written in Java and uses the Spring framework.

Features
The Jobs application allows users to perform the following operations:

Add a new job posting
View a list of all job postings
View a specific job posting by ID
Delete a job posting by ID
Get a list of all job postings by job type
Data Structure
The Jobs application uses a relational database to store job postings. The database schema includes the following tables:

jobs: contains information about job postings, including job title, company name, job type, and job description.
Endpoints
The following endpoints are available:

POST /jobs/addJob: Add a new job posting
GET /jobs/getAllJobs: Get a list of all job postings
GET /jobs/getJobById/{id}: Get a specific job posting by ID
DELETE /jobs/deleteJobById/{id}: Delete a job posting by ID
GET /jobs/getJobByJobType/{jobType}: Get a list of all job postings by job type
Technology Stack
The Jobs application uses the following technologies:

Java
Spring Boot
JPA/Hibernate
MySQL
Project Summary
The Jobs application is a simple example of a Spring Boot application that uses JPA/Hibernate to interact with a MySQL database. It provides basic functionality for managing job postings, including adding, viewing, and deleting job postings, as well as searching for job postings by job type.
