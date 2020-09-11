import java.io.*;
import java.util.ArrayList;

public class foxTalk2 
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new FileReader("foxTalk/sounds.txt"));
        FileReader fr = new FileReader("foxTalk/sounds.txt");

        String st = in.readLine();
        ArrayList<String> mixedSounds = new ArrayList<String>();
        ArrayList<String> knownAnimals = new ArrayList<String>();
        
        for (int i=0; i<Integer.parseInt(st); i++)
        {
            mixedSounds.add(in.readLine());
        }
        String thisline = st;


        int linecount = 0;
        System.out.println(mixedSounds);

        
        while(in.readLine() != null)
        {
            linecount++;
            System.out.println(thisline);

        }
        for(int x=Integer.parseInt(st); x<linecount; x++)
        {
            knownAnimals.add(in.readLine());
        }
        


        System.out.println(knownAnimals);
        System.out.println(linecount);

        
    }
}
