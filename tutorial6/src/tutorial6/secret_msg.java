
package tutorial6;

public class secret_msg {
    public static void main(String args[]){
        String secret;
        for(int i=0;i<args.length;i++){
            secret=args[i];
            decryptor(secret.toLowerCase());
        }
    }
    
    public static void decryptor(String s){
        String decrypted;
        byte[] ascii_array = s.getBytes();
        for(int i=0;i<ascii_array.length;i++){
            int edited_ascii=ascii_array[i]; 
            edited_ascii = Math.abs(edited_ascii - (int) 'a' -25);
            ascii_array[i]= (byte)(edited_ascii + (int) 'a');
            System.out.print((char) ascii_array[i]);
        }
        System.out.println(" ");
    }
}
