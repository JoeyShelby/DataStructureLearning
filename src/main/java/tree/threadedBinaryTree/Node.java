package tree.threadedBinaryTree;

/**
 * 线索二叉树的树节点
 */
class Node {
        private Integer index;
        private String data;

        // 标识指针类型，0 代表为默认指针类型，即指向左右子树的指针
        private Integer leftType = 0;
        private Integer rightType = 0;

        private Node leftNode;
        private Node rightNode;

        public Node() {
        }

        public Node(Integer index, String data) {
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

        public Node getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(Node leftNode) {
            this.leftNode = leftNode;
        }

        public Node getRightNode() {
            return rightNode;
        }

        public void setRightNode(Node rightNode) {
            this.rightNode = rightNode;
        }

        public Integer getLeftType() {
            return leftType;
        }

        public void setLeftType(Integer leftType) {
            this.leftType = leftType;
        }

        public Integer getRightType() {
            return rightType;
        }

        public void setRightType(Integer rightType) {
            this.rightType = rightType;
        }

    @Override
    public String toString() {
        return "Node{" +
                "index=" + index +
                ", data='" + data + '\'' +
                '}';
    }
}