package password.generator;

/**
 *
 * @author DEVINDA
 */
import java.security.SecureRandom;  
import java.util.Collections;  
import java.util.List;  
import java.util.Random;  
import java.util.stream.Collectors;  
import java.util.stream.IntStream;  
import java.util.stream.Stream;  
  
public class PasswordGenerator {  
      
    /*public static void main(String args[]) {  
          
        // call generateSecurePassword() method to generate random password using Custom Utility Method  
        String pass = generateSecurePassword();  
          
        // print RandomStringUtils password  
        System.out.println("Password generated by Custom Utility Method is:"+pass);  
          
    }  */
      
    // create generateSecurePassword() method that find the secure 10 digit password and returns it to the main() method  
    public static String generateSecurePassword( int numb,int symb, int upper, int low) {  
       
        
        
        // generate a string having 2 numbers, 2 special chars, 2 upper case letters, and 2 lower case letters  
         Stream<Character> demoPassword = Stream.concat(getRandomNumbers(numb ),   
                 Stream.concat(getRandomSpecialChars(2),   
                         Stream.concat(getRandomAlphabets(2, true), getRandomAlphabets(2, false))));  
          
        // create a list of Char that stores all the characters, numbers, and special characters   
        List<Character> listOfChar = demoPassword.collect(Collectors.toList());  
          
        // use shuffle() method of the Collections to shuffle the list elements   
        Collections.shuffle(listOfChar);  
          
        //generate a random string(secure password) by using list stream() method and collect() method  
        String password = listOfChar.stream()  
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)  
                .toString();  
                  
        return password;  
    }  
    
    // create getRandomSpecialChars() method that returns a Stream of special chars of the specified length  
    public static Stream<Character> getRandomSpecialChars(int length) {  
          
        Stream<Character> specialCharsStream;  
          
        // create instance of SecureRandom  
        Random random = new SecureRandom();  
          
        // use ints() method of random to get IntStream of special chars of the specified length  
        IntStream specialChars = random.ints(length, 33, 45);  
        specialCharsStream =  specialChars.mapToObj(data -> (char) data);  
          
        // return stream to the main() method  
        return specialCharsStream;  
    }  
      
    // create getRandomNumbers() method that returns a Stream of numbers of the specified length  
    public static Stream<Character> getRandomNumbers(int length) {  
          
        Stream<Character> numberStream;  
          
        // create instance of SecureRandom  
        Random random = new SecureRandom();  
          
        // use ints() method of random to get IntStream of number of the specified length  
        IntStream numberIntStream = random.ints(length, 48, 57);  
        numberStream = numberIntStream.mapToObj(data -> (char) data);  
          
        // return number stream to main() method  
        return numberStream;  
    }  
      
    // create getRandomAlphabets() method that returns either a stream of upper case chars or stream of lower case chars  
    // of the specified length based on the boolean variable check  
    public static Stream<Character> getRandomAlphabets(int length, boolean check) {  
          
        Stream<Character> lowerUpperStream;  
          
        // for lower case stream  
        if(check == true) {  
            // create instance of SecureRandom  
            Random random = new SecureRandom();  
              
            // use ints() method of random to get IntStream of lower case letters of the specified length  
            IntStream lCaseStream = random.ints(length, 'a', 'z');  
            lowerUpperStream =  lCaseStream.mapToObj(data -> (char) data);  
        }  
        // for upper case stream  
        else {  
            // create instance of SecureRandom  
            Random random = new SecureRandom();  
              
            // use ints() method of random to get IntStream of upper case letters of the specified length  
            IntStream uCaseStream = random.ints(length, 'A', 'Z');  
            lowerUpperStream =  uCaseStream.mapToObj(data -> (char) data);  
        }  
          
        // return lowerUpperStream to main() method  
        return lowerUpperStream;  
          
    }  
      
}  