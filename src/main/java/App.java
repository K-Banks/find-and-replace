import models.Sentence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        boolean exit = true;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Sentence sentence = new Sentence();

        while (exit) {
            try {
                System.out.println("Hello, please enter a sentence or 'exit': ");
                String userSentence = bufferedReader.readLine();
                if (userSentence.equals("exit")) {
                    exit = false;
                } else {
                    System.out.println("Please enter the word to be replaced: ");
                    String userFind = bufferedReader.readLine();
                    System.out.println("Please enter the replacement word: ");
                    String userReplace = bufferedReader.readLine();

                    String userAnswer = sentence.recreateSentence(userSentence, userFind, userReplace);
                    System.out.println(userAnswer);
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
