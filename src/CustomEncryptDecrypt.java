public class CustomEncryptDecrypt {

    public static void main(String[] args) {
        String val = "sachin The great";
         int secretKey = 8;

        System.out.println(val);
        String encrypt = getEncrptedVal(val, secretKey);
        System.out.println("encrypted"+ encrypt);

        String decrypt = getDecryptVal(encrypt, secretKey);
        System.out.println("decrypted"+ decrypt);
    }
    private static String getEncrptedVal(String val, int secretKey){
        String encrypt ="";
        for (int i=0; i< val.length(); i++){
            char ch = val.charAt(i);
            ch += secretKey;
            encrypt= encrypt+ch;
        }
        return encrypt;
    }

    private static  String getDecryptVal(String encrypt, int secretKey){
  String decrypted ="";
  for(int i =0;i<encrypt.length(); i++){
      char gh = encrypt.charAt(i);
      gh -= secretKey;
      decrypted = decrypted + gh;
  }
return decrypted;
    }
}
