//package EncryptDecrypt;
//
//public class StringEcDc {
//
//
//
//    public static String encrypt(String algorithm, String input, SecretKey key,
//                                 IvParameterSpec iv) throws NoSuchPaddingException, NoSuchAlgorithmException,
//            InvalidAlgorithmParameterException, InvalidKeyException,
//            BadPaddingException, IllegalBlockSizeException {
//
//        Cipher cipher = Cipher.getInstance(algorithm);
//        cipher.init(Cipher.ENCRYPT_MODE, key, iv);
//        byte[] cipherText = cipher.doFinal(input.getBytes());
//        return Base64.getEncoder()
//                .encodeToString(cipherText);
//    }
//
//    public static String decrypt(String algorithm, String cipherText, SecretKey key,
//                                 IvParameterSpec iv) throws NoSuchPaddingException, NoSuchAlgorithmException,
//            InvalidAlgorithmParameterException, InvalidKeyException,
//            BadPaddingException, IllegalBlockSizeException {
//
//        Cipher cipher = Cipher.getInstance(algorithm);
//        cipher.init(Cipher.DECRYPT_MODE, key, iv);
//        byte[] plainText = cipher.doFinal(Base64.getDecoder()
//                .decode(cipherText));
//        return new String(plainText);
//    }
//}
//    @Test
//    void givenString_whenEncrypt_thenSuccess()
//            throws NoSuchAlgorithmException, IllegalBlockSizeException, InvalidKeyException,
//            BadPaddingException, InvalidAlgorithmParameterException, NoSuchPaddingException {
//
//        String input = "baeldung";
//        SecretKey key = AESUtil.generateKey(128);
//        IvParameterSpec ivParameterSpec = AESUtil.generateIv();
//        String algorithm = "AES/CBC/PKCS5Padding";
//        String cipherText = AESUtil.encrypt(algorithm, input, key, ivParameterSpec);
//        String plainText = AESUtil.decrypt(algorithm, cipherText, key, ivParameterSpec);
//        Assertions.assertEquals(input, plainText);
//    }