/**
 * Created by joshajay on 2/1/2016.
 */
public class BST {

    static BSTNode root;

    public static void addNode(int key, String name) {

        BSTNode newNode = new BSTNode(key, name);

        if(root == null) {

            root = newNode;

        } else {

            BSTNode focusNode = root;

            BSTNode parent;

            while(true) {

                parent = focusNode;

                //less than move to the left child
                if( key < focusNode.key) {

                    focusNode = focusNode.leftChild;

                    //if left-child is null or not
                    if(focusNode == null) {

                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;

                    //if right-child  is null or not
                    if(focusNode == null) {

                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }

    }
}


    class BSTNode {

        int key;
        String name;

        BSTNode leftChild;
        BSTNode rightChild;

        BSTNode(int key, String name) {

            this.key=key;
            this.name=name;

        }
    }

