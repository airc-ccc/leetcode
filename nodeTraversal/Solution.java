import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};


class ShowNodeTree {

    static List<Integer> nodeArr = new ArrayList<>();

    static boolean sParent = true;

    ShowNodeTree() {

    }

    public static void makeNodeArr(Node node)
    {
        if (sParent) {
            nodeArr.add(node.val);
        }
        
        if (node.children == null) {
            nodeArr.add(null);
            nodeArr.add(null);
            return;
        }
        List<Node> children = node.children;
        for(Node nodeC: children) {
            nodeArr.add(nodeC.val);
        }

        for(Node nodeC: children) {
            sParent = false;
            makeNodeArr(nodeC);
        }
    }



    public static void show()
    {   
        int i = 0;
        int j = 0;
        while(i < nodeArr.size()) {
            if (nodeArr.get(i) == null) {
                i++;
                j++;
                continue;
            }
            String ret = "";
            if (j < 2) {
                ret = makeReturn(0);
            } else {
                ret = makeReturn(j);
                j = 0;
            }
            System.out.println(ret+nodeArr.get(i));
            j++;
            i++;
        }
    }


    public static String makeReturn(int childrenNum) 
    {
        if (childrenNum == 0) {
            return "";
        }
        int i = 0;
        String res = "";
        while(i <= childrenNum) {
            res += " ";
            i++;
        }
        return res;
    }

};




class Solution {

    public static void main(String[] args) {

        Node root = createNode();
        ShowNodeTree.makeNodeArr(root);
        ShowNodeTree.show();
    }


    public static Node createNode() 
    {
        List<Node> cNodeList = new ArrayList<Node>();
        Node root5 = new Node(5);
        Node root4 = new Node(4);
        cNodeList.add(root4);
        cNodeList.add(root5);

        Node root3 = new Node(3, cNodeList);
        Node root2 = new Node(2);

        List<Node> bNodeList = new ArrayList<Node>();
        bNodeList.add(root2);
        bNodeList.add(root3);

        Node root = new Node(1, bNodeList);

        
        

        return root;
    }


    // public static List<List<Integer>> levelOrder(Node root) {
    //     for(Node children : root) {
            
    //     }
    // }
}