import java.util.Scanner;

class practice1 {
    static void main(String[] args) {
        System.out.println("Does it palindorme?");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String sentence = scanner.nextLine();
            if (sentence.equals("exit")) {
                break;
            }

            boolean isPalindrome = true;
            for (int i = 0; i < sentence.length() / 2; i++) {
                char currentChar = sentence.charAt(i);
                char otherChar = sentence.charAt(sentence.length() - i - 1);

                if (currentChar != otherChar) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println("Sentence: " + sentence + " is palindrome");
            } else {
                System.out.println("Sentence: " + sentence + " is not palindrome");
            }
            System.out.println("Next sentence to check");
        }
        System.out.println("end");
    }
}
