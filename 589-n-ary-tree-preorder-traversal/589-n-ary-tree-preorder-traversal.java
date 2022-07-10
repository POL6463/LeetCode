/*
// Definition for a Node.
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
*/

class Solution {
    public List<Integer> preorder(Node root) {
        if(root == null){
            return new ArrayList<Integer>();
        }
        List<Integer> res = new ArrayList<Integer>();
        recursive(root, res);
        //System.out.println(root.children.size());
        return res;
    }
    
    public List<Integer> recursive(Node root, List<Integer> res){
        //System.out.println(root.val);
        res.add(root.val);
        for(int i = 0; i < root.children.size(); i++){
            recursive(root.children.get(i), res);
            //System.out.println(root.children.size());
            //System.out.println(root.val);
        }
        return res;
    }
    
    
}