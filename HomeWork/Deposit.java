package HomeWork;

public class Deposit {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf(args[0]));
        System.out.println(Double.valueOf(args[1])+"%");
        System.out.println(Integer.valueOf(args[2]));

        int sum=(int)(Integer.valueOf(args[0])*(Math.pow(1+(Double.valueOf(args[1])/100),Integer.valueOf(args[2]))));
        System.out.println(sum);

    }
}
