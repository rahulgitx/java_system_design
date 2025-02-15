import java.util.Stack;

public class StringManipulation {
    public static void main(String[] args) {
        StringBuilder temp = new StringBuilder("wfsdfs");
        System.out.println(temp.charAt(2));
        temp.length();
        Solution1 sol = new Solution1();
        String s = "1-2--3--4-5--6--7";
        sol.recoverFromPreorder(s);
    }
}


  class TreeNode {
     int val;
     TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }


class Solution1 {
    int toInteger(StringBuilder s){
        int res = 0, m = 1;
        int i=s.length()-1;
        while(i>=0){
            res += (s.charAt(i)-'0')*m;
            m = m*10;
        }
        return res;
    }
    public TreeNode recoverFromPreorder(String traversal) {
        Stack<TreeNode> stack = new Stack<>();
        int n = traversal.length();
        int i=0;
        TreeNode root = null;

        while(i<n){
            StringBuilder temp = new StringBuilder();
            int depth = 0;
            System.out.println(i);
            while(i<n && traversal.charAt(i) == '-'){
                i++; depth++;
            }

            while(i<n && traversal.charAt(i) != '-'){
                temp.append(traversal.charAt(i));
                i++;
            }
            System.out.println("i: "+i+" temp: "+temp);

            int val = toInteger(temp);
            while(!stack.isEmpty() && depth > stack.size()) {
                System.out.println("size: " + stack.size());
                stack.pop();
            }
            TreeNode node = new TreeNode(val);
            if(stack.isEmpty()) root = node;
            else{
                if(stack.peek().left == null) stack.peek().left = node;
                else stack.peek().right = node;
            }
            stack.add(node);
        }
        return root;
    }
}