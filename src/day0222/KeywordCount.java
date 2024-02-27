package day0222;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class KeywordCount {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("사용법: java KeywordCount <파일명>");
            return;
        }

        String fileName = args[0];
        String[] keywords = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
                "const", "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally",
                "float", "for", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
                "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp",
                "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void",
                "volatile", "while"};

        Map<String, Integer> keywordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                for (String word : words) {
                    if (keywordCountMap.containsKey(word)) {
                        keywordCountMap.put(word, keywordCountMap.get(word) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("파일을 읽는 도중 오류가 발생했습니다: " + e.getMessage());
            return;
        }

        for (String keyword : keywords) {
            int count = keywordCountMap.getOrDefault(keyword, 0);
            System.out.println(keyword + ": " + count);
        }
    }
}
