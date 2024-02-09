package app;

public class task1 {


    public static void main(String[] args) {

        String[] words = {"brange", "plum", "tomato", "onibn", "grape"};

        String[] rightWords = correct(words);

        print(rightWords);

    }
    //correct worlds
    public static String[] correct(String[] words) {
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i]
                    .replace("brange", "orange")
                    .replace("onibn", "onion");
        }
        return words;
    }
    // print worlds
    public static void print(String[] words) {
        for (int i = 0; i < words.length; i++) {
            System.out.println((i + 1) + ") " + words[i]);
        }
    }
}
