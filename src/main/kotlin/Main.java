public class Main {
    public static void main(String[] args) {

        Example ex;
        ex = ((x, y) -> x+y);

        int result = ex.calculate(5,190);
        System.out.println(result);

    }
}
interface Example {
    int calculate(int x, int y);
}