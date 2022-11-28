package EncryptDecrypt;

import java.util.Scanner;

public class StringEncrpt {
    private String _orginalString;
    private String _encryptedString;
     public String orginalString(){
         return _orginalString;
     }
     public String encryptedString(){
         return _encryptedString;
     }
     public void getInput(){
         Scanner inp = new Scanner(System.in);
         System.out.println("Enter String");
         _orginalString = inp.nextLine();
     }
     public String encrypt(){
         _encryptedString = new String();
         _encryptedString="";
         char c;
         for(int i=0; i<_orginalString.length()-1;i++){
             c=_orginalString.charAt(i);
             c=(char) ((int)c-1);
             _encryptedString += Character.toString(c);
         }
         return _encryptedString;
     }
}
