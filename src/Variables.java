public class Variables {

    public static void main(String[] args) {

        // 1.

        int age = 33;

        // 2.


        System.out.println(age);

        // 3.

        double balance = 18.89;

        // 4.

        int dollars = (int) balance;

        //System.out.println(dollars);

        // 5.

        balance += 0.5;
        int dollarsRounded = (int) balance;

        //System.out.println(dollarsRounded);

        // 6.

        char letter = 'A';

        // 7.

        System.out.println(letter);

        // 8.

        System.out.println((int)letter);

        // 9.

        letter++;


        // 10.

        System.out.println(letter);

        // 11.

        System.out.println((int)letter);


        // 12.
        /**
         * I set the char letter to the letter A. I casted it into an integer which translates to its base value on the ASCII scale
         * which printed out 65, then I added 1 to it with the postfix increment operator, but then when I printed it out, it was a char,
         * A + 1 = B, so I casted it into an integer again and gave me 65 + 1 = 66 Therefore 65 represents A and 66 represents B.
         */

    }
}
