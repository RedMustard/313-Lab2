
public class Tree {
	Node left = null;
	Node right = null;
	Node root = null;
	Node currentNode = null;
//	Node nextLeft = null;
//	Node nextRight = null;
	
	// WORKS
	public void insert(Node n) {
//		Node currentNode = null;
		// Set root, if it doesn't exist. Else, 
		if (root == null) {
			root = n;
			currentNode = root;
			
		} else if (n.getVal() > currentNode.getVal()) {
			if (currentNode.getRight() == null) {
				currentNode.setRight(n);
				currentNode = root;
			} else {
				currentNode = currentNode.getRight();
				insert(n);
			}
		} else if (n.getVal() < currentNode.getVal()) {
			if (currentNode.getLeft() == null) {
				currentNode.setLeft(n);
				currentNode = root;
			} else {
				currentNode = currentNode.getLeft();
				insert(n);
			}
		}
	}
	
	public boolean search(Node n) {
		if (n == root) {
			return true;
		} else if (n.getVal() > root.getVal()) {
			
		}
		return false;
	}
	
//	public void printTree() {
//		for (int i = 0; )
//	}
//	
	public void delete(Node n) {
		
	}

//	delete
//	search
//	insert
	
	
	
}
