package Lambda;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberFilter {
    public static List<Integer> filterEvenNumber(List<Integer> numbers){
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }
}
