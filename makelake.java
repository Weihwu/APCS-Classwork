import java.io.*;
import java.util.*;

public class makelake{
    int[][] field;
    int row=0;
    int col=0;
    int ground=0;
    int instruction=0;
    String text = "";

    public makelake(String fileName){
	readFile(fileName);
	row = Character.getNumericValue(text.charAt(0));
	col = Character.getNumbericValue(text.charAt(2));
	ground = Character.getNumericValue(text.charAt(4));
	instruction = Character.getNumericValue(text.charAt(6));
	field = new int[row][col];
	int place = 7;
	for (int x = 0; x < row; x++){
	    place += 1;
	    for (int y = 0; y < col; y++){
		place += 2;
		field[row][col] = (int)text.charAt(place);
	   }
	}
    }

    public String readFile(String fileName){
	File file = new File(fileName);
	try{
	    FileReader reader = new FileReader(file);
	    char[] chars = new char[(int) file.length()];
	    reader.read(chars);
	    text = new String(chars);
	    reader.close();
	}catch (IOException e){
	    e.printStackTrace();
	}
	return text;
    }
	   

    public static void main(String[]args){
	makelake a = new makelake("./directions");
	System.out.println(a.field);
    }
}


	