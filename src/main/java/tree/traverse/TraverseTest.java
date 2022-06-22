package tree.traverse;

import tree.TreeNode;

/**
 * @author: JoeyShelby
 * @date: 2022-06-12 16:06
 */
public class TraverseTest {
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


        System.out.println("-----前序遍历-----");
        Traverse.preTraverse(root);

        System.out.println("-----中序遍历-----");
        Traverse.midTraverse(root);

        System.out.println("-----后序遍历-----");
        Traverse.postTraverse(root);

    }
}
