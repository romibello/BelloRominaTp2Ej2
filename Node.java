public class Node {
	private int info;
	private Node next;
	
	public Node(){
		info=0;
		next=null;
	}
	public Node(int in, Node nex){
		setInfo(in);
		setNext(nex);
	}
	public void setInfo(int o){
		info = o;
	}
	public void setNext(Node n){
		next=n;
	}
	public int getInfo(){
		return info;
	}
	public Node getNext(){
		return next;
	}
	
	public int Compare(Node n) {
		if ( info < n.getInfo()) {
			return 0;
		}else if ( info > n.getInfo()) {
			return 1;
		}else {
			return -1;
		}
	}
}
