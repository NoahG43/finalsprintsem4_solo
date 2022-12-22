package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeV2 {
        public TreeNode treeBST(List<Integer> nums) {
            if (nums.size() == 0) return null;
            TreeNode root = new TreeNode(nums.get(0));
            for(int i = 1; i < nums.size(); i++){
                this.insertIntoTree(root, nums.get(i));
            }

            return root;
        }

        private void insertIntoTree(TreeNode root, Integer num){
            if(num > root.getKey()){
                if (root.getRight() == null){
                    root.setRight(new TreeNode(num));
                } else {
                    insertIntoTree(root.getRight(), num);
                }
            } else {
                if (root.getLeft() == null){
                    root.setLeft(new TreeNode(num));
                } else {
                    insertIntoTree(root.getLeft(), num);
                }
            }
        }
    }
