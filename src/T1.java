import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class T1 {
    public static void main(String[] args) {
        stream1().forEach((x)-> System.out.print(x));
        System.out.println();
        stream2().forEach((x)-> System.out.print(x));
        System.out.println();
        stream3().forEach((x)-> System.out.print(x));
    }

    private static Stream<String> stream1(){
        return Arrays.stream("b,i,e".split(","));
    }
    private static Stream<String> stream2(){
        return Stream.of("b,a,e".split(","));
    }

    private static Stream<String> stream3(){
        return Pattern.compile(",").splitAsStream("b,a,e");
    }
}
