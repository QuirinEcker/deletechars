import java.util.Scanner;

public class Ecker_DeleteChars {

    public static void main(String[] args) {
        String eliminatingText;
        String inputText;
        String outputText;

        System.out.println("DeleteChars");
        System.out.println("===========");
        inputText = inputText();
        eliminatingText = eliminationText();

        int[] inputTextChars = new int[inputText.length()];
        inputTextChars = checkChars(inputText, eliminatingText);
        outputText = deleteChars(inputTextChars, inputText);
        System.out.println(outputText);
    }

    private static String deleteChars(int[] inputTextChars, String inputText) {
        String outputText = "";

        for (int i = 0; i < inputText.length(); i++) {
            int helpx = 0;
            for (int x = helpx; x < inputTextChars.length; x++) {
                if (inputText.charAt(i) == inputText.charAt(inputTextChars[x])) {

                } else {
                    outputText += inputText.charAt(i);
                    x = inputTextChars.length;
                }
            }
        }

        return outputText;
    }

    private static int[] checkChars(String inputText, String eliminationText) {
        int[] inputTextChars = new int[inputText.length()];
        int x = 0;

        for (int i = 0; i < inputText.length(); i++) {
            for (int y = 0; y < eliminationText.length(); y++) {
                if (eliminationText.charAt(y) == inputText.charAt(i)) {
                    inputTextChars[x] = i;
                    x++;
                }
            }
        }
        return inputTextChars;
    }

    private static String eliminationText() {
        Scanner scanner = new Scanner(System.in);

        String eliminatingText;
        System.out.print("Eliminatortext:");
        eliminatingText = scanner.next();
        return eliminatingText;
    }

    private static String inputText() {
        Scanner scanner = new Scanner(System.in);

        String inputText;
        System.out.print("Eingabetext:   ");
        inputText = scanner.next();
        return inputText;
    }
}
