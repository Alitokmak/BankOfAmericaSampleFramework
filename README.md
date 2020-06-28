BankOfAmericaSampleFramework
================

Copyright/Licensing Information : READ LICENSE
-----
Project source can be downloaded from : https://github.com/Alitokmak/BankOfAmericaSampleFramework.git
-----
Author : Ali Tokmak
-----
Overview


I've decided to create a sample Cucumber JUnit Framework and share my approach to creation from scratch.
In this project I have worked on https://www.bankofamerica.com/
The tools, the design and the benefits are written below.

This project should be treated as a continual work in progress. I hope this will help you to better understand
Java and Selenium concepts, regardless of your current knowledge or interest level.

 -----
 Tools

Java - My framework is written using Java language, 1.8 version.

Maven - My framework is created as a maven project, maven is a Java building application tool,
in this project I have used maven to manage dependencies and also run our tests as mvn goals from terminal

Selenium WebDriver - Is the browser automation library/tool/api which I have used in this project.

JUnit -Is used for Cucumber framework, do soft and hard assertions, creating test methods and run in certain order

IDE - I used IntelliJ in my current framework.

Design
-------

Page Object model - My framework used page object model according to which I created a separate classes for
the pages of my application. All the pages are in pages folder.

PageFactory design - a design which makes it easy to access the page object class.
I created a Pages class that enables access to each pages by calling the related methods.

Singleton Driver - My frameworks use a singleton pattern to share the Web Driver instance between different classes

Configuration file - I used to store the important test data. Such as username, password, etc.

Utilities - has the classes that are being used from different classes of my framework


Benefits
-------

1) Easy to maintain:

My framework uses page object model which makes it easy to maintain. For example if i have to update any locator,
I only need to do one code change.
I try to make my tests independent from each other, this means if I update one test,
it will not affect others and also if one fails, others will not be affected.

2) Easy to extend:

It is easy to add new test cases to my framework, and new pages. The design is smooth and clear.

3) Easy to reuse:

I have page object model, utilities which I can reuse for any tests.

4) Multi browser testing:

My framework can run the same tests against different browsers with minimal code change.

5) Types of tests:

My framework can test the UI, database and API of the application.

6) Packaging:

I have create different packages for different types of classes and logic.
Each page package only contains classes with same functionality.

7) Naming conventions:

I do pay a lot of attention to coding standards, especially naming conventions.

Classes, methods variable are named on based on what they do and follow a standard


