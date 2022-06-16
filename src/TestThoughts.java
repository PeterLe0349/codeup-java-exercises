import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestThoughts {

    private static String name;

    public static void main(String[] args) throws Exception {
        String directory = "data";
        String filename = "info.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }
        List<String> groceryList = Arrays.asList("coffee", "milk", "sugar, test, one, two, three");
        Path filepath = Paths.get("data", "info.txt");
        Files.write(filepath, groceryList);



    }







//end class
}


