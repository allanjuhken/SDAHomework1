import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Task9 {
    public static void main(String[] args) {
        int[] nums={10,20,30};
        System.out.println(Arrays.stream(nums).average());

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int average = (num1+num2+num3) / 3;
        System.out.println(average);

        IntStream intStream = IntStream.of(10,20,30);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble());

    }
}
