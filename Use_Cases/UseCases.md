# USE CASES

## UC01 - Chat History

**System:** YAPE

**Actor:** User

**Requirement:** User has opened chatbot

**Use case:**


**MSS:**
1. User asks about a functionality.
2. Chatbot processes request.
3. Chatbot replies to the question.
4. User leaves the chatbot.
5. User enters again to the chatbot.
6. Chatbot mantains the previous messages.

**Use Case end**

## UC02 - Make a Question 

**Software:** YAPE

**Actor:** User

**Requirement:** User opened chatbot

**Use case:** 

**MSS:**
1. User asks question.
2. Chatbot matches request with a question in database.
3. Chatbot replies answer.
4. Chatbot waits for new questions.
    
**Use case ends**

**Extensions:**
    
2a. No similar question in database (cant’t find suitable answer).

2a1. Chatbot apologizes for not answering and waits for new questions.

## UC03 - Listing functionalities

**Software:** YAPE

**Actor:** User

**Requirement:** User has opened chatbot

**Use case:**


**MSS:**
1. User asks which are Yape functionalities.
2. Chatbot processes request.
3. Chatbot display the list of functionalities (it can be pressed).
4. Chatbot waits for new questions.

**Use Case end**

## UC04 - Button pressed of a functionality

**Software:** YAPE

**Actor:** User

**Requirement:** User has opened chatbot and pressed a functionality in the list of functionality

**Use case:**

**MSS:** 
1. Chatbot write the respective question to that functionality.
2. Chatbot matches request with a question in database.
3. Chatbot answer the question.
4. Chatbot waits for new questions.

**Use case ends**

