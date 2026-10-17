/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Theory;

/**
 *
 * @author MyComputer
 */
public class Example02 {

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(9);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.left = new Node(8);
        root.right.right = new Node(11);
        root.right.right.right = new Node(15);
        //         5
        //     3      9
        //   1   4   8  11
        //Order(root);
        //System.out.println("sumOrder " + sumOrder(root));
        System.out.println(getHeight(root));
    }

    static void Order(Node n) {
        if (n == null) {
            return;
        }
        Order(n.left);
        Order(n.right);
        System.out.print(n.key + " ");
    }

    static int sumOrder(Node n) {
        if (n == null) {
            return 0;
        }
        int left = sumOrder(n.left);
        int right = sumOrder(n.right);
        return n.key + left + right;
    }
    static int sumLeafs(Node n) {
        if (n.right == null && n.left==null) {
            return n.key;
        }
        int left = sumLeafs(n.left);
        int right = sumLeafs(n.right);
        return left + right;
    }
    static int getHeight(Node n) {
        if (n == null) return -1;
        return Math.max(getHeight(n.left),getHeight(n.right))+1;
    }
}
