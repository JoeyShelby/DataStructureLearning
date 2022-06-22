package tree.search;

import tree.TreeNode;


/**
 * @author: JoeyShelby
 * @date: 2022-06-15 17:17
 */
public class Search {

    private static int countPre = 0;
    private static int countMid = 0;
    private static int countPost = 0;

    /**
     * 前序查找，root-》左子树-》右子树
     * @param root
     */
    public static void preSearch(TreeNode root, int index) {
        System.out.println(root);
        countPre++;
        if(root.getIndex() == index){
            System.out.println(countPre);
        }
        if(root.getLeftNode() != null) {
            preSearch(root.getLeftNode(), index);
        }
        if(root.getRightNode() != null) {
            preSearch(root.getRightNode(), index);
        }
    }


    /**
     * 中序查找，左子树-》root-》右子树
     */
    public static void midSearch(TreeNode root, int index) {

        if(root.getLeftNode() != null) {
            midSearch(root.getLeftNode(), index);
        }
        System.out.println(root);
        countMid++;
        if(root.getIndex() == index){
            System.out.println(countMid);
        }
        if(root.getRightNode() != null) {
            midSearch(root.getRightNode(), index);
        }
    }


    /**
     * 后序查找，右子树-》左子树-》root
     */
    public static void postSearch(TreeNode root, int index) {
        if(root.getLeftNode() != null) {
            postSearch(root.getLeftNode(), index);
        }
        if(root.getRightNode() != null) {
            postSearch(root.getRightNode(), index);
        }
        System.out.println(root);
        countPost++;
        if(root.getIndex() == index){
            System.out.println(countPost);
        }
    }

}
