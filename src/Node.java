
public class Node {
	int val;
	Node left;
	Node right;
//	Node parent;
	
	public int getVal() {
		return this.val;
	}
	
	public Node getLeft() {
		return this.left;
	}
	
	public Node getRight() {
		return this.right;
	}
//	
//	public Node getParent() {
//		return this.parent;
//	}
	
	public void setVal(int i) {
		this.val = i;
	}
	
	public void setLeft(Node n) {
		this.left = n;
	}
	
	public void setRight(Node n) {
		this.right = n;
	}	
	
//	public void setParent(Node n) {
//		this.parent = n;
//	}
}
