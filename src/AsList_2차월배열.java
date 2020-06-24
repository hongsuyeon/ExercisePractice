import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AsList_2차월배열 {
    public static void main(String[] args) {

        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");
/*
* Collection, Collector, collect 차이
* collect()는 Collector를 매개변수로 하는 스트림의 최종연산
* Collector는 collect에서 필요한 메서드를 정의해 놓은 인터페이스
* ????
* */
        List<Integer> numbers = Arrays.asList(8, 2, 5, 7, 3, 6);
        List<Integer> oddNumbers = numbers.stream().filter(i -> i%2 != 0).collect(Collectors.toList());
        System.out.println(oddNumbers);


        Map<String, Long> result =
                items.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );
        System.out.println(result);

        ArrayList<int[]> testList = new ArrayList<>();

        List<int[]> list = Arrays.asList(new int[]{5,12}, new int[]{1,12});
        testList.addAll(list);
        System.out.println("첫번째 ::: List를 ArrayList에 넣어 주는 방법");
        testList.stream().forEach(x-> System.out.print(Arrays.toString(x)));

        System.out.println(" ");

        int[][] array = new int[][]{{5,10},{1,2}};
        List<int[]> list2 = Arrays.asList(array);
        testList.addAll(list2);
        System.out.println("두번째 ::: int[][] 를 Arrays.asList()를 통하여 변환 후 넣어 주는 방법");
        testList.stream().forEach(x-> System.out.print(Arrays.toString(x)));

        System.out.println(" ");

        testList.addAll(Arrays.asList(new int[][]{{2,12},{7,12}}));
        System.out.println("세번째 ::: int[][] 를 Arrays.asList()를 통하여 변환 후 넣어 주는 방법(축약)");
        testList.stream().forEach(x-> System.out.print(Arrays.toString(x)));

        System.out.println(" ");
        
        System.out.println("네번째 ::: ArrayList 생성과 동시에 초기화 까지하는 방법");
        ArrayList<int[]> testList2 = new ArrayList<>(Arrays.asList(new int[][]{{2,3},{2,4}}));
        testList2.stream().forEach(x-> System.out.print(Arrays.toString(x)));


    }
}
