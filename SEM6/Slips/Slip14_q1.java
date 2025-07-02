import java.io.*;

class SearchTask extends Thread
{
    private String searchString;
    private File files;
    public SearchTask(File files,String searchString){
        this.files=files;
        this.searchString=searchString;
    }

    public void run()
    {
        try{
            BufferedReader br=new BufferedReader(new FileReader(files));
            String line;
            int lineNumber=1;
            while((line=br.readLine())!=null){
                if(line.contains(searchString)){
                    System.out.println("Found in File :"+files.getName()+" line Number "+lineNumber);
                }
                lineNumber++;

            }
        }
        catch(IOException e){
            System.out.print(e);
        }
    }
}

public class Slip14_q1{
    public static void main(String[] args){
        System.out.print("Enter String:");
        String search=System.console().readLine();
        File CurrentFolder =new File(System.getProperty("user.dir"));
        File[] files =CurrentFolder.listFiles();
        if(files!=null){
            for(File file:files){
                if(file.isFile() && file.getName().endsWith(".txt")){
                    Thread t1=new Thread(new SearchTask(file,search));
                    t1.start();
                }
            }
        }
    }
}