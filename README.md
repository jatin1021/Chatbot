CHATBOT - Jatin Kapoor
## Table of contents
* [General info]
* [Technologies]
* [Setup]
* [Proper Usage]

## General info
This project is simple Chatbot, designed to answer to a few selection of designated keywords. It can also recognize a vareity of possible or negative connotative words and answer accordingly.
	
## Technologies
Project is created with:
* Java
	
## Setup
To run this project, install it locally and launch the code using a IDE
java Chatbot.java

##Usage
-The chatbot will start by asking you a question or statement. 
("Hello, user!", "What's up friend!", "Thanks for chatting with me!", "Hello!", "How's it going?","How are you doing?", "Good Morning", "Good Afternoon!", "Good Evening!", "What's up?”)
-Then if the user replies with a pre defined phrase
("stop", "are you", "age", "color", "food", "school", "sport", "live", "from", "friends", "siblings”)) then there will be a predefined output.
 Current responses to these questions include:
 						{"You can't say stop already, we just started" , "Things are going well", "I am 16 years old", "My favorite color is yellow", "I like pizza", "I go to Bronx Science", 
			     "My favorite sport is soccer", "I live in New York", "I am from USA", "I have lots of friends", "I have one sibling"};
-If the input is something different then the chatbot will determine if the input is happy or mean, and will react accordingly. Currently our dictionary includes:
				/* nice words */
        ("stop" , "adventurous" , "amazing" , "beautiful" , "blessed" ,"delightful" , "exceptional" , "fabulous",
        		"fantastic", "glamorous" , "gleaming") 
        /* nice word responses*/
				{"Already? We didn’t even have a conversation yet" , "Where did you go? Hiking?" , "Life must be good" , "As in a diamond?" , "Truly a heir of god" ,
        		"Great to hear!" , "Wow, amazing!" , "Beautiful!", "Tell me more...", "Look in a mirror" , "Too bright, like your future" };
        /* mean words */
        (stop" , "no" , " not" , " none" , " nobody" , " nothing" , " neither" , " never" , " won’t" , " can’t" , "nope");
        /* mean words responses */
        {"Just one more questions?", "Why?" , "Come on.." , "None, what?" , "Nobody what?" , "Okay then" , "Neither this nor that. LOL" , "Have it your way", 
        "Why not" ,  "and why is that?", "okay.. bye"};

—————————
End

