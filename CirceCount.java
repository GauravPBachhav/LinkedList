import java.util.*;

public class CirceCount {
    public static void main(String[] args) {
        
        String name = "01230394586";

        HashMap<String , Integer>   map = new HashMap<>();

        map.put("0",1);
        map.put("6",1);
        map.put("9",1);
        map.put("8",2);
        
        
int count = 0;

        for(int i = 0 ; i< name.length() ; i++)
        {
            String str = name.charAt(i) + "";
            count = count + map.getOrDefault(str, 0);
        }

        System.out.println(count);

    }
}
