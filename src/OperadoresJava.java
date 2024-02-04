public class OperadoresJava {
    public static void main(String[] args) {
        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);
        int modulo = 19 % 3; // 6 * 3 = 18; 19 - 18 = 1
        System.out.println(modulo);
    }
}
