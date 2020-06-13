/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asschapter3part2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.IntConsumer;

/**
 *
 * @author Maram Tanani
 */
public class AssChapter3Part2 {
   interface CountInterface {
       void countOccurences(String fileName);
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           CountInterface count = (String fileName) -> {
           HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
           BufferedReader bufferedReader; 
           try {
               bufferedReader = new BufferedReader(new FileReader("count.txt"));
               String inputString = bufferedReader.readLine();
               while (inputString != null) { 
                   char[] charArray = inputString.toCharArray();
                   for (char a : charArray) {
                       if (a != ' ') {
                           if (charMap.containsKey(a)) {
                               charMap.put(a, charMap.get(a) + 1); 
                           } else {
                               charMap.put(a, 1); 
                           }
                       }
                   }
                   inputString = bufferedReader.readLine();
               }
               bufferedReader.close();
           } catch (IOException e) {
               e.printStackTrace();
           }
           for (Map.Entry element : charMap.entrySet()) {
               System.out.println(element.getKey() + " " + element.getValue());
           }
       };
      count.countOccurences("count.txt");
      //QUESTION NUMBER 1 ********
        IntConsumer intConsumer = new IntConsumer(){
            public void accept(int value)
            {
                System.out.printf("%d ", value);
            }
            //value -> System.out.printf("%d ", value)
            //String::toUpperCase
            // () -> "Welcome to lambdas!"
            //Math::sqrt
            //value -> value * value * value
        }; 
        
    
      
    }
    
}
