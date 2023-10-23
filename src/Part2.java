import java.util.ArrayList;

public class Part2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        //Add names to the ArrayList
        names.add("Charlie");
        names.add("Snoopy");
        names.add("Lucy");
        names.add("Peppermint");
        names.add("Linus");

        //Switch the first and last letters in each name
        ArrayList<String> switchedNames = new ArrayList<>();
        for(String name : names) {
            switchedNames.add(switchFirstAndLastLetters(name));
        }

        //Display the names with a nice-looking output
        System.out.print("Names = {");
        printArrayList(names);
        System.out.println("}");

        System.out.print("Names (switched) = {");
        printArrayList(switchedNames);
        System.out.println("}");
    }

    // Helper method to switch the first and last letters in a name
    public static String switchFirstAndLastLetters(String name) {
        if (name.length() < 2) {
            return name;
        }
        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);
        String middle = name.substring(1, name.length() - 1);
        return Character.toString(lastChar).toUpperCase() + middle + Character.toString(firstChar).toLowerCase();
    }

    // Helper method to print an ArrayList
    public static void printArrayList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }

    }
    
}
