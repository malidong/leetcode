package sortJP.winter.sort;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Heap {

	class Node {
		int data;
		Node left;
		Node right;

		public Node() {
		}

		public Node(int m) {
			this.data = m;
			this.left = null;
			this.right = null;
		}
	}

	Node root;
	int[] arr;

	public Heap() {
		this.root = null;
		this.arr = null;
	}

	public void loadArray(int[] a) {
		this.root = null;
		this.arr = null;

		if (a.length == 0)
			return;

		this.arr = a.clone();
		this.root = new Node(a[0]);

		for (int i = 1; i < a.length; i++) {

			Queue<Node> tmpQ = new LinkedList<Node>();
			Node current = this.root;
			tmpQ.offer(this.root);

			while (current != null) {

				current = tmpQ.poll();

				if (current.left != null) {
					tmpQ.offer(current.left);
				} else {
					current.left = new Node(a[i]);
					break;
				}

				if (current.right != null) {
					tmpQ.offer(current.right);
				} else {
					current.right = new Node(a[i]);
					break;
				}
			}

		}
	}

	public void addNode(int a) {
		Queue<Node> tmpQ = new LinkedList<Node>();
		Node current = this.root;
		tmpQ.offer(this.root);

		while (current != null) {

			current = tmpQ.poll();

			if (current.left != null) {
				tmpQ.offer(current.left);
			} else {
				current.left = new Node(a);
				break;
			}

			if (current.right != null) {
				tmpQ.offer(current.right);
			} else {
				current.right = new Node(a);
				break;
			}
		}
		return;
	}

	public void depthFirstTravel() {

		System.out.print("Depth: ");

		Stack<Node> tmpStack = new Stack<Node>();
		Node current;
		tmpStack.add(this.root);

		while (!tmpStack.empty()) {

			current = (Node) tmpStack.pop();

			System.out.print(current.data + ", ");

			if (current.right != null) {
				tmpStack.push(current.right);
			}
			if (current.left != null) {
				tmpStack.push(current.left);
			}
		}

		System.out.println("");
	}

	public void breadthFirstTravel() {

		System.out.print("Breadth: ");

		Queue<Node> tmpQ = new LinkedList<Node>();
		Node current;
		tmpQ.offer(this.root);

		while (!tmpQ.isEmpty()) {

			current = tmpQ.poll();

			System.out.print(current.data + ", ");

			if (current.left != null) {
				tmpQ.offer(current.left);
			}
			if (current.right != null) {
				tmpQ.offer(current.right);
			}
		}

		System.out.println("");
	}
}