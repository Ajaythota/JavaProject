import java.util.Arrays;
import java.util.HashMap;

public class SherlockAnagram {


    public static void main(String[] args) {
        String s = "cdcd";
        //System.out.println(s.substring(0,1));
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                char[] c = s.substring(i, j + 1).toCharArray();
                Arrays.sort(c);
                String k = new String(c);
                 System.out.println(k);
                if (hm.containsKey(k))
                    hm.put(k, hm.get(k) + 1);
                else
                    hm.put(k, 1);
            }


        }

        System.out.println(hm);

        int pairs = 0;
        for (String k : hm.keySet()) {
            int v = hm.get(k);
            if (v > 1)
                pairs += (v * (v-1))/2;

        }

        System.out.println(pairs);
    }

}