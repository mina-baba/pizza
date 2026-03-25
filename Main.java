import java.util.Scanner;

class main {
    public static void main() {
        System.out.print("i sell pizzas\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("would you like some? ");
        String answ = scanner.next();
        if (answ.equals("yes")) {
            System.out.println("i have many options" + " and sizes");
            System.out.println("small \n" + "medium \n" + "large \n");
            System.out.println("which do you prefer?");
            String small = "small";
            String medium = "medium";
            String large = "large";
            String size = scanner.next();
            if (size.equals(small)) {
                System.out.println("pizzax costs 10.99$\n" + "pizzay costs 11.99$\n" + "pizzaz costs 12.99$\n");
            } else if (size.equals(medium)) {
                System.out.println("pizzax costs 11.99$\n" + "pizzay costs 12.99$\n" + "pizzaz costs 13.99$\n");
            } else if (size.equals(large)) {
                System.out.println("pizzax costs 12.99$\n" + "pizzay costs 13.99$\n" + "pizzaz costs 14.99$\n");
            }
            System.out.println("which do you prefer?");
            String pizzax = "pizzax";
            String pizzay = "pizzay";
            String pizzaz = "pizzaz";
            String opt = scanner.next();
            System.out.println("how many would you like?");
            Integer nb = scanner.nextInt();
            if (opt.equals(pizzax)) {
                if (size.equals(small)) {
                    System.out.println("your cost would be " + 10.99 * nb);
                } else if (size.equals(medium)) {
                    System.out.println("your cost would be " + 11.99 * nb);
                } else if (size.equals(large)) {
                    System.out.println("your cost would be " + 12.99 * nb);
                }
            } else if (opt.equals(pizzay)) {
                if (size.equals(small)) {
                    System.out.println("your cost would be " + 11.99 * nb);
                } else if (size.equals(medium)) {
                    System.out.println("your cost would be " + 12.99 * nb);
                } else if (size.equals(large)) {
                    System.out.println("your cost would be " + 13.99 * nb);
                }
            } else if (opt.equals(pizzaz)) {
                if (size.equals(small)) {
                    System.out.println("your cost would be " + 12.99 * nb);
                } else if (size.equals(medium)) {
                    System.out.println("your cost would be " + 13.99 * nb);
                } else if (size.equals(large)) {
                    System.out.println("your cost would be " + 14.99 * nb);
                }
            } else {
                System.out.print("ok");
            }
        }
    }}