public class KangarooShow {

    public static void main (String args[]){
        isKangarooCrossing(2, 1, 1, 2);

    }

    public static boolean isKangarooCrossing(int x1, int v1, int x2, int v2) {

        int king1 = x1 + v1;
        int king2 = x2 + v2;

        if (king1 == king2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        return false;
    }
}
