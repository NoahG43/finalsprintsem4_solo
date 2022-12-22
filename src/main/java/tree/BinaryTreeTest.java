package tree;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BinaryTreeTest {

    public static void main(String[] args) {

        int n;

        ArrayList<Integer> BSTArray = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Would you like to continue? y/n");
            if (sc.next().startsWith("y")){
                System.out.println("Enter the array elements");
                int nums = Integer.parseInt(sc.next());
                BSTArray.add(nums);
            } else {
                break;
            }
        } while (true);
        System.out.println(BSTArray);

        BinaryTreeV2 v2 = new BinaryTreeV2();

        TreeNode root = v2.treeBST(BSTArray);
        System.out.println(root);
        ObjectMapper mapper = new ObjectMapper();
        try {
            String str = mapper.writeValueAsString(root);
            System.out.println(str);
            File file = new File("BST.json");
            try {
                mapper.writeValue(file, str);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}


