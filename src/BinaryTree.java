import java.util.Scanner;


public class BinaryTree {
	public static void main(String args[]) {
		Tree binTree = new Tree();
		Scanner input = new Scanner(System.in);
		String s = null;
		int i = 0;
		
//		System.out.println("Enter some shit");
//		
//		while (input.hasNext()) {
//			i++;
//		};
		
//		if (i != 2) {
//			System.out.println("Invalid input");
//		}
//		System.out.println(i);
		
		input.close();
		
		Node a = new Node();
		Node b = new Node();
		Node c = new Node();
		Node d = new Node();
		Node e = new Node();
		Node f = new Node();
		Node g = new Node();
		Node h = new Node();
		
		a.setVal(5); // root
		b.setVal(17); // root right
		c.setVal(23); // root right right
		d.setVal(3); // root left
		e.setVal(1); // root left left
		f.setVal(16); // root right left
		g.setVal(20); // root right right left
		h.setVal(4);
		
		binTree.insert(a);
		binTree.insert(b);
		binTree.insert(c);
		binTree.insert(d);
		binTree.insert(e);
		binTree.insert(f);
		binTree.insert(g);
		binTree.insert(h);
		
		
		
		System.out.println("Root: " + binTree.root.getVal());
		System.out.println("Root right: " + a.getRight().getVal());
		System.out.println("Root left: " + a.getLeft().getVal());
		System.out.println("Root left right: " + d.getRight().getVal());
		System.out.println("Root right right: " + b.getRight().getVal());
		System.out.println("Root left left: " + d.getLeft().getVal());
		System.out.println("Root right left: " + b.getLeft().getVal());
		System.out.println("Root right right left: " + c.getLeft().getVal());
		
	}
}
