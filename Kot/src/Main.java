import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] catBreeds = {"Siamese", "Persian", "Maine Coon", "Siamese", "Bengal", "Persian", "Siamese"};
        Map<String, Integer> result = ElementCounter.countElements(catBreeds);
        System.out.println(result);
    }
}
