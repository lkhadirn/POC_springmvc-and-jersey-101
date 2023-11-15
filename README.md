# POC_springmvc-and-jersey-101

## Overview

This project is designed to show a proof of concept on how to use with jersey and spring mvc in the same project.

## Prerequisites

Before you can run this project, make sure you have the following software installed on your system:

1. **Java 8**

2. **Maven**
3. **Apache Tomcat**

## Setup Instructions

Follow these steps to set up and run the project:

1. **Clone the Repository**
2. **Build the Project:**
   
In the root of the project: 
   ```bash
   mvn clean install
   ```
4. **Configure Tomcat:**

* Copy the generated WAR file located in the target directory to the webapps directory of your Apache Tomcat installation.
* Start or restart your Tomcat server.

5. **Access the Application:**
   
you will find the two endpoint ready to use in the file `httpRequests.http`

