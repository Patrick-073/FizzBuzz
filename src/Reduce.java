public class Reduce {
//    Starting with a number n, if n is even divide it by 2. If n is odd, subtract 1. Repeat.
//    For example, if you start with n = 2, the answer is 2. Details: 2 (even, divide by 2) --> 1 (odd, subtract 1) --> 0.
//    In Reduce.java, write a main method that prints how many steps it takes to reach 0 if you start at 100. Add this file to your project, commit,
//    and push.
    public static void main(String[] args) {
    int i = 100;
    int t = 0;
    while (i != 0) {
        if (i % 2 == 0){
            i = i / 2;
            t++;
        }
        else {
            i = i - 1;
            t++;
        }
    }
        System.out.println(t);
    }
}
