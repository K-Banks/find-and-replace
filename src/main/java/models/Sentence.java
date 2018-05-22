package models;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

    public String[] splitSentence(String sentence) {
        String[] answer = sentence.split(" ");
        return answer;
    }

    public String[] findAndReplace(String sentence, String find, String replace){
        String [] words = this.splitSentence(sentence);
        List<Integer> indices = new ArrayList<Integer>();
        for (Integer i = 0; i < words.length; i++){
            if(words[i].contains(find)){
                indices.add(i);
            }
        }
        for (Integer index : indices){
            if(words[index].equals(find)){
                words[index] = replace;
            }else{
                String[] splitWord = words[index].split(find);
                if(splitWord.length > 1){
                    words[index] = String.join(replace, splitWord);
                }else {
                    char[] indexSplit = words[index].toCharArray();
                    char[]  wordSplit = splitWord[0].toCharArray();
                    if(indexSplit[0] == wordSplit[0]){
                        words[index]= splitWord[0] + replace;
                    }else {
                        words[index]= replace + splitWord[0];
                    }
                }


            }

        }

        return words;

    }

    public String recreateSentence(String sentence, String find, String replace){
        String[] words = this.findAndReplace(sentence, find, replace);
        String answer = String.join(" ", words);
        return answer;
    }

}
