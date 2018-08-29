import java.util.*;

class Node
{
    int data; 
    Node left, right; 

    public Node(int data) 
    {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree 
{
    Node root;

    /// <summary>
    /// Get the list of nodes with indices from smallest to greatest.
    /// </summary>
    void extractAllNodes(Node root, Vector<Node> nodes)
    {
        // Base case
        if (root == null) 
        {
            return ;
        }

        // get nodes in order from smallest index to the biggest index
        extractAllNodes(root.left, nodes);
        nodes.add(root);
        extractAllNodes(root.right, nodes);
    }

    /// <summary>
    /// Return a node with left child and right child recursively
    /// </summary>
    Node buildSubTree(Vector<Node> nodes, int startingIndex, int endingIndex) 
    {
        if (startingIndex > endingIndex) 
        {
            // under the leaves are null
            return null;
        }

        int middleIndex = (startingIndex + endingIndex) / 2;
        Node node = nodes.get(middleIndex);
        node.left = buildSubTree(nodes, startingIndex, middleIndex - 1);
        node.right = buildSubTree(nodes, middleIndex + 1, endingIndex);

        return node;
    }

    /// <summary>
    /// Return the root node with all its children in form of a binary search tree
    /// </summary>
    Node buildTree(Node root) 
    {
        Vector<Node> nodes = new Vector<Node>();
        extractAllNodes(root, nodes);
        root = buildSubTree(nodes, 0, nodes.size() - 1);
        return root;
    }

    /// <summary>
    /// Print out the components of the tree
    /// </summary>
    void printTree(Node treeNode) 
    {
        if (treeNode == null) 
        {
            return;
        }

        System.out.print(treeNode.data + " ");
        printTree(treeNode.left);
        printTree(treeNode.right);
    }

    public static void main(String[] args) 
    {
        // Constructed skewed bst:
        //                 5
        //                 /
        //             4
        //             /
        //         3
        //         /
        //     2
        //     /
        // 1
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(5);
        tree.root.left = new Node(4);
        tree.root.left.left = new Node(3);
        tree.root.left.left.left = new Node(2);
        tree.root.left.left.left.left = new Node(1);
        Node newRoot = tree.buildTree(tree.root);
        tree.printTree(newRoot);
        //            3
        //           / \
        //          2   4
        //         /     \
        //        1       5
    }
}