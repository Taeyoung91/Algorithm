import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        Queue<Integer> depthQueue = new LinkedList<>();

        queue.offer(root);
        depthQueue.offer(1);

        int depth = 0;

        while (!queue.isEmpty()) {
            TreeNode curNode = queue.poll();
            depth = depthQueue.poll();

            if (curNode.left != null) {
                queue.offer(curNode.left);
                depthQueue.offer(depth + 1);
            }
            if (curNode.right != null) {
                queue.offer(curNode.right);
                depthQueue.offer(depth + 1);
            }
        }

        return depth;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

