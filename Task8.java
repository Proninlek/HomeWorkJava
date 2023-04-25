public class Task8 {
    static void saveToFile(String s) {
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
        logger.addHandler(fileHandler);
        String path = "g/g/g/g/gtest.txt";
        try (FileWriter fileWriter = new FileWriter(path, false)) {
            fileWriter.append(s);
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
            logger.log(Level.WARNING, e.getMessage());
        }
        System.out.println("Тест");
        fileHandler.close();
    }
}
