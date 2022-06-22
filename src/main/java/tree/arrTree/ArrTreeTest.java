package tree.arrTree;

import tree.TreeNode;

/**
 * @author: JoeyShelby
 * @date: 2022-06-21 10:47
 */
public class ArrTreeTest {
    public static void main(String[] args) {
        ArrTree arrTree = new ArrTree();
        TreeNode root = new TreeNode(0, "root");
        TreeNode a = new TreeNode(1, "A");
        TreeNode b = new TreeNode(2, "B");
        TreeNode c = new TreeNode(3, "C");
        TreeNode d = new TreeNode(4, "D");
        TreeNode e = new TreeNode(5, "E");
        TreeNode f = new TreeNode(6, "F");
        TreeNode[] treeNodes = {root, a, b, c, d, e, f};
        arrTree.traverse(treeNodes);
    }
}
