
/**
 *
 * @author Gonzalo Santizo 21504
 */


import java.io.*;
import java.util.*;


public class Main {

    /**
     * @param args the command line arguments
     */
public static void main( String[] args ) throws IOException
{
    String filePath = "safecopy.txt"; 
    HashMap<String, String> map = new HashMap<String, String>();

    String line;
    BufferedReader reader = new BufferedReader(new FileReader(filePath));
    while ((line = reader.readLine()) != null)
    {
        String[] parts = line.split(":", 2);
        if (parts.length >= 2)
        {
            String key = parts[1];
            String value = parts[0];
            map.put(key, value);
        } else {
            System.out.println("ignoring line: " + line);
        }
    }

    for (String key : map.keySet())
    {
        System.out.println(key + ":" + map.get(key));
    }
    reader.close();
}
    
}
