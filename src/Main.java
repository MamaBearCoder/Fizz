public class Main {
    public static void main(String[] args) {

        //for loop for 1-100 numbers
        for (int i = 1; i <= 100; i++) {
            boolean fizzOrBuzz = false;

            //code to print out fuzz or buzz
            if (i % 3 == 0) {
                System.out.print("Fizz");
                fizzOrBuzz = true;
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
                fizzOrBuzz = true;
            }

            if (fizzOrBuzz) {
                System.out.println();
            } else {
                System.out.println(String.valueOf(i));
            }
        }
    }
}

