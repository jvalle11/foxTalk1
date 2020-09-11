import java.io.*;
import java.util.ArrayList;

public class foxTalk 
{
   
   
    public static void main(String[] args) throws IOException 
    {
        BufferedReader in = new BufferedReader(new FileReader("foxTalk/sounds.txt"));

        String sounds = "";
        String[] soundSplit;
        ArrayList<String> animalSounds = new ArrayList<String>();
        ArrayList<String> mixedSounds = new ArrayList<String>();

        String st = in.readLine();

        for (int i=0; i<Integer.parseInt(st); i++) //reads first int and sets jumbled words from file into mixed sounds variable
        {
            mixedSounds.add(in.readLine());
            
        } 
        String[] mixedSoundsSplit;
        ArrayList<String> mixedS = new ArrayList<String>();
        
        for (int x=0; x<mixedSounds.size();x++)    //outter for sets mixedsounds arr. to string and splits.
        {
            String split = mixedSounds.get(x);
            mixedSoundsSplit = split.split(" ");
            for (int y=0; y<mixedSoundsSplit.length; y++)   //inner for individually prints every words from mixed words
            {
            mixedS.add(mixedSoundsSplit[y]); //adds individual mixed sound to array, word for word
            }
        }
        
        for(int i=Integer.parseInt(st); i<99; i++)  //reads rest of files lines
        {            
            if (!(sounds.equals("what does the fox say?"))) //reads animal sounds and inputs only their actual sound to variable.
            {
             sounds = in.readLine(); 
             soundSplit = sounds.split(" ");
             animalSounds.add(soundSplit[2]);    //adds only the sound made by the animal to array   
            }
        }

        String output1 = String.join(" ", mixedSounds);
        System.out.println("Input: "+output1);

        String output2 = String.join(" ", animalSounds);
        System.out.println("\nAnimal Sounds were: "+output2);
        
        System.out.println("\nAtfer removed\n");
        
        mixedS.removeAll(animalSounds);
        
        String output = String.join(" ", mixedS);
        System.out.println(output);
        //appreciate the hidden quote, always makes solving these programs much more fun!   
}
}
