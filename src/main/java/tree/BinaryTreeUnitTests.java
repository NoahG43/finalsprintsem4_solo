package tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeUnitTests {

    @Test
    public void treeKeyDefaultTest() throws Exception {
        TreeNode treeBST = new TreeNode();
        Assertions.assertEquals(treeBST.getKey(),0);
    }

    @Test
    public void treeKeyTest() throws Exception {
        TreeNode treeBST = new TreeNode(5);
        Assertions.assertEquals(treeBST.getKey(),5);
    }

    @Test
    public void treeBSTTest() throws Exception {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(3);
        nums.add(7);
        nums.add(4);
        nums.add(1);
        BinaryTreeV2 treeV2 = new BinaryTreeV2();
        TreeNode result = treeV2.treeBST(nums);
        Assertions.assertEquals(result.getKey(), 5);
        Assertions.assertEquals(result.getLeft().getKey(), 3);
        Assertions.assertEquals(result.getRight().getKey(), 7);
        Assertions.assertEquals(result.getLeft().getRight().getKey(), 4);
        Assertions.assertEquals(result.getLeft().getLeft().getKey(), 1);
    }

    @Test
    public void treeBSTNullTest() throws Exception {
        List<Integer> nums = new ArrayList<Integer>();
        BinaryTreeV2 treeV2 = new BinaryTreeV2();
        TreeNode result = treeV2.treeBST(nums);
        Assertions.assertNull(result);
    }

    @Test
    public void treeLeftTest() throws Exception {
        TreeNode treeLeft = new TreeNode();
        Assertions.assertNull(treeLeft.getLeft());
    }

    @Test
    public void treeRightTest() throws Exception {
        TreeNode treeRight = new TreeNode();
        Assertions.assertNull(treeRight.getRight());
    }
}
