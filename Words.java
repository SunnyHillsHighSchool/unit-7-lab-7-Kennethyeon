//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kenneth Yeon

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words(String[] wordList)
	{
    words = new ArrayList<Word>();
    for (String a : wordList)
    {
      Word one = new Word(a);
      words.add(one);
    }
	}

	public int countWordsWithXChars(int size)
	{
    //set an int named countWords equal to 0
    int countWords = 0;
    //loop through each element of the arraylist
    for (Word a : words)
    {
      //if the length of the string is equal to the parameter int add one to countWords
      if (a.getWord().length() == size)
      {
        countWords++;
      }
    }
    //return countWords
    return countWords;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
    //create an int named vowelRemove equal to 0
    int vowelRemove = 0;
    //loop through the elements of the arraylist backwards
    for (int i = words.size()-1; i >= 0; i--)
    {
      //if the length of the word is equal to the parameter int
      if(words.get(i).getLength() == size)
      {
        //add getNumVowels to vowelRemove
        vowelRemove = vowelRemove + words.get(i).getNumVowels();
        //remove the word from the arrayList
        words.remove(i);
      }
    }
  //return vowelRemove
  return vowelRemove;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		//set an int named countVowels equal to 0
    int countVowels = 0;
    //loop through each element of the arraylist
    for (Word a: words)
    {
      //if getNumVowels is equal to the parameter value add one to countVowels
      if (a.getNumVowels() == numVowels)
      {
        countVowels++;
      }
    }
    //return countVowels
    return countVowels;
	}
	
	//add in a toString
  public String toString()
  {
    return ""+words;
  }

}