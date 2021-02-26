//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kenneth Yeon

import static java.lang.System.*;

public class Word
{
   private static String vowels = "AEIOUaeiou";   	//why is this here?
   																//why is it static?
   
   //add an instance variable
  private String s;
	//create 2 constructors
	public Word()
  {
    s = "";
  }

  public Word(String str)
  {
    s = str;
  }

  //setter method
  public void setWord(String n)
  {
    s = n;
  }
  //getter method
  public String getWord()
  {
    return s;
  }
  
  //getNumVowels 
  public int getNumVowels()
  {
    //create an integer called numVowel and set it equal to 0
    int numVowel = 0;
    //loop through each letter of the word
    for (int i = 0; i < s.length(); i++)
    {
      //loop through each vowel
      for (int a = 0; a < vowels.length(); a++)
      {
        //if character at i is equal to a vowel add one to numVowel
        if (s.charAt(i) == vowels.charAt(a))
        {
          numVowel++;
        }
      }
    }
    //return numVowel at the end of the loop
    return numVowel;
  }

  //getLength
  public int getLength()
  {
    //create an integer called numLength and set it equal to the string length of the word
    int numLength = s.length();
    //return numLength
    return numLength;
  }
  //create a toString method
  public String toString()
  {
    return s;
  }
}