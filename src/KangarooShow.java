import java.util.Scanner;

public class KangarooShow {

    public static void main (String args[]){
        boolean result;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите позицию первого кенгуру x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Введите длину прыжка первого кенгуру v1: ");
        int v1 = scanner.nextInt();
        System.out.print("Введите позицию второго кенгуру x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Введите длину прыжка второго кенгуру v2: ");
        int v2 = scanner.nextInt();

        result = isKangarooCrossing(x1, v1, x2, v2);
        System.out.println(result);
    }

    public static boolean isKangarooCrossing(int x1, int v1, int x2, int v2) {

//      return (x1 + v1 == x2 + v2) ? true :  false;

        return (x1 + v1 == x2 + v2);



//        int king1 = x1 + v1;
//        int king2 = x2 + v2;
//
//        if (king1 == king2) {
//            return true;
//        }
//        return false;
    }
}
