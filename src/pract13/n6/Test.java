package pract13.n6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\D0niL\\IdeaProjects\\untitled\\src\\pract13\\n6\\" + scanner.next()));
        List<String> words = new ArrayList<>();

        // Считываем слова из файла
        String line;
        while ((line = reader.readLine()) != null) {
            String[] lineWords = line.split(" ");
            words.addAll(Arrays.asList(lineWords));
        }
        reader.close();
        System.out.println(words);

        String result = getLine(words);

        System.out.println("Упорядоченная строка: " + result);
    }

    public static String getLine(List<String> words) {
        if (words.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder(words.remove(0));
        int wordsAdded = 1;

        while (!words.isEmpty()) {
            String lastWord = result.substring(result.length() - 1).toLowerCase();

            boolean wordAdded = false;
            for (int i = 0; i < words.size(); i++) {
                String nextWord = words.get(i).toLowerCase();
                if (lastWord.equals(nextWord.substring(0, 1))) {
                    result.append(" ").append(words.remove(i));
                    wordsAdded++;
                    wordAdded = true;
                    break;
                }
            }

            if (!wordAdded || wordsAdded >= words.size()) {
                break;
            }
        }

        return result.toString();
    }
}
