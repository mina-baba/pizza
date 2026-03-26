import java.util.Scanner;

class main {
    public static void main() {
        System.out.print("i sell pizzas\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("would you like some? ");
        String answ = scanner.next();
        double cost=0;
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
                    cost =10.99* nb;
                    System.out.println("your cost would be " + cost);
                } else if (size.equals(medium)) {
                    cost =11.99* nb;
                    System.out.println("your cost would be " + cost);
                } else if (size.equals(large)) {
                    cost =12.99* nb;
                    System.out.println("your cost would be " + cost);
                }
            } else if (opt.equals(pizzay)) {
                if (size.equals(small)) {
                    cost =11.99* nb;
                    System.out.println("your cost would be " + cost);
                } else if (size.equals(medium)) {
                    cost =12.99* nb;
                    System.out.println("your cost would be " + cost);
                } else if (size.equals(large)) {
                    cost =13.99* nb;
                    System.out.println("your cost would be " + cost);
                }
            } else if (opt.equals(pizzaz)) {
                if (size.equals(small)) {
                    cost =12.99* nb;
                    System.out.println("your cost would be " + cost);
                } else if (size.equals(medium)) {
                    cost =13.99* nb;
                    System.out.println("your cost would be " + cost);
                } else if (size.equals(large)) {
                    cost =14.99* nb;
                    System.out.println("your cost would be " + cost);}
                }
            System.out.print("Are you a student?(true/false)\n");
            boolean student = scanner.nextBoolean();
            System.out.print("Are you above 65?(true/false)\n");
            boolean senior = scanner.nextBoolean();
            double modPrice;
            modPrice = 0;
            double modPrice1;
            modPrice1 = 0;
            double finalPrice;
            finalPrice = 0;
            if(true == student ){
                modPrice = (cost*0.15);}
            if(true == senior) {
                modPrice1 = ( cost * 0.15);}
            if (student== false&&senior == false){
                System.out.print("no discount for you\n");}
            finalPrice=cost - (modPrice+modPrice1);
                System.out.printf("your finalized cost would be %.2f",finalPrice);}


        else{System.out.print("ok");}

    }
}