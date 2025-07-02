import java.io.*;

 class SimpleSearchEngine {

    public static void main(String[] args) {
        // Accept a string to be searched
        System.out.print("Enter the string to be searched: ");
        String searchString = System.console().readLine();

        // Get the current folder
        File currentFolder = new File(System.getProperty("user.dir"));

        // List all files in the current folder
        File[] files = currentFolder.listFiles();
        
        if (files != null) {
            // Create and start a separate thread for each file
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    Thread searchThread = new Thread(new SearchTask(file, searchString));
                    searchThread.start();
                }
            }
        }
    }

    static class SearchTask implements Runnable {
        private File file;
        private String searchString;

        public SearchTask(File file, String searchString) {
            this.file = file;
            this.searchString = searchString;
        }

       
        public void run() {
            try  {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                int lineNumber = 1;

                while ((line = reader.readLine()) != null) {
                    if (line.contains(searchString)) {
                        System.out.println("Found in file: " + file.getName() + ", Line: " + lineNumber);
                    }
                    
                    lineNumber++;
                }
            } catch (IOException e) {
               
            }
        }
    }
}
