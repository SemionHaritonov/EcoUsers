import java.io.*;

public class EcoAnalyzer {
    private int ecoValue;
    private File file;
    public EcoAnalyzer(File file, int ecoValue) {
        this.setFile(file);
        this.setEcoValue(ecoValue);
    }
    public void analyze() throws IOException {
        String regex = "\\|";
        FileReader fileReader = new FileReader(this.file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        File parentalFile = new File(file.getParentFile() + "\\EcoUsers.csv");
        FileWriter fileWriter = new FileWriter(parentalFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String line = bufferedReader.readLine();
        bufferedWriter.write(line);
        bufferedWriter.newLine();

        while ((line = bufferedReader.readLine()) != null) {
            String[] linesAsArray = line.split(regex);
            boolean isEco = true;
            for (int counter = 2; counter < linesAsArray.length; counter++) {
                try {
                    if (Integer.parseInt(linesAsArray[counter]) > this.ecoValue) isEco = false;
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            if (isEco) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.flush();
    }

    public int getEcoValue() {
        return ecoValue;
    }

    public void setEcoValue(int ecoValue) {
        this.ecoValue = ecoValue;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
