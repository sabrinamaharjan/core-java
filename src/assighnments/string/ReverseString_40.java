package assighnments.string;

public class ReverseString_40 {

    public static void main(String[] args) {

        //creating object to call non static method
        ReverseString_40 reverseString_40 = new ReverseString_40();
        //calling the method
        final String result = reverseString_40.getReverse("sabrina");
        System.out.println(result);
    }
    public String getReverse(String input) {
        //String reverse = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            //  reverse = reverse + input.charAt(i);
            stringBuilder.append(input.charAt(i));
        }
        return stringBuilder.toString();
    }

}
