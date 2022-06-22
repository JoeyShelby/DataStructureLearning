package tree.search;

import tree.TreeNode;

/**
 * @author: JoeyShelby
 * @date: 2022-06-15 17:26
 */
public class SearchTest {
    public static void main(String[] args) {
        /*    构建一棵树
         *      root
         *    a      b
         * c    d  e    f
         */
        TreeNode root = new TreeNode(0, "root");
        TreeNode a = new TreeNode(1, "A");
        TreeNode b = new TreeNode(2, "B");
        TreeNode c = new TreeNode(3, "C");
        TreeNode d = new TreeNode(4, "D");
        TreeNode e = new TreeNode(5, "E");
        TreeNode f = new TreeNode(6, "F");
        root.setLeftNode(a);
        root.setRightNode(b);
        a.setLeftNode(c);
        a.setRightNode(d);
        b.setLeftNode(e);
        b.setRightNode(f);

        System.out.println("=====前序查找=====");
        Search.preSearch(root, 5);
        System.out.println("=====中序查找=====");
        Search.midSearch(root,5);
        System.out.println("=====后序查找=====");
        Search.postSearch(root,5);

    }
}
