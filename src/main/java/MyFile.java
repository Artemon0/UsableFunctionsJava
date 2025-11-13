import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public final class MyFile {
    public static void CreateFile(String path, String content, String filename) {
        if (filename.isEmpty()) {
            path += "/" + filename;
        }
        File file = new File(path);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) ;
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        try (FileWriter fw = new FileWriter(path)) {
            fw.append(content);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void DeleteFile(String fullFilePath, File file) {
        if (fullFilePath != null) {
            file = new File(fullFilePath);
        }
        if (file.exists()) {
            try {
                if (file.delete()) return;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else {
            System.out.println("File not exists");
        }
    }

    public static void setExecutable(File file, boolean executable) {
        if (file.exists()) {
            if (file.setExecutable(executable)) System.out.println("Success");
            else System.out.println("Failed");
        } else {
            System.out.println("File not exists");
            return;
        }
    }

    public static boolean getExecutable(File file) {
        if (file.exists()) return file.canExecute();
        else return false;
    }

    public static String[] isFile(File file) {
        return new String[]{
                "File exists: " + file.exists(),
                "File name: " + file.getName(),
                "File path: " + file.getPath(),
                "File.toString(): " + file
        };
    }

    public static String isFileS(File file) {
        return Arrays.toString(isFile(file));
    }

    public static File returnFile(String filepath, String filename) {
        if (!filename.isEmpty()) {
            filepath += "/" + filename;
        }
        return new File(filepath);
    }

    public static String ReadFile(File file) {
        try (FileReader fr = new FileReader(file)) {
            StringBuilder sb = new StringBuilder();
            while (fr.ready()) {
                int res = fr.read();
                sb.append((char) res);
            }
            return sb.toString();
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

}

