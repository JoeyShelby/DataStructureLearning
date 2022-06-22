package tree.remove;

/**
 * @author: JoeyShelby
 * @date: 2022-06-19 16:25
 */

import tree.TreeNode;

/**
 * 做一个简单的删除功能：
 * 若要删除的节点为叶子节点，则删除该叶子节点
 * 若要删除的节点不为叶子节点，则删除整棵子树
 */
public class Remove {

    public static TreeNode delete(TreeNode root, int target) {
        if (root == null) {
           // 当 root 为空时，返回错误提示
            System.out.println("传入树为空");
            return null;
        } else if (root.getIndex() == target) {
            // 若根节点待删除
            System.out.println("成功删除目标节点");
            return null;
        } else {
            deleteRecursive(root, target);
            return root;
        }
    }

    private static void deleteRecursive(TreeNode root, int target) {
        if (root.getLeftNode() != null) {
            if (root.getLeftNode().getIndex() == target) {
                root.setLeftNode(null);
                System.out.println("成功删除目标节点");
                return;
            }
            deleteRecursive(root.getLeftNode(), target);
        }

        if (root.getRightNode() != null) {
            if (root.getRightNode().getIndex() == target) {
                root.setRightNode(null);
                System.out.println("成功删除目标节点");
                return;
            }
            deleteRecursive(root.getRightNode(), target);
        }
    }
}
