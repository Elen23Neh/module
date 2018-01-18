import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Password {

    public static void main(String[] args) throws Exception {

        ArrayList<String> passwords = readPasswords("C:\\Users\\Lena\\Desktop\\f\\ff.txt");
        HashMap<String, Integer> popular = new HashMap<String, Integer>();

        for (int i = 0; i < passwords.size(); i++) {
            int count = popular.getOrDefault(passwords.get(i), 0) + 1;
            popular.put(passwords.get(i), count);
        }

        ArrayList<String> top = getTop10(popular);

        for (int i = 1; i < top.size() + 1; i++) {
            System.out.println((i) + ". " + top.get(i - 1));
        }
    }

    private static ArrayList<String> getTop10(HashMap<String, Integer> passwords) {
        ArrayList<String> res = new ArrayList<String>();
        String key = "";
        for (int i = 0; i < 10 || i < passwords.size(); i++) {
            int max = 0;
            for (Map.Entry<String, Integer> entry : passwords.entrySet()) {
                Integer value = entry.getValue();
                if (value > max) {
                    max = value;
                    key = entry.getKey();
                }
            }
            res.add(key);
            passwords.remove(key);
        }

        return res;
    }

    private static ArrayList<String> readPasswords(String pathname) throws IOException {
        ArrayList<String> res = new ArrayList<>();
        File file = new File(pathname);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {

            res.add(st.split(" ")[1]);
        }
        br.close();

        return res;
    }
}