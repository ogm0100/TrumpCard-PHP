package mmm.myproject_knd_java ;

import java.util.Scanner;

public class HighAndLow {

	public static void main(String[] args) {

		while(true) {

		int leftCard = (int)(Math.random()*9)+1;

	    int rightCard = (int)(Math.random()*9)+1;

		System.out.println("*****************");
		System.out.println("* High & Low    *");
		System.out.println("*****************");
		System.out.println();
		System.out.println("   [問題表示]   ");
		System.out.println("*****    *****");
		System.out.println("*   *    * * *");
		System.out.print("* ");
		System.out.print(leftCard);
		System.out.print(" *   ");
		System.out.println(" * * *");
		System.out.println("*   *    * * *");
		System.out.println("*****    *****");
		Scanner sc = new Scanner(System.in);
		System.out.print("High or Low ?(h/l) >");
		String select=sc.nextLine();
		if (select.equals("h")) {
			System.out.println("→Highを選択しました。");
		} else {
			System.out.println("→Lowを選択しました。");
		}

		System.out.println();

		String result=null;
		System.out.println("   [結果表示]   ");
		System.out.println("*****    *****");
		System.out.println("*   *    *   *");
		System.out.print("* ");
		System.out.print(leftCard);
		System.out.print(" *    ");
		System.out.print("* ");
		System.out.print(rightCard);
		System.out.println(" *  ");
		System.out.println("*   *    *   *");
		System.out.println("*****    *****");


		if (leftCard<rightCard) {
			result="h";
		} if (leftCard>rightCard) {
			result="l";
		} else if (leftCard==rightCard){
			result=select;
		}

		if (select.equals(result)) {
			System.out.println("  →you Win!");
		} else {
			System.out.println("  →you Lose..");
			System.out.println();
			System.out.println("  --ゲーム終了--");
			break;
		}
			System.out.println();
			System.out.println("  --ゲーム終了--");
		}
	}
}
