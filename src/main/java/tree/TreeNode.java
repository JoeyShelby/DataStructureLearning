package tree;

/**
 * @author: JoeyShelby
 * @date: 2022-06-12 15:52
 *
 * 树的节点
 */
public class TreeNode {
    private Integer index;
    private String data;

    private TreeNode leftNode;

    private TreeNode rightNode;

    public TreeNode() {
    }

    public TreeNode(Integer index, String data) {
        this.index = index;
        this.data = data;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "index=" + index +
                ", data='" + data + '\'' +
                '}';
    }
}
