# DEVELOPER GUIDE

## 1. Introduction
AyudaPe is an extension/complement to the Yape application that will act as a chatbot for answering a user when a question (related to Yape) is presented. AyudaPe will receive a question/query, parse it, retrieve the answer from a database and show it. It will use Java, Javascript and SpringBoot for back-end, the React JavaScript library for front-end, Amazon Relational Database Service (RDS) and Amazon Elastic Compute Cloud (EC2) from Amazon Web Services and MariaDB for the implementation of the database, and finally use Hibernate as a mean to communicate to said database.

## 2. Features

**Reynaldo Rojas(30%), Nicolas Chipana(70%):** User Interface
- v1.2: Create message boxes when sending and recieving messages, using CSS components it is possible to change the dimensions of the message box depending on the size of the message.
- v1.3: Using React's ComponentDidUpdate function sending and receiving messages scroll the screen proportionally to the size of the message.
- v1.4: Using React simulate a question request after touching a component from the functionality list.
- v2.0: Use flex and CSS components to adapt components to different size of screens.

**Reynaldo Rojas(100%):** Send messages to Watson
- v1.2: Initial backend and frontend setup. Created AWS RDS MariaDB instance.
- v1.3: Endpoint in backend that receives requests and then connects to the Watson API to get an appropiate response.
- v1.4: Call endpoint from React using axios.
- v2.0: AWS EC2 setup and backend deployment. AWS Amplify frontend deployment.

**Rodrigo Bedoya (100%):** Tracking questions without answers
- v1.2: Save all user-chatbot interactions in database
- v1.3: Save all user-chatbot interactions where chatbot answered with default "unable to understand question" phrase.
- v1.4: Save datetime of user-chatbot interaction to track most recent and most critical unanswered questions.

**Reynaldo Rojas (100%):** Feedback option
- v2.0: Receive feedback from Hotjar via email

**Joe Acuña (34%), Bryan Díaz (33%), Juan Navarro (33%):** Process question feature
- v1.2 Integration with Watson Assistant API.
- v1.3 Train model to display list of functionalities.
- v1.4 Add websockets support.
- v2.0 Train model to answer more questions.

## 3. Design

### 3.1. Architecture

#### 3.1.1 Component Diagram

![](diagram_components.png)

#### 3.1.2. Class Diagram
This class diagram corresponds to the back-end and it is only used to storage the history.

![](diagram_class.png)

#### 3.1.3. Interaction Between Components

![](ask_question.png)

![](get_history.png)

### 3.2 Use Case Diagram

![](use_case.png)


## 4. FAQ

What if there is no internet connection, can I ask my doubts to AyudaPe?
- No, AyudaPe works with the User's internet connection to interact with Watson's API and answer messages.

## 5. Glossary

**User Interface (UI)**: Medium by which the user interacts with the device. In this case it will be the buttons and text entries of the application.

**User Experience (UX)**: It refers to the quality of the interaction from the user's perspective.

**Natural Language**: It is any human language that has evolved naturally with use.

**Chatbot**: Program that receives as input text that we refer to as a natural language and, later, returns an appropriate exit. It has a *UI.

**Comunication Protocol**: It is a system of rules that allows two or more entities of a communication system to exchange information.

**HTTP/1.1**: One of the most used *communication protocols on the Internet.

**Application Programming Interface(API)**: Set of routines of a program which can be accessed through communication protocols such as **HTTP/1.1*.

**Request**: It is an order that is made to a program, this can be of various types. The effects can be different depending on the type.

**Client**: Sends *requests to a server.

**Server**: Expect requests from some *client and return responses according.

**Response**: To put it simple, it is understood as the response from the server to the *client as an effect of having received a request.

**Watson Assistant**: It is an *API which a text is sent in a natural language which is processed by another program that has been trained to recognize patterns of phrases; subsequently, it receives the result of the analysis, and processes this result to finally send a response to the client.

**Front-end**: The implementation of a *UI design. 

**Back-end**: The implementation of the procedures that the application should follow.

**Transmission Control Protocol (TCP)**: It is one of the main protocols that make up the Internet.

**Websocket**: It is a *communication protocol that provides two-way communication at the same time via a TCP connection.

**Platform**: It is the environment in which a piece of software is executed.

**Cloud computing service**: Provides technology as a service through the Internet or a dedicated network.

**Amazon Web Services (AWS)**: It is a cloud computing services platform.

**Programming language**: Formal language used to implement programs.

**Javascript**: Programming language used to implement the logical part of the front-end.

**Status Code**: Indicates whether a request has been completed or not.

**Controller**: Process the request and perform actions on the models.

**Model**: Handles the information, logic and rules of the application.

**Database (DB)**: It is an organized data collection.

**Object Oriented Programming (OOP)**: It is a paradigm of programming that is based on objects. These objects can 
contain information and possess routines, known as methods.

**Object oriented programming language**: Programming language that implements OOP.

**Object-relational Mapping (ORM)**: It is a technique used to convert information between systems using an object-
oriented programming language.

**Java**: It is an object-oriented programming language. It will be used to implement the application's back-end.

**Hibernate ORM**: It is a tool that implements ORM and can be used with Java.

**JSX**: It is an object-oriented programming language which is subsequently translated into Javascript. It will be 
used in conjunction with React for the implementation of the front-end.

**Library**: Set of implementations used by a program.

**React**: Javascript library used to build the UI and the logic of the front-end.

**Markup Language**: Language that uses tags to define elements within a document.

**Cascading Style Sheets (CSS)**: A language used to describe the presentation of a document. It is written in markup 
language. 

**Hyper Text Markup Language(HTML)**: A markup language used to describe the structure of a web page

**Framework**: An abstraction that provides generic functionalities that can be implemented by the user

**Spring Boot**: Program that facilitates the implementation of a Spring based application.

