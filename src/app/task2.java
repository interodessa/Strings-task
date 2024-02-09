package app;

public class task2 {
    public static void main(String[] args) {

        String[] words = {"orange", "plum", "tomato", "onion", "grape", "onion"};
        String[] newWords = removeWord(words);
        print(newWords);

    }

    //delete world
    public static String[] removeWord(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String str : words) {
            if(!str.equals("onion")){
                sb.append(str);
                sb.append(" ");
            }
        }
        String result = sb.toString();
        System.out.println(result);
        String[] array = result.split(" ");
        return array;
    }
    public static void print(String[] words) {
        for (int i = 0; i < words.length; i++) {
            System.out.println((i + 1) + ") " + words[i]);
        }
    }
}


