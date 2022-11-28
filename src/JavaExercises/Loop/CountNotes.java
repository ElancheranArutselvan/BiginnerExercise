package JavaExercises.Loop;
import java.io.*;
public class CountNotes {
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int Rs[]={1000,500,200,100,50,20,10,5,2,1};

        System.out.print("Enter any Amount : ");
        int amount=Integer.parseInt(br.readLine());

        int copy=amount;
        int totalNotes=0,count=0;

        System.out.println("\nRs DENOMINATIONS : \n");

        for(int i=0;i<10;i++)
        {
            // counting number of notes.
            count=amount/Rs[i];
            if(count!=0)
            {
                System.out.println(Rs[i]+"\tx\t"+count+"\t= "+Rs[i]*count);
            }
            totalNotes=totalNotes+count;
            amount=amount%Rs[i];
        }

        System.out.println("--------------------------------");

        // printing the total amount
        System.out.println("TOTAL\t\t\t= "+copy);
        System.out.println("--------------------------------");

        // printing the total number of notes
        System.out.println("Total Number of Notes\t= "+totalNotes);
    }
}
