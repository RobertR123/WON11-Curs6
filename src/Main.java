
import java.util.Scanner;
class Product {
    static String people(String getName, double getPrice) {
      return getName + getPrice;
    }
    static boolean hasStock(int getQuantity) {
        if(getQuantity != 0) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String getName = s.next();
        double getPrice = s.nextInt();
        int getQuantity = s.nextInt();
        String getCategory = s.next();

        System.out.println(people(getName, getPrice));
        System.out.println(hasStock(getQuantity));
        System.out.println(getCategory);

    }
}