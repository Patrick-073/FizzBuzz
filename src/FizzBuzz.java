/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

//    public static void main(String[] args) {
//
//        for (int i = 1; i < 100; i++) {
//
//            // Find out which numbers divide i.
//            boolean divisibleBy3 = i % 3 == 0;
//            boolean divisibleBy5 = i % 5 == 0;
//
//            // Print our appropriate result.
//            if (divisibleBy3 && divisibleBy5) {
//
//                System.out.println("Fizz Buzz");
//
//            } else if (divisibleBy3) {
//
//                System.out.println("Fizz");
//
//            } else if (divisibleBy5) {
//
//                System.out.println("Buzz");
//
//            } else {
//
//                System.out.println(i);
//
//            }
//        }
//    }
        public static void main(String[] args) {
                int i = 1;
                while (i <= 100) {
                        i = doFizzBuzz(i);
                }
        }

        public static int doFizzBuzz(int i) {
                boolean divide3 = i % 3 == 0;
                boolean divide5 = i % 5 == 0;
                if (divide3 && divide5) {
                        System.out.println("Rizz Buzz");
                }
                else if (divide3){
                        System.out.println("Rizz");
                }
                else if (divide5){
                        System.out.println("Buzz");
                }
                else {
                        System.out.println(i);
                }
                i++;
                return i;
        }
}

