public class CracklePop {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.print("Crackle");
                if (i % 5 == 0) {
                    System.out.print("Pop");
                }
                System.out.println();
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("Pop");
                continue;
            }
            System.out.println(i);
        }
    }
}