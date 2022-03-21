import org.apache.commons.lang3.StringUtils;

public class MavenStrings {
    public static void main(String[] args) {
        Input input = new Input();
        String userInput = input.getString("Type something: ");
        System.out.println("You entered: " + userInput);
        System.out.println(userInput + " is a number : " + StringUtils.isNumeric(userInput));
        System.out.println("Flipped case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));
    }
}
