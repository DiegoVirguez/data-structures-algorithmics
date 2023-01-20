package com.diego.dataStructures.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;


public class TreeTest {

  //  Node node = mock(Node.class);

    @Test
    public void preOrderTest(){

        //Given (las variables)
        // El nodo y los arboles
        BinarySearchTree tree = new BinarySearchTree(8);
        tree.insert(3);
        tree.insert(10);
        tree.insert(1);
        tree.insert(6);
        tree.insert(4);
        tree.insert(7);
        tree.insert(14);
        tree.insert(13);

        // when (call the funtion)
        System.out.println(
                "Preorder traversal of binary tree is ");
        tree.preOrder(tree.root);
        // Then (los asserts)
     //   assertNotNull(node);
        assertEquals(tree.root.data, 8);
        assertEquals(tree.root.left.data, 3); // No use mocks porque no estoy llamando metodos de la dependencia



    }



}
