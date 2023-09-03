
public class Tree{
    Node root;


    //O(1)
    public void insert(String word, int AyatNo){
        Node f = find(word);
        if(f == null){
            Node n = new Node(word);
            if(root == null){
                root = n;
            } else {
                Node temp = root;
                Node prev = root;
                while(temp != null){
                    prev = temp;
                    if(word.compareTo(temp.word) < 0){
                        temp = temp.left;
                    } else {
                        temp = temp.right;
                    }
                }
                if(word.compareTo(prev.word) < 0){
                    prev.left = n;
                } else {
                    prev.right = n;
                }
            }
            n.insertAyat(AyatNo);
        } else {
            f.insertAyat(AyatNo);
        }
    }
    
    public String toString(){
        return toString(root) + " ";
    }
    
    public String toString(Node n){
        if(n == null){
            return "";
        }
        return toString(n.left) + " " + n.word + " " + toString(n.right);
    }
    
    public void traverse() {
        traverse(root);
        System.out.println();
    }


    //O(1)
    public void traverse(Node n){
        if(n != null){
            traverse(n.left);
            System.out.print(n.word + ", ");
            traverse(n.right);
        }
    }


    //O(1)
    public Node find(String key){
        Node temp = root;
        while(temp != null){
            if(key.compareTo(temp.word) < 0){
                temp = temp.left;
            } else if(key.compareTo(temp.word) == 0){
                break;
            } else {
                temp = temp.right;
            }
        }
        return temp;
    }
}
