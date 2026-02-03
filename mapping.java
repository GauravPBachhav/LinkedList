import java.util.*;
public class mapping
{
    public static void main(String[] args) {
        String name = "016578590";
        HashMap<String , Integer> map = new HashMap<>();

        map.put("0",1);
        map.put("6", 1);
        map.put("8", 2);
        map.put("9", 1);


        int count = 0 ; 

        for(int i = 0 ; i< name.length(); i++)
        {
            char ch = name.charAt(i);
            String str = ch + "";
            count = count + map.getOrDefault(str, 0);

        }

System.out.println(count);

    }
}