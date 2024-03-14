package dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Grades {
    private static Grades instance = null;
    private HashMap<String, ArrayList<Integer>> scores = new HashMap<>();

    private Grades() {}

    public static Grades getInstance() {
        if (instance == null) {
            instance = new Grades();
        }
        return instance;
    }

    public void addScore(String studentID, Integer grade) {
        scores.computeIfAbsent(studentID, k -> new ArrayList<>()).add(grade);
    }

    public List<Integer> getScores(String studentId) {
        return scores.get(studentId);
    }

    public Double getAverageScore(String studentId) {
        List<Integer> scoreList = scores.get(studentId);
        if (scoreList == null || scoreList.isEmpty()) {
            return null;
        }
        return scoreList.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
    }
}