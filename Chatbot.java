// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Random;
import java.util.Scanner;

public class Chatbot {
    public Chatbot() {
    }

    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        boolean talkMore = true;
        String[] arrayGreeting = new String[]{"Hello, user!", "What's up friend!", "Thanks for chatting with me!", "Hello!", "How's it going?", "How are you doing?", "Good Morning", "Good Afternoon!", "Good Evening!", "What's up?"};
        Random r = new Random();
        int randomNumber = r.nextInt(arrayGreeting.length);
        System.out.println(arrayGreeting[randomNumber]);
        System.out.println("Ask me a question! But...if you don't want to talk to me, you can say stop at anytime");
        String stop = "stop";
        String[] keywords = new String[]{"stop", "are you", "age", "color", "food", "school", "sport", "live", "from", "friends", "siblings"};
        String[] response = new String[]{"You can't say stop already, we just started", "Things are going well", "I am 16 years old", "My favorite color is yellow", "I like pizza", "I go to Bronx Science", "My favorite sport is soccer", "I live in New York", "I am from USA", "I have lots of friends", "I have one sibling"};
        String[] nice = new String[]{"stop", "adventurous", "amazing", "beautiful", "blessed", "delightful", "exceptional", "fabulous", "fantastic", "glamorous", "gleaming"};
        String[] Nres = new String[]{"Already? We didn’t even have a conversation yet", "Where did you go? Hiking?", "Life must be good", "As in a diamond?", "Truly a heir of god", "Great to hear!", "Wow, amazing!", "Beautiful!", "Tell me more...", "Look in a mirror", "Too bright, like your future"};
        String[] mean = new String[]{"stop", "no", " not", " none", " nobody", " nothing", " neither", " never", " won’t", " can’t", "nope"};
        String[] Mres = new String[]{"Just one more questions?", "Why?", "Come on..", "None, what?", "Nobody what?", "Okay then", "Neither this nor that. LOL", "Have it your way", "Why not", "and why is that?", "okay.. bye"};
        String[] var10000 = new String[]{"How was your day", "What school do you go to", "Do you have any pets?", "None, what?", "Nobody what?", "Okay then", "Neither this nor that. LOL", "Have it your way", "Why not", "and why is that?", "okay.. bye"};

        while(talkMore) {
            String input = sk.nextLine();
            String newInput = input.toLowerCase();

            for(int i = 0; i < keywords.length; ++i) {
                if (newInput.contains(keywords[i])) {
                    System.out.println(response[i]);
                    System.out.println("How are you?");
                } else if (newInput.contains(mean[i])) {
                    System.out.println(Mres[i]);
                    System.out.println("Do you have any pets?");
                } else if (newInput.contains(nice[i])) {
                    System.out.println(Nres[i]);
                    System.out.println("Do you have any siblings?");
                } else {
                    System.out.println("Out of my intricate vocabulary, I still don't understand what you are saying");
                    i = 11;
                }
            }

            System.out.println("Thank you for chatting with me! Good day!");
        }

    }
}
