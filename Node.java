
import java.util.LinkedList;


public class Node {
    public String word;
    public Node left;
    public Node right;
    
    protected LinkedList<Integer> Ayats;
    
    public Node(String word){
        this.word = word;
        Ayats = new LinkedList<>();
    }
    
    public void insertAyat(int AyatNo){
        Ayats.add(AyatNo);
    }
    
    public LinkedList<Integer> getAyats(){
        return Ayats;
    }
    
    @Override
    public String toString(){
        return "[" + word + " - " + Ayats + "]";
    }
}
