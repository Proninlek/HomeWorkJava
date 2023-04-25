import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class HomeWork3 {
    public static void main(String[] args) {
        String json = readFile("textJSON.txt");
        safeToFile(parseWithCharArray(json), "ParsedJSON.txt");
    }

    public static void safeToFile(String s, String path) {
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("ErrorTask1.log");
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.addHandler(fileHandler);
            logger.log(Level.INFO, "Логирование записи начато. Переданный путь:" + path);
        } catch (IOException e) {
            logger.log(Level.WARNING, "ошибка");
            throw new RuntimeException(e);
        }

        try {
            FileWriter fw = new FileWriter(path);
            fw.append(s);
            fw.flush();
            fw.close();
            logger.log(Level.INFO, "Файл записан успешно");

        } catch (IOException e) {
            logger.log(Level.WARNING, "Произошла ошибка записи: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static String parseWithCharArray(String s) {
        StringBuilder currentWord = new StringBuilder();
        StringBuilder result = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (Character.isLetterOrDigit(c)) {
                currentWord.append(c);
            } else {
                if (c == ':') {
                    switch (currentWord.toString()) {
                        case "фамилия" -> result.append(result.isEmpty() ? "Студент " : "\nСтудент ");
                        case "оценка" -> result.append(" получил ");
                        case "предмет" -> result.append(" по предмету ");
                    }
                    currentWord.delete(0, currentWord.length());
                } else if (c == ',') {
                    result.append(currentWord);
                    currentWord.delete(0, currentWord.length());
                } else if (c == '}') {
                    result.append(currentWord);
                    result.append(".");
                    currentWord.delete(0, currentWord.length());
                }
            }
        }
        return result.toString();
    }

    public static String parseStringMetods(String s) {
        return (s.replaceAll(" ", "")
                .replaceAll("\\[\\{\"ф.+?\":\"", "Студент ")
                .replaceAll("\"\\},\\{\"ф.+?\":\"", ".\nСтудент ")
                .replaceAll("\",\"о.+?\":\"", " получил ")
                .replaceAll("\",\"п.+?\":\"", " по предмету ")
                .replaceAll("\"}]", "."));
    }

    public static String readFile(String path) {
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader(path)) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return sb.toString();
    }
}