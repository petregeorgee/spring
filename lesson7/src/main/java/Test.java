
import java.io.FileInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Test {
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {

        MessageDigest md = MessageDigest.getInstance("SHA-256"); //SHA, MD2, MD5, SHA-256, SHA-384...
        String hex = checksum("C:\\Users\\pegeorge\\Downloads\\licentiere volcano\\new\\Testchecksum\\NE2A-00000117-2022-06-03-01-29.bin", md);
        System.out.println(hex);
        String hex2 = checksum("C:\\Users\\pegeorge\\Downloads\\licentiere volcano\\new\\Testchecksum\\akdsf.bin", md);
        System.out.println(hex2);
        System.out.println(hex.equals(hex2));
    }

    private static String checksum(String filepath, MessageDigest md) throws IOException {

        // file hashing with DigestInputStream
        try (DigestInputStream dis = new DigestInputStream(new FileInputStream(filepath), md)) {
            while (dis.read() != -1) ; //empty loop to clear the data
            md = dis.getMessageDigest();
        }

        // bytes to hex
        StringBuilder result = new StringBuilder();
        for (byte b : md.digest()) {
            result.append(String.format("%02x", b));
        }
        return result.toString();

    }

}
