# Kyiv GL Java ProCamp course entry task
## Created by Semen Chudakov (simai9946@gmail.com)

# Getting started
This app deals with displayin the information about an airline company.

On the GUI form you can find three buttons:
* show result button that finds aircraft in th company with a specific 
rate of fuel consumption you can input above.
* calculate total capacity button which show the information sbout 
total passenger and cargo capacityof the aircraft in the company
* sorted aircraft list button which displays all aircraft of the 
company sorted by its flight range

On the right part of the form there is a text field on which 
information will be displayed

The project consist of two modules:

* Airline module deals with managing the airline company 
and defining the aircraft classes hierarchy.
* Airline_UI module dealth with building a GUI form for a 
user and handling his requests


# Prerequisites
On a local machine there should be:
* Java 8
* Maven v3.5.2

# Installing
1. git clone https://github.com/SChudakov/GL.git
1. mvn clean install
1. java -jar Airline_UI\target\Airline_Interface-1.0-SNAPSHOT.jar

# Running the tests
mvn test

# Build with
* Maven

# Authors
* Semen Chudakov

