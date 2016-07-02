
import java.util.Base64;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zOzDarKzOz
 */
public class Test {
    
    public static String encodeByBase64(String str) {
        try {
            byte[] bytesEncoded = str.getBytes();
            return (Base64.getEncoder().encodeToString(bytesEncoded));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        try {
            System.out.println(Test.encodeByBase64("6"));
            System.out.println(Test.encodeByBase64("7"));
            System.out.println(Test.encodeByBase64("8"));
        } catch (Exception e) {
        }
    }
}
