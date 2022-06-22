package tree.threadedBinaryTree;

/**
 * @author: JoeyShelby
 * @date: 2022-06-21 15:50
 * 线索化二叉树，是使树节点中未被利用上的左右节点指针，指向该节点的前驱或后继节点。
 */
public class ThreadedBinaryTree {

    /**
     * 以中序遍历的顺序进行线索化
     */
    public static Node pre = null;
    public static void treeThread(Node cur) {
        // 左递归
        if(cur.getLeftType() == 0 && cur.getLeftNode() != null) {
            treeThread(cur.getLeftNode());
        }

        // 处理前驱
        if(cur.getLeftNode() == null) {
            cur.setLeftNode(pre);
            cur.setLeftType(1);
        }
        //处理后继，是在处理完前驱之后的下一次递归
        if(pre != null && pre.getRightNode() == null) {
            pre.setRightNode(cur);
            pre.setRightType(1);
        }
        pre = cur;

        //右递归
        if(cur.getRightType() == 0 && cur.getRightNode() != null) {
            treeThread(cur.getRightNode());
        }
    }

    // 打印整棵树，以线性二叉树的方式进行遍历，不过要注意是以中序的方式进行线性化的，那么也需要以根据此序进行遍历
    public static void listTree(Node node) {
        while (node != null) {
            // 定位到线索开始/继续的地方，也就是 leftType == 1 的地方
            while (node.getLeftType() != 1) {
                node = node.getLeftNode();
            }
            // 输出当前节点
            System.out.println(node);
            // 按照线索进行遍历
            while (node.getRightType() == 1) {
                node = node.getRightNode();
                System.out.println(node);
            }
            // 当线索断了，往下走，
            node = node.getRightNode();
        }
    }
}


