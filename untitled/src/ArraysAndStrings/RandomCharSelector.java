import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class RandomCharSelector {
    public static void main(String[] args) {
        // Create a list of characters
        List<Character> charList = new ArrayList<>();
        charList.add('a');
        charList.add('b');
        charList.add('c');
        charList.add('d');
        charList.add('e');

        // Print the list
        System.out.println("Character List: " + charList);

        // Select a random character from the list
        char randomChar = getRandomCharFromList(charList);

        // Print the randomly selected character
        System.out.println("Randomly selected character: " + randomChar);
    }

    public static char getRandomCharFromList(List<Character> charList) {
        // Create an instance of Random
        Random random = new Random();

        // Generate a random index based on the size of the list
        int randomIndex = random.nextInt(charList.size());

        // Return the character at the random index
        return charList.get(randomIndex);
    }
}

