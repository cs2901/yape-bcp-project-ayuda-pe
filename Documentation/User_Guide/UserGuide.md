# USER GUIDE AYUDAPE

## Introduction

AyudaPe is an intergrated chatbot for the Yape application designed to orientate and help the old and new users into learning the app functionalities and helping them with basic problems they may encounter throughout their experience with the app.


## Requirements

The basic requierements for the app are divided into:

Functional:
- List/explain app functionalities
- Rapidly answer questions about security, app limitations, etc.
- Save recent messages
- Intuitive icon in favorable position
- Ability to answer with both text and images

Non-functional:
- Access to the chatbot should be intuitive and easy to find and use
- The system should work for low-spec smartphones, be Android or iOS
- The features should be written in java language
- The chatbot should give precise answers in a short time
- The chatbot responses should be humanized, to make it feel more confortable for the user to use


## Features

**Reynaldo Rojas(30%), Nicolas Chipana(70%):** UI 
- v1.2: Implement message box UI: Using CSS it is possible to change the dimensions of the message box depending on the size of the message.
- v1.3: Scrolling message: Using React it is possible to change the current layout of an HTML to react to a certain action. In this case, sending or receiving a message from AyudaPe will scroll the screen proportionally to the size of the message.
- v1.4: Touchable questions: Using React it is possible to call a back-end function after touching an item. In this case, after touching an option in the chat the described action will call a function that retrieves information from the database to show.

**Rodrigo Bedoya (100%):** tracking questions without answers 
- v1.2: Save all messages in file. Load all messages from file 
- v1.3: Save / load only recent messages. 
- v1.4: Can choose to clear history / select after how much time history should be cleared. 
- v2.0: Show older messages as user goes up.

**Reynaldo Rojas (100%):** feedback option
- v1.2:
- v1.3:
- v1.4:
- v2.0:

**Joe Acuña (34%), Bryan Díaz (33%), Juan Navarro (33%):** process question feature 
- v1.2 Integration with Watson Assistant API.
- v1.3 Train model to display list of functionalities. 
- v1.4 Add websockets support.
- v2.0 Train model to answer more question.


## FAQ

I am a new user, why would I want to use AyudaPe?
- AyudaPe will be pretty useful in you case. Since you don't know all of Yape's functionalities yet, how about asking the chatbot for some advice? AyudaPe will give you an insight of all of Yape's functionalities so you can get the maximum advantage out of the app as a whole!

I wanna know what AyudaPe can do, what features does AyudaPe have?
- AyudaPe can list you all the functionalities Yape has, try asking it anything like you would ask to any regular person. If you wanna ask for specific uses like,"how do I pay using Yape", AyudaPe will show you step by step how to do it using images for you to follow. 

I don's want to give much personal information, would the chatbot ask for aditional?
- Not at all! Yape uses at most the information already given at the moment you sign in to Yape, so don't worry about giving any extra information you might want to keep private

Does Ayudape has any cost commission?
- Not at all! Yape and AyudaPe are and will always be totally free for the users!


## Glossary
- **BCP:** Stands for Banco de Credito del Peru (Peru's Credit Bank)
- **Yape:** A free application from the BCP that allows you to send and recieve money from your cellphone easily, quickly and safely. Totally free and without commission cost
- **New User:** A logged person who recently downloaded Yape and doesn't know all the functionalities yet
- **User:** A logged person who has experience with Yape but doesn't necessarily knows everything about the app 
- **Yapear:** The act of sending or recieving money by using Yape
- **Chatbot:** A computer program designed to simulate conversation with human users, especially over the Internet
- **AyudaPe:** Yape's integrated chatbot
- **QR:** Short for Quick Response (they can be read quickly by a cell phone). They are used to take a piece of information from a transitory media and put it in to your cell phone. Yape has its own QR reader integrated on the app
- **QR reader:** A software designed to read QR codes
- **Yape developer:** Yape staff responsible for maintaining the application

## Appendix

The user stories can be found [here](https://github.com/cs2901/yape-bcp-project-ayuda-pe/issues)

The use cases can be found [here](https://github.com/cs2901/yape-bcp-project-ayuda-pe/blob/master/Documentation/Use_Cases/UseCases.md)
