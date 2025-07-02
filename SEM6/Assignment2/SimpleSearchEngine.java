import java.io.*;

class searchTask implements Runnable
{
    private File file;
    private String searchString;

    public searchTask(File file , String searchString)
    {
        this.file=file;
        this.searchString=searchString;
    }

    public void run()
    {
        try
        {
            BufferedReader reader =new BufferedReader(new FileReader(file));
            String line;
            int lineNumber=1;

            while((line=reader.readLine())!=null)
            {
                if(line.contains(searchString))
                {
                    System.out.println("Found in file :"+file.getName()+", Line Number :"+lineNumber);
                }

                lineNumber++;
            }
        }
        catch(IOException e)
        {

        }
    }
}

class SearchEngine
{
    public static void main(String[] args)
    {

        System.out.print("Enter String to be search:");
        String searchString=System.console().readLine();

        File currentFolder=new File(System.getProperty("user.dir"));

        File[] files=currentFolder.listFiles();

        if(files!=null){
            for(File file:files){
                if(file.isFile() && file.getName().endsWith(".txt")){
                   Thread th=new Thread(new searchTask(file , searchString));
                   th.start();
                }
              }
        }
        else{
            System.out.print("NOt found.");
        }
    }
}