public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

                int min = Integer.MAX_VALUE;

                System.out.println("Enter 10 numbers:");
                for (int i = 0; i < 10; i++) {
                    int number = sc.nextInt();
                    if (number % 2 == 0 && number < min) {
                        min = number;
                    }
                }

                if (min != Integer.MAX_VALUE) {
                    System.out.println("Minimum even number :" + min);
                } else {
                    System.out.println("There are no even number!");
                }
    }
}
