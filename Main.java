
/**
 *
 * @author Gonzalo Santizo 21504
 */


import java.io.*;
import java.util.*;
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
public static void main( String[] args ) throws IOException
{
    
    HashMap<String, String> MiCarritoHash = new HashMap<String, String>(); // carrito Hashmap normal
    
    
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
    
        Scanner scan = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {

            System.out.println("\n\nBienvenido al simulador de carrito de compra que estructura quieres usar?");
            System.out.println("1. Nueva hashmap");
            System.out.println("2. Nuevo Linked HashMap");
            System.out.println("3. Nuevo Treemap");
            System.out.println("4. Exit\n\n");

            opcion = scan.nextInt();

            if (opcion == 1) {
                // nuevo hashmap
                scan = new Scanner(System.in);
                String CurrentKey;
                String CurrentValue;
                
                
                System.out.println("Que articulo quieres agregar?");
                CurrentKey = scan.nextLine();
                
                
                System.out.println("Que categoria es?");
                CurrentValue = scan.nextLine();
                
                
                MiCarritoHash.put(CurrentKey, CurrentValue);
                
                System.out.println("En tu carrito hay:\n\n");
                
                for (String MyItem: MiCarritoHash.keySet()) 
                {
                String key = MyItem;
                String value = MiCarritoHash.get(MyItem);
                System.out.println(key + " " + value);
                }

            } else if (opcion == 2) {
                // Nuevo Linked HashMap
            } else if (opcion == 3) {
                // Nuevo Treemap
            } else if (opcion == 4) {
                // exit
            }
        }
    }   
}
