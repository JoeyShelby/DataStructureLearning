package tree.threadedBinaryTree;

import tree.TreeNode;
import tree.traverse.Traverse;

/**
 * @author: JoeyShelby
 * @date: 2022-06-21 16:15
 */
public class ThreadedBinaryTreeTest {
    public static void main(String[] args) {
        /*    构建一棵树
         *      root
         *    a      b
         * c    d  e
         */

        Node root = new Node(0, "root");
        Node a = new Node(1, "a");
        Node b = new Node(2, "b");
        Node c = new Node(3, "c");
        Node d = new Node(4, "d");
        Node e = new Node(5, "e");
        root.setLeftNode(a);
        root.setRightNode(b);
        a.setLeftNode(c);
        a.setRightNode(d);
        b.setLeftNode(e);


        // 对这棵树线索化
        ThreadedBinaryTree.treeThread(root);

        ThreadedBinaryTree.listTree(root);

/*        // 看看树的每一个节点的情况
        System.out.println(root + " left:" + root.getLeftNode() + " right:" + root.getRightNode());
        System.out.println(a + " left:"  + a.getLeftNode() + " right:"  + a.getRightNode());
        System.out.println(b + " left:"  + b.getLeftNode() + " right:"  + b.getRightNode());
        System.out.println(c + " left:"  + c.getLeftNode() + " right:"  + c.getRightNode());
        System.out.println(d + " left:"  + d.getLeftNode() + " right:"  + d.getRightNode());
        System.out.println(e + " left:"  + e.getLeftNode() + " right:"  + e.getRightNode());*/
    }
}
