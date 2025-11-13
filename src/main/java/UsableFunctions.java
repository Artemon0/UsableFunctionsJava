public class UsableFunctions {
    public static final String author = "Artemon0";
    public static final String version = "0.0.2";
    public static final String licence = "MIT";

    public static final String[][] functions = {

            {
                    "Module: Calculator.",
                    "Function: public double calculate(double a, double b, char op).\n" +
                            "Description: calculate() receive two doubles and operator, " +
                            "returns result"
            },
            {
                    "Module: MyFile.",
                    "Function: CreateFile(String path, String content, String filename).\n" +
                            "Receive path with filename or path to file without filename " +
                            "and after filename. Content is string: what to write?\n",
                    "Function: DeleteFile(String fullFilePath, File file).\n" +
                            "Receives OR full file path with file name OR File!" +
                            "And... Deletes the file :)",
                    "Function: setExecutable(File file, boolean executable).\n" +
                            "Receives file and boolean executable to set.",
                    "Function: getExecutable(File file).\n" +
                            "Receives file, returns isExecutable(boolean).",
                    "Function: isFile(File file).\n" +
                            "Receives file, returns all about file(return type is String[]).",
                    "Function: isFileS(File file).\n" +
                            "This func is func isFile, but returns String, not String[].",
                    "Function: returnFile(String filepath, String filename).\n" +
                            "Receives filepath and filename. Returns File",
                    "Function: ReadFile(File file).\n" +
                            "Receives file, returns String content"
            }
    };


}
