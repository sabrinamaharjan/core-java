package assighnments.day9;

public class Day9 {

    public int getFactorialNumber(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * getFactorialNumber(n - 1);
        }
    }

    public int getNaturalNumberSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public int getReverseNumber(int n) {
        int reverse = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
        }
        return reverse;
    }

    public void getPrintTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + (n * i));
        }
    }

    public void getFabonaci(int x) {
        int a = 5;
        int b = 6;
        int c;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 1; i <= x; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }

    public boolean checkPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public void printPattern(int n) {
        int i, j, num;
        for (i = 0; i < n; i++) {
            num = 1;
            for (j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }


}
