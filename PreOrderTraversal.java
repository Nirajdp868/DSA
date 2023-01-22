package com.exam.app;

import java.util.Arrays;
import java.util.Scanner;



public class PreOrderTraversal {
	public static class Node {
		private int data;
		Node left;
		Node right;

		public Node() {
			data = 0;
			left = null;
			right = null;
		}

		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}// node class

	private Node root;

	public PreOrderTraversal() { // constructor
		root = null;
	}

	public void preorder(Node trav) {// base logic for preorder
		if (trav == null)
			return;
		System.out.print(trav.data + " ");
		preorder(trav.left);
		preorder(trav.right);

	}

	public void add(int val) {
		Node newNode = new Node(val);
		if (root == null)
			root = newNode;
		else {
			Node trav = root;
	while (true) {
		if (val < trav.data)
		{
		if (trav.left != null) 
		{
			trav = trav.left;
											
					} 
		else {
			trav.left = newNode;
				break;
			}
			} else {
					if (val >= trav.data) {
						if (trav.right != null) {
							trav = trav.right;
						} else {
							trav.right = newNode;
							break;
						}
					}
				}
			}

		}
	}

	public static void main(String[] args) {
		PreOrderTraversal bst = new PreOrderTraversal();
		Scanner sc = new Scanner(System.in);
		bst.add(50);
		bst.add(30);
		bst.add(10);
		bst.add(90);
		bst.add(100);
		bst.add(40);
		bst.add(70);
		bst.add(80);
		bst.add(60);
		bst.add(20);
		int arr[] = { 50, 30, 10, 90, 100, 40, 70, 80, 60, 20 };// same array
		System.out.println("Original Array");
		System.out.println(Arrays.toString(arr));

		System.out.println();
		System.out.println("Preorder");
		bst.preorder(bst.root);
		System.out.println();
	}

}
