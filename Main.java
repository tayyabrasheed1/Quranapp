
import java.io.*;
import java.util.*;

public class Main {
    
    public static String FilePath = "D:\\University\\3RD SEM\\DS\\Project_DS";
    
    public static void main(String[] args){
        fileSort();
        FirstForm form = new FirstForm();
        form.setLocationRelativeTo(null);
        form.setVisible(true);
    }

    // O(N)
    public static void fileSort(){
        try {
            LinkedList[] list = new LinkedList[26];
            for(int i = 0 ; i < list.length; i++){
                list[i] = new LinkedList<String>();
            }
            BufferedReader reader = new BufferedReader(new FileReader(FilePath + "\\src\\input.txt"));
            String line = reader.readLine();
            while(line != null){
                list[line.charAt(0) - 97].add(line);
                line = reader.readLine();
            }
            reader.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter(FilePath + "\\src\\output.txt"));
            for(int i = 0; i < 26; i++){
                Divide(0,list[i].size()-1, list[i], writer);
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println("Wordlist file not found");
        }
    }


    //  O(1)
    public static void Divide(int f, int r, LinkedList list, BufferedWriter writer) throws IOException{
        int m = (f + r)/2;
        if(f <= r){
            writer.write(list.get(m) + "\n");
            Divide(f,m - 1, list, writer);
            Divide(m + 1,r, list, writer);
        }
    }
}
