import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Password {

    public static void main(String[] args) throws Exception {

        ArrayList<String> passwords = readPasswords("C:\\Users\\User\\Desktop\\f\\ff.txt");
        HashMap<String, Integer> popular = new HashMap<String, Integer>();

        for (int i = 0; i < passwords.size(); i++) {
            int count = popular.getOrDefault(passwords.get(i), 0) + 1;
            popular.put(passwords.get(i), count);
        }

        popular.

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