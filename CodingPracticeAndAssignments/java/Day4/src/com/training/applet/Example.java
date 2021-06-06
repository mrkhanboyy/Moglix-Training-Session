package com.training.applet;

import java.util.Scanner;

//
//
//import java.applet.Applet;
//import java.awt.Graphics;
//
//
//@SuppressWarnings("serial")
//public class Example extends Applet
//{
//
//	
//	public void paint(Graphics g) {
//		g.drawOval(300, 300, 150, 150);
//		g.fillOval(350, 340, 15, 15);
//		g.fillOval(390, 340, 15, 15);
//		g.fillOval(370, 380, 5, 5);
//		g.drawArc(350, 380, 70, 30, 160, 200);
//		
//	}
//	
//	
//	
//	
//} 

public class Example {

	static int movestaken = 1000;

	public static void knitour(int chess[][], int r, int c, int total, int killed, int steps) {
		if (r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] == 3) {
			return;
		}

		if (killed == total && steps < movestaken) {
			movestaken = steps;
			return;
		}

		if (chess[r][c] == 1) {
			killed = killed + 1;
		}

		chess[r][c] = 3;
		knitour(chess, r - 2, c + 1, total, killed, steps + 1);
		knitour(chess, r - 1, c + 2, total, killed, steps + 1);
		knitour(chess, r + 1, c + 2, total, killed, steps + 1);
		knitour(chess, r + 2, c + 1, total, killed, steps + 1);
		knitour(chess, r + 2, c - 1, total, killed, steps + 1);
		knitour(chess, r + 1, c - 2, total, killed, steps + 1);
		knitour(chess, r - 1, c - 2, total, killed, steps + 1);
		knitour(chess, r - 2, c - 1, total, killed, steps + 1);
		chess[r][c] = 0;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		?asking number of pawns
		int totalPawns = Integer.parseInt(sc.nextLine());

		int[][] chess = new int[8][8];

//		asking coordinate of pawns
		for (int i = 0; i < totalPawns; i++) {

			int coordinate1 = Integer.parseInt(sc.nextLine());
			int coordinate2 = Integer.parseInt(sc.nextLine());
			chess[coordinate1][coordinate2] = 1;

		}
//		co-ordinates of knoght
		int coordinate1 = Integer.parseInt(sc.nextLine());
		int coordinate2 = Integer.parseInt(sc.nextLine());

		knitour(chess, coordinate1, coordinate2, totalPawns, 0, 0);
		System.out.println(movestaken);

	}
}
