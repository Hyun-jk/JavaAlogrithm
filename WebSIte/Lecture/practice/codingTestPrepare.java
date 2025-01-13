import java.util.ArrayList;
import java.util.List;

public class codingTestPrepare {
    public static void main(String[] args) {
        int[] plants = {2, 3, 1, 2};
        int[] watered = {3, 1, 2, 1, 4, 1};
        List<Integer> result = countHappyPlants(plants, watered);
        System.out.println(result); // 출력: [4, 2, 2, 2, 2, 1]
    }

    public static List<Integer> countHappyPlants(int[] plants, int[] watered) {
        List<Integer> answer = new ArrayList<>();
        int[] lastWatered = new int[plants.length]; // 각 식물이 마지막으로 물을 받은 날짜를 저장하는 배열

        for (int i = 0; i < watered.length; i++) {
            int wateredPlantIndex = watered[i] - 1; // 1-based index를 0-based index로 변경
            lastWatered[wateredPlantIndex] = i; // 해당 식물이 마지막으로 물을 받은 날짜를 업데이트

            // 각 식물이 행복한지 여부를 확인하고 카운트
            int happyCount = 0;
            for (int j = 0; j < plants.length; j++) {
                if (i - lastWatered[j] < plants[j]) { // 물을 마지막으로 받은 날로부터 기분 나쁜 날짜 이내에 물을 받았으면 행복
                    happyCount++;
                }
            }
            answer.add(happyCount);
        }

        return answer;
    }
}
