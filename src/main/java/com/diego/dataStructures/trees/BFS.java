package com.diego.dataStructures.trees;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int info;
    Node left;
    Node right;

    Node(int info) {
        this.info = info;
        left = right = null;
    }

    void insLeft(Node p, int n) {

        Node newNode = new Node(n);
        p.left = newNode;

    }

    void insRight(Node p, int n) {

        Node newNode = new Node(n);
        p.right = newNode;

    }
}

/*
* 1  método BFS(Grafo,origen):
2      creamos una cola Q
3      agregamos origen a la cola Q
4      marcamos origen como visitado -
5      mientras Q no este vacío:
6          sacamos un elemento de la cola Q llamado v
7          para cada vertice w adyacente a v en el Grafo:
8              si w no ah sido visitado:
9                 marcamos como visitado w
10                 insertamos w dentro de la cola Q
* */

public class BFS {

    public static void main(String[] args) {

        Node root = new Node(10);
        root.insLeft(root, 5);
        root.insRight(root, 15);
        Node q = root.left;
        q.insLeft(q, 1);
        q.insRight(q, 2);
        Node r = root.right;
        r.insLeft(r, 3);
        r.insRight(r, 4);

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        System.out.println("origen q visited " + root.info);
        while (!queue.isEmpty()) {
            Node v = queue.remove();  // poll or remove

            if (v.left != null) {
                System.out.println("Node " + v.left.info + " visited");
                queue.add(v.left);
            }

            if (v.right != null) {
                System.out.println("Node " + v.right.info + " visited");
                queue.add(v.right);
            }

        }
    }


}



