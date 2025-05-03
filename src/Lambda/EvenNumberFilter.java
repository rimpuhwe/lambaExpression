package Lambda;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberFilter {
    public static List<Integer> filterEvenNumber(List<Integer> numbers){
        if(numbers.isEmpty()){
            throw  new IllegalArgumentException("the array must not be empty");
        }
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }
    public static List<Integer> filterOddNumber(List<Integer> numbers){
        if(numbers.isEmpty()){
            throw  new IllegalArgumentException("the array must not be empty");
        }
        return numbers.stream()
                .filter(number -> number % 2 == 1)
                .collect(Collectors.toList());
    }
}
