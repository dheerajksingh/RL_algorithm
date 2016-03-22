package com.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TowerApp
{
	static int nDisks = 4;
	static int getDiskNumber(){
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader bdf = new BufferedReader(is);
		try {
			return Integer.parseInt(bdf.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 1;
	}
	public static void main(String[] args)
	{
		nDisks=getDiskNumber();
		doTowers(nDisks, 'A', 'B', 'C');
	}
	//-----------------------------------------------------------
	public static void doTowers(int topN,char from, char inter, char to)
	{
		if(topN==1)
			System.out.println("Disk 1 from " + from + " to "+ to);
		else
		{
			doTowers(topN-1, from, to, inter); // from-->inter
			System.out.println("Disk " + topN +
			" from " + from + " to "+ to);
			doTowers(topN-1, inter, from, to); // inter-->to
		}
	}
//----------------------------------------------------------
} 
