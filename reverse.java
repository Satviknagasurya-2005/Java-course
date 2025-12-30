public class Reverse {
    public int revDig(int number) {
        int rev = 0;
        while (number != 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number = number / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Reverse r = new Reverse();
        System.out.println(r.revDig(45678));
    }

}