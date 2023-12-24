# 4th Homework of the Java Test Automation Course (2nd block) - Solvd Laba
This repository stores the 4th homework given by our mentor in the 2nd block of 
the Java Test Automation Course at Solvd Laba. It consists in adding the MyBatis
framework to the project made in the last homework, satisfying the 
same requirements. We can change the work mode of the project by changing the 
'framework' value in the config.properties. The available values are 'JDBC', to
work with the default JDBC operations or 'MYBATIS', to work with this recently
learned framework.

## Explanation

To accomplish the requirements of the homework, I've firstly added the
MyBatis dependency in the pom.xml to work with it. As I already had the 
DAO interfaces for the three entities that I selected to work with, I just 
needed to create mappers for them in the .xml files. After configuring each 
mapper, I created the MyBatisConfig class to define there a session factory that
I will statically use to get sql sessions in the DAO classes. Finally, I created
the DAO implementation classes in the mybatis/impl package. I didn't have to
change the service layer since I am using a config.properties file to switch
between JDBC and MyBatis with a DBFactory class.

## What did I learn?

This was my first encounter with MyBatis and I can say that was kind of 
confusing with some logic, but I think it is part of the process of learning.
As every framework, it needs much practice to get on with it, and maybe one
project is not enough to learn everything about it. I could learn the way in
which MyBatis works, reading the XML files to implement the interfaces and 
configuring the xml main configuration file of MyBatis to provide to it all the 
necessary data to access the database and use the mappers.

## Technologies

- Java
- Maven
- MySQL
- JDBC
- MyBatis

## Set-Up

To run this project you will need an updated version of Java.
First, clone this repository in a folder of your PC.
You have to put the following command in a terminal:

```bash
  git clone this-repo-url
```
You will need an IDE to open the project folder and, finally, run the 
Main.java file to see the program output.

## Author

- [@Nazareno Bucciarelli](https://github.com/nazabucciarelli)
