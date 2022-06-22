package tree.traverse;

import tree.TreeNode;

/**
 * @author: JoeyShelby
 * @date: 2022-06-12 15:59
 *
 * 前中后序遍历
 */
public class Traverse {

    /**
     * 前序遍历，root-》左子树-》右子树
     * @param root
     */
    public static void preTraverse(TreeNode root) {
        System.out.println(root);
        if(root.getLeftNode() != null) {
            preTraverse(root.getLeftNode());
        }
        if(root.getRightNode() != null) {
            preTraverse(root.getRightNode());
        }
    }


    /**
     * 中序遍历，左子树-》root-》右子树
     * @param root
     */
    public static void midTraverse(TreeNode root) {
        if(root.getLeftNode() != null) {
            midTraverse(root.getLeftNode());
        }
        System.out.println(root);
        if(root.getRightNode() != null) {
            midTraverse(root.getRightNode());
        }
    }


    /**
     * 后序遍历，右子树-》左子树-》root
     * @param root
     */
    public static void postTraverse(TreeNode root) {
        if(root.getLeftNode() != null) {
            postTraverse(root.getLeftNode());
        }
        if(root.getRightNode() != null) {
            postTraverse(root.getRightNode());
        }
        System.out.println(root);
    }
}
