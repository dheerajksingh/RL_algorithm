package com.lafore.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketChecker {

private String input;
	// input string
	//--------------------------------------------------------------
	public BracketChecker(String in)
	// constructor
	{
		input = in; 
	
	}

//--------------------------------------------------------------
	public void check()
	{
	int stackSize = input.length();
	// get max stack size
	StackX theStack = new StackX(stackSize); // make stack
	for(int j=0; j<input.length(); j++)
	{
		char ch = input.charAt(j);
		switch(ch)
		{
		case '{':
		case '[':
		case '(':
			theStack.push(ch);
		break;
		// 	push them
		case '}':
			// closing symbols
		case ']':
		case ')':
			if( !theStack.isEmpty() )
				// if stack not empty,
			{
				char chx = (char) theStack.pop(); // pop and check
				if( (ch=='}' && chx!='{') ||
						(ch==']' && chx!='[') ||
						(ch==')' && chx!='(') )
					System.out.println("Error: "+ch+" at "+j);
				}
				else
					// prematurely empty
					System.out.println("Error: "+ch+" at "+j);
				break;
		default:
			// no action on other characters
			break;
		} // end switch
	} // end for
	// at this point, all characters have been processed
	
	if( !theStack.isEmpty() )
	System.out.println("Error: missing right delimiter");
	} // end check()
//--------------------------------------------------------------
	
	
	public static void main(String[] args) throws IOException
	{
		String input;
		while(true)
		{
		System.out.print(
		"Enter string containing delimiters: ");
		System.out.flush();
		input = getString();
		// read a string from kbd
		if( input.equals("") )
		// quit if [Enter]
			break;
		// make a BracketChecker
		BracketChecker theChecker = new BracketChecker(input);
		theChecker.check();
		// check brackets
		} // end while
		} // end main()
		//--------------------------------------------------------------
		public static String getString() throws IOException
		{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

	
} 