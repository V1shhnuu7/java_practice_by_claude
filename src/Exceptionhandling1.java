import java.util.ArrayList;

class Divide {
    int a;
    int b;

    Divide(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void cal() {
        try {

            int res = a / b;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Caught " + e.getMessage());
        }
    }
}
public class Exceptionhandling1 {
    public static void main(String[] args) {
        Divide d1 = new Divide(10,2);
        Divide d2 = new Divide(10,0);

        d1.cal();
        d2.cal();

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("lemon");
        fruits.add("orange");
        try {
            fruits.get(7);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error" +e.getMessage());
        }
        try {
            System.out.println("Element at index 0: " + fruits.get(0));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index! " + e.getMessage());
        }
    }
}