package Seetha;

public class ArrayDuplicate {
    public static void main(String[] args) {
        String[] words = {"Seetha", "raman", "elan", "keethana", "Seetha", "karthika", "vasi", "elan", "Seetha", "karthika"};
        for(int i=0;i<words.length;i++)  //Outer loop for Comparison
        {
            if(words[i]!=null)
            {

                for(int j=i+1;j<words.length;j++)  //Inner loop for Comparison
                {

                    if(words[i].equals(words[j]))  //Checking for both strings are equal
                    {
                        words[j]=null;  //Delete the duplicate words
                    }
                }
            }
        }
        for(int k=0;k<words.length;k++)  //Displaying the String without duplicate words
        {
            if(words[k]!=null)
            {
                System.out.println(words[k]);
            }

        }
    }
    }

