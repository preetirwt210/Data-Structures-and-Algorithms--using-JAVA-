package Data_Structures.trees;

import java.util.ArrayList;

public class BinarySearchTree {
    BinarySearchNode root = null;
    //////////          insert function       /////////////
    public void insert(int value) {
        BinarySearchNode newBinarySearchNode = new BinarySearchNode(value);
        if (this.root == null) {
            this.root = newBinarySearchNode;
        } else {
            BinarySearchNode current = this.root;
            while (true) {
                // right
                if (current.value < value) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = newBinarySearchNode;
                        break;
                    }
                    // left
                } else {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = newBinarySearchNode;
                        break;
                    }
                }
            }
        }
    }

    //////////          lookup function       /////////////
    public boolean lookup(int value) {
        BinarySearchNode current = this.root;
        while (current != null) {
            if (current.value > value) {
                current = current.left;
            } else if (current.value < value) {
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }

    //////////          remove function       /////////////
    public void remove(int value) {
        if (this.root == null) {
            return;
        }
        BinarySearchNode current = this.root;
        BinarySearchNode parentBinarySearchNode = null;
        // while current is not null
        while (current != null) {
            if (value < current.value) {
                // go left
                parentBinarySearchNode = current;
                current = current.left;
            } else if (value > current.value) {
                // go right
                parentBinarySearchNode = current;
                current = current.right;
            }
            // (value == current.value, means if we found the value to be removed)
            else {
                // Option 1: NO RIGHT CHILD            // Child means the child of current Node
                if (current.right == null) {
                    // if parentNode is null means delete the root node
                    if (parentBinarySearchNode == null) {
                        this.root = current.left;
                    } else {
                        // if current < parent, make current left child a left child of parent
                        if (current.value < parentBinarySearchNode.value) {
                            parentBinarySearchNode.left = current.left;

                        }
                        // if current > parent, make current's left child a right child of parent
                        else if (current.value > parentBinarySearchNode.value) {
                            parentBinarySearchNode.right = current.left;
                        }
                    }
                }

                // Option 2: RIGHT CHILD WHICH DOESN'T HAVE A LEFT CHILD
                else if (current.right.left == null) {
                    if (parentBinarySearchNode == null) {
                        this.root = current.right;
                    } else {
                        // if current < parent, make current's right child a left child of parent
                        if (current.value < parentBinarySearchNode.value) {
                            parentBinarySearchNode.left = current.right;
                        }
                        // if current > parent, make current's right child a right child of parent
                        else if (current.value > parentBinarySearchNode.value) {
                            parentBinarySearchNode.right = current.right;
                        }
                    }
                }

                // Option 3: RIGHT CHILD WHICH HAVE LEFT CHILD
                else {
                    if (parentBinarySearchNode == null) {
                        // save reference of left and right nodes of the root
                        BinarySearchNode leftBinarySearchNode = this.root.left;
                        BinarySearchNode rightBinarySearchNode = this.root.right;
                        // root.right.left node becomes new root
                        this.root = current.right.left;
                        rightBinarySearchNode.left = rightBinarySearchNode.left.right;
                        // set back the saved reference of left and right nodes of root.
                        this.root.left = leftBinarySearchNode;
                        this.root.right = rightBinarySearchNode;
                    } else {
                        if (current.value < parentBinarySearchNode.value) {
                            parentBinarySearchNode.left = current.right.left;
                        } else if (current.value > parentBinarySearchNode.value) {
                            parentBinarySearchNode.right = current.right.left;
                        }
                    }
                }
                return;
            }
        }
    }
        //Normal PrintTree method for printing BST

//    int count = 0;
//    public void printTree() {
//        count = 0;
//        printTree(root);
//    }
//    private void printTree(BinarySearchNode binarySearchNode) {
//        System.out.print(binarySearchNode.getValue());
//        System.out.println();
//        count++;
//        if(binarySearchNode.getLeft() != null) {
//            System.out.print("\t".repeat(Math.max(0, count)) + "Left: ");
//            printTree(binarySearchNode.getLeft());
//        }
//        if(binarySearchNode.getRight() != null) {
//            System.out.print("\t".repeat(Math.max(0, count)) +"Right: ");
//            printTree(binarySearchNode.getRight());
//        }
//        count--;
//    }


    ///////////////////////////////////////////////////////
    //                breadth first search               //
    //   note: {this method is from algorithms section-  //
    ///////////////////////////////////////////////////////
    public ArrayList<Integer> breadthFirstSearch() {
        BinarySearchNode currentNode = this.root;
        ArrayList<Integer> resultArray = new ArrayList<>();
        ArrayList<BinarySearchNode> queue = new ArrayList<>();
        queue.add(currentNode);

        while (queue.size() > 0) {
            currentNode = queue.remove(0);
            resultArray.add(currentNode.value);

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return resultArray;
    }

    ///////////////////////////////////////////////////////
    //         breadth first search recursive            //
    //   note: {this method is from algorithms section-  //
    ///////////////////////////////////////////////////////
    public ArrayList<Integer> breadthFirstSearchRecursive(
            ArrayList<BinarySearchNode> queue,
            ArrayList<Integer> resultArray
    ) {
        if (queue.size() == 0) {
            return resultArray;
        }

        BinarySearchNode currentNode = queue.remove(0);
        resultArray.add(currentNode.value);
        if (currentNode.left != null) {
            queue.add(currentNode.left);
        }
        if (currentNode.right != null) {
            queue.add(currentNode.right);
        }

        return breadthFirstSearchRecursive(queue, resultArray);
    }
    ///////////////////////////////////////////////////////
    //////////              DFS               /////////////
    ///////////////////////////////////////////////////////
    HelperFunctions hlp = new HelperFunctions();

    public ArrayList<Integer> DFSInOrder() {
        ArrayList<Integer> answer = new ArrayList<>();
        return hlp.traverseInOrder(this.root, answer);
    }

    public ArrayList<Integer> DFSPreOrder() {
        ArrayList<Integer> answer = new ArrayList<>();
        return hlp.traversePreOrder(this.root, answer);
    }

    public ArrayList<Integer> DFSPostOrder() {
        ArrayList<Integer> answer = new ArrayList<>();
        return hlp.traversePostOrder(this.root, answer);
    }
    // main method
    public static void main(String[] args) {
//                 9
//            4        20
//         1    6   15    170

        //inorder: {1,4,6,9,15,20,170}
        //preorder: {9,4,1,6,20,15,170}
        //postOrder: {1,6,4,15,170,20,9}

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(9);
        bst.insert(4);
        bst.insert(6);
        bst.insert(20);
        bst.insert(170);
        bst.insert(15);
        bst.insert(1);

//        bst.printTree();
//        System.out.println("bfs: " +));
        System.out.println("look for 20: " + bst.lookup(20));

        ArrayList<BinarySearchNode> queue = new ArrayList<>();
        queue.add(bst.root);
        System.out.println("bfs recursive: " + bst.breadthFirstSearchRecursive(queue, new ArrayList<>()));

        System.out.println("dfs inOrder: " + bst.DFSInOrder());
        System.out.println("dfs preOrder: " + bst.DFSPreOrder());
        System.out.println("dfs postOrder: " + bst.DFSPostOrder());

        bst.remove(20);
        System.out.println("look for 20 after removing 20: " + bst.lookup(20));


    }
}
