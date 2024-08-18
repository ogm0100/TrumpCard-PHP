package myproject;

import java.util.Scanner;

public class HighAndLow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int leftCard = drawCard();
            int rightCard = drawCard();

            displayGameStart();
            displayQuestion(leftCard);

            String select = getUserChoice(sc);
            displayUserSelection(select);

            String result = determineResult(leftCard, rightCard);

            displayResult(leftCard, rightCard);
            if (select.equals(result)) {
                System.out.println("  →You Win!");
            } else {
                System.out.println("  →You Lose..");
                System.out.println();
                System.out.println("  --ゲーム終了--");
                break;
            }
            System.out.println();
            System.out.println("  --次のラウンド--");
        }

        sc.close();
    }

    private static int drawCard() {
        return (int) (Math.random() * 9) + 1;
    }

    private static void displayGameStart() {
        System.out.println("*****************");
        System.out.println("* High & Low    *");
        System.out.println("*****************");
        System.out.println();
    }

    private static void displayQuestion(int leftCard) {
        System.out.println("   [問題表示]   ");
        System.out.println("*****    *****");
        System.out.println("*   *    * * *");
        System.out.print("* ");
        System.out.print(leftCard);
        System.out.print(" *   ");
        System.out.println(" * * *");
        System.out.println("*   *    * * *");
        System.out.println("*****    *****");
    }

    private static String getUserChoice(Scanner sc) {
        String select;
        while (true) {
            System.out.print("High or Low ?(h/l) > ");
            select = sc.nextLine().trim().toLowerCase();
            if (select.equals("h") || select.equals("l")) {
                break;
            }
            System.out.println("無効な入力です。もう一度入力してください。");
        }
        return select;
    }

    private static void displayUserSelection(String select) {
        if (select.equals("h")) {
            System.out.println("→Highを選択しました。");
        } else {
            System.out.println("→Lowを選択しました。");
        }
    }

    private static String determineResult(int leftCard, int rightCard) {
        if (leftCard < rightCard) {
            return "h";
        } else if (leftCard > rightCard) {
            return "l";
        } else {
            return null;  // カードが同じ場合は選択したものが勝ち
        }
    }

    private static void displayResult(int leftCard, int rightCard) {
        System.out.println();
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
    }
}
