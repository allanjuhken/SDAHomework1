public class Task13 {
    public static void main(String[] args) {
        int num = 133;
        int num1 = num % 10;
        //System.out.println(num1);

        num = num/10;
        System.out.println(num1);

        int num2= num % 10;
            num = num/10;
        System.out.println(num2);

        int num3 = num % 10;
            num = num / 10;
        System.out.println(num3);

        System.out.println("Sum of numbers: "+ (num1+num2+num3));
    }

}
