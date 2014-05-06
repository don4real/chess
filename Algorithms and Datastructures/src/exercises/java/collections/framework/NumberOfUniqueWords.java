package exercises.java.collections.framework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

public class NumberOfUniqueWords {
 //1.	Write a program that counts the number of unique words in a text file.
	private static final String PATH = System.getProperty("user.dir") + "/src/textfile/";
	private static final String FILENAME = "text.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashSet = new HashSet<String>();
		
		File file = new File(PATH + FILENAME);
		
		try {
			
			FileWriter fw = new FileWriter(file,true);
			
			fw.append("hello test");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
/*		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			while(br.ready()){
				String line = br.readLine();
				String[] words = line.split(" ");
				int i=0;
				for(String word:words){
					
					hashSet.add(words[i++]);
				}
				i=-1;
				
				
			}
			System.out.println(hashSet);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(file);
		*/
	}

}
