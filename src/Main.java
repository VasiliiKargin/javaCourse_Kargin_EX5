import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String txt = "";
        txt = scr.nextLine();
        String[] vals = txt.split(" ");
        String name = vals[0];
        int numS = Integer.parseInt(vals[1].trim());
        int sumNum = 0;
        if (getCount(numS)){
            return;
        }
        sumNum = getSum(numS);
        System.out.printf("Здравствуй %s! Сумма цифр в числе = %s", name, getnameSum(sumNum));
    }

    private static boolean getCount( int numS) {
        int count = (numS == 0) ? 1 : 0;
        while (numS != 0) {
            count++;
            numS /= 10;
        }
        if (count < 2 || count > 5) {
            System.out.println("Дружище поменяй число,допустимо от 2 до 5 разрядов!");
            return true;
        }
        return false;
    }

    private static int getSum (int numS){
        int sumNum = 0;
        while (numS != 0) {
            sumNum += (numS % 10);
            numS /= 10;
        }
        return sumNum;
    }
    private static String getnameSum (int sumNum){
        if (sumNum == 0)
            return "ноль";
        if (sumNum == 1)
            return "Один";
        if (sumNum == 2)
            return "Два";
        if (sumNum == 3)
            return "Три";
        if (sumNum == 4)
            return "Четыре";
        if (sumNum == 5)
            return "Пять";
        if (sumNum == 6)
            return "Шесть";
        if (sumNum == 7)
            return "Семь";
        if (sumNum == 8)
            return "Восемь";
        if (sumNum == 9)
            return "Девять";
        if (sumNum == 10)
            return "Десять";
        else
            return "Слишком сложно!!!";
    }
}