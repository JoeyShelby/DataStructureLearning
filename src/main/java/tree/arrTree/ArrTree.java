package tree.arrTree;

import com.sun.source.tree.Tree;
import tree.TreeNode;

/**
 * @author: JoeyShelby
 * @date: 2022-06-21 10:36
 * 以数组的方式存储树，但访问时仍然以树的前中后序方式进行遍历，相当于只是用数组存储了树，故称
 * 顺序存储二叉树
 * 这里使用中序遍历作为例子
 */
public class ArrTree {
    private TreeNode[] treeArray = null;

    public void traverse(TreeNode[] treeArray) {
        if (treeArray == null) {
            System.out.println("顺序存储二叉树为空");
        } else {
            this.treeArray = treeArray;
            midTraverse(0);
        }
    }

    private void midTraverse(int index) {
        if (2 * index + 1 < treeArray.length) {
            midTraverse(2 * index + 1);
        }
        System.out.println(treeArray[index]);
        if (2 * index + 2 < treeArray.length) {
            midTraverse(2 * index + 2);
        }
    }


}
