package first;

import java.util.*;
//импорт необходимого компонента, который используется в программе.
//Делает первый символ пароля прописным.
import static java.lang.Character.toUpperCase;

class Password{
    
    char[]Sogl = {'b' , 'c' , 'd' , 'f' , 'g' , 'h' , 'k' , 'l' , 'p' , 'j' ,'s'};
    char[]Glas = {'a','e','i','u','o'};
    char[]Digits= {'0','1','2','3','4','5','6','7','8','9'};
    Random  random = new Random();
    int volume = random.nextInt(5)+7;
  
 	char[] buildPassword(){
            char[]buildedLetters = new char[volume];
            char[]buildedDigits = new char[4];
            
		for (int i=0; i<volume-1; i+=2){
			buildedLetters[i] = Sogl[random.nextInt(Sogl.length)];
			buildedLetters[i+1] = Glas[random.nextInt(Glas.length)];
			}
                
                for (int i=0; i<4; i++){
                    buildedDigits[i] = Digits[random.nextInt(Digits.length)];
                }
               
                char[]buildedPassword = new char[buildedLetters.length +4];

                for (int i=0; i<buildedLetters.length;i++){
                    
                    buildedPassword[i] =  buildedLetters[i];
                }
                buildedPassword[0] = toUpperCase(buildedPassword[0]);
                
                for (int i =0; i< buildedDigits.length; i++ ){
                    buildedPassword[i+buildedLetters.length-1] = buildedDigits[i];
                }
                   
                return buildedPassword;
                }
		
		
	}
                        
public class Main
{
	public static void main (String[] args) //throws java.lang.Exception
	{
				              
		Password password = new Password();
                
                System.out.print(password.buildPassword());
  	
	}	
}
