import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File(".\\data.csv").getAbsoluteFile();
        int ecoValue = 200;
        EcoAnalyzer ecoAnalyzer = new EcoAnalyzer(file, ecoValue);
        try {
            ecoAnalyzer.analyze();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
