import java.util.*;
import java.io.*;


public class KnightsTour{
	//constants for the class
	//terminal specific character to clear screen , or hide/show cursor
	final static String clear =  "\033[2J";
	final static String hide =  "\033[?25l";
	final static String show =  "\033[?25h";

	//instance variable
    private int[][]board;


		//terminal specific character to move the cursor
    private String go(int x,int y){
				return ("\033[" + x + ";" + y + "H");
    }
 
    public void wait(int millis){
				try {
						Thread.sleep(millis);
				}
				catch (InterruptedException e) {
				}
    }

    public String toString(){
				String ans = "\n";
				

				return hide + go(0,0) + ans + "\n" + show;
    }

    public KnightsTour(int size){
	board = new int[size][size];
	solve();
    }

    

    public void solve(){
	solve(0,0);
    }


    public void solve(int startx, int starty){
	solve(startx,starty,0);
    }



		
    public boolean solve(int x,int y,int currentMoveNumber){
	//Comment Out
	//System.out.println(this);
	//wait(20);
	//Ends

	if (x >= 0 && x < board.length && y >= 0 && y < board[0].length){
	    if (solve(x+1,y+2,currentMoveNumber+1)){
		return true;
	    }
	    if (solve(x+2,y+1,currentMoveNumber+1)){
		return true;
	    }
	    if (solve(x+2,y-1,currentMoveNumber+1)){
		return true;
	    }
	    if (solve(x+1,y-2,currentMoveNumber+1)){
		return true;
	    }
	    if (solve(x-1,y-2,currentMoveNumber+1)){
		return true;
	    }
	    if (solve(x-2,y-1,currentMoveNumber+1)){
		return true;
	    }
	    if (solve(x-2,y+1,currentMoveNumber+1)){
		return true;
	    }
	    if (solve(x-1,y+2,currentMoveNumber+1)){
		return true;
	    }
	}

	return false;
    }

    public static void main(String[]args){
	KnightsTour a = new KnightsTour(Integer.parseInt(args[0]));
	if (a.solve()){
	    System.out.println();
	}else{
	    System.out.println("No Solution");
	}
    }
}