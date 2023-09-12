public class Reduce {
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
