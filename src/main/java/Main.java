import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String text1 = ",olleH !tseug yM eman si .ubA";

        Function<String, String> function = string -> Arrays.stream(string.split(" "))
                .map(word -> new StringBuilder(word).reverse().append(" "))
                .collect(Collectors.joining());

        System.out.println(function.apply(text1));
    }
}
