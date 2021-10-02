package Assignment7;
import java.math.BigInteger; 
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException; 

public class Sha256 {
	
	public static byte[] getSHA(String input) throws NoSuchAlgorithmException
    { 
        
        MessageDigest md = MessageDigest.getInstance("SHA-256"); 
  
        
        return md.digest(input.getBytes(StandardCharsets.UTF_8)); 
    }
    
    public static String toHexString(byte[] hash)
    {
        
        BigInteger number = new BigInteger(1, hash); 
  
        
        StringBuilder hexString = new StringBuilder(number.toString(16)); 
  
        
        while (hexString.length() < 32) 
        { 
            hexString.insert(0, '0'); 
        } 
  
        return hexString.toString(); 
    }
  
    
    public static void main(String args[])
    { 
        try 
        {
            System.out.println("HashCode Generated by SHA-256 for:"); 
  
            String s1 = "The beginning of the gospel of Jesus Christ, the Son of God."; 
            System.out.println("\n" + s1 + " : " + toHexString(getSHA(s1))); 
  
            String s2 = "As it is written in Isaiah the prophet, \"Behold, I send my messenger before thy face,\r\n"
            		+ "who shall prepare thy way;"; 
            System.out.println("\n" + s2 + " : " + toHexString(getSHA(s2))); 
            
            String s3 = "the voice of one crying in the wilderness:\r\n"
            		+ "Prepare the way of the Lord,\r\n"
            		+ "make his paths straight -- \""; 
            System.out.println("\n" + s3 + " : " + toHexString(getSHA(s3))); 
            
            String s4 = "John the baptizer appeared in the wilderness, preaching a baptism of repentance for the forgiveness of sins."; 
            System.out.println("\n" + s4 + " : " + toHexString(getSHA(s4))); 
            
            String s5 = "And there went out to him all the country of Judea, and all the people of Jerusalem; and they were baptized by him in the river Jordan, confessing their sins."; 
            System.out.println("\n" + s5 + " : " + toHexString(getSHA(s5))); 
            
            String s6 = " Now John was clothed with camel's hair, and had a leather girdle around his waist, and ate locusts and wild honey."; 
            System.out.println("\n" + s6 + " : " + toHexString(getSHA(s6)));
            
            String s7 = "And he preached, saying, \"After me comes he who is mightier than I, the thong of whose sandals I am not worthy to stoop down and untie."; 
            System.out.println("\n" + s7 + " : " + toHexString(getSHA(s7))); 
            
            String s8 = "I have baptized you with water; but he will baptize you with the Holy Spirit.\""; 
            System.out.println("\n" + s8 + " : " + toHexString(getSHA(s8))); 
            
            String s9 = "In those days Jesus came from Nazareth of Galilee and was baptized by John in the Jordan."; 
            System.out.println("\n" + s9 + " : " + toHexString(getSHA(s9))); 
            
            String s10 = "And when he came up out of the water, immediately he saw the heavens opened and the Spirit descending upon him like a dove;"; 
            System.out.println("\n" + s10 + " : " + toHexString(getSHA(s10))); 
            
            String s11 = "and a voice came from heaven, \"Thou art my beloved Son; with thee I am well pleased.\""; 
            System.out.println("\n" + s11 + " : " + toHexString(getSHA(s11))); 
            
            String s12 = "The Spirit immediately drove him out into the wilderness."; 
            System.out.println("\n" + s12 + " : " + toHexString(getSHA(s12))); 
            
            String s13 = "And he was in the wilderness forty days, tempted by Satan; and he was with the wild beasts; and the angels ministered to him."; 
            System.out.println("\n" + s13 + " : " + toHexString(getSHA(s13))); 
            
            String s14 = "Now after John was arrested, Jesus came into Galilee, preaching the gospel of God,"; 
            System.out.println("\n" + s14 + " : " + toHexString(getSHA(s14))); 
            
            String s15 = "and saying, \"The time is fulfilled, and the kingdom of God is at hand; repent, and believe in the gospel.\""; 
            System.out.println("\n" + s15 + " : " + toHexString(getSHA(s15))); 
            
            String s16 = "And passing along by the Sea of Galilee, he saw Simon and Andrew the brother of Simon casting a net in the sea; for they were fishermen."; 
            System.out.println("\n" + s16 + " : " + toHexString(getSHA(s16))); 
            
            String s17 = "And Jesus said to them, \"Follow me and I will make you become fishers of men.\""; 
            System.out.println("\n" + s17 + " : " + toHexString(getSHA(s17))); 
            
            String s18 = "And immediately they left their nets and followed him."; 
            System.out.println("\n" + s18 + " : " + toHexString(getSHA(s18))); 
            
            String s19 = "And going on a little farther, he saw James the son of Zeb'edee and John his brother, who were in their boat mending the nets."; 
            System.out.println("\n" + s19 + " : " + toHexString(getSHA(s19))); 
            
            String s20 = "And immediately he called them; and they left their father Zeb'edee in the boat with the hired servants, and followed him."; 
            System.out.println("\n" + s20 + " : " + toHexString(getSHA(s20))); 
  
            
        }
         
        catch (NoSuchAlgorithmException e) { 
            System.out.println("Exception thrown for incorrect algorithm: " + e); 
        } 
    } 
} 

