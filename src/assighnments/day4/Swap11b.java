package assighnments.day4;

public class Swap11b {
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        a = a + b;//5+6= 11;
        b = a - b;//11-5 = 6;
        a = a - b;//11-6 = 5;
        System.out.println("The value of a after swap is : " + a);
        System.out.println("The value of b after swap is : " + b);
    }
}
