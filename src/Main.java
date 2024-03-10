import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args) {
        int[] numbers = {2, 5, 2, 8, 9, 8, 5, 6, 7, 6, 2, 10, 8}; // Örnek bir dizi

        // Tekrar eden çift sayıları saklamak için bir Map oluşturuyoruz
        Map<Integer, Integer> countMap = new HashMap<>();

        // Dizideki her bir sayıyı sayıyoruz
        for (int num : numbers) {
            // Eğer sayı çiftse, sayıyı tekrar etme sayısını artırıyoruz
            if (num % 2 == 0) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
        }

        // Tekrar eden çift sayıları ekrana yazdırıyoruz
        System.out.println("Tekrar eden çift sayılar:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();
            if (count > 1) {
                System.out.println(number + " (Tekrar Sayısı: " + count + ")");
            }
        }
    }
}
