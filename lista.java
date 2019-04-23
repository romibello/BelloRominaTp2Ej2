
public class lista {
protected Node first;
protected int size;

	public lista(){
		first =null;
		size=0;
	}
	
	public int getsize(){
		return size;
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public Node getFirst() {
		return first;
	}
	
	public void insertFront(int o) {
		Node tmp = new Node(o, null);
		tmp.setNext(first);
		first = tmp;
	}
	
	public void imp(int x){
		if(x<=5) {
			imp(x+1);
			System.out.print(x);
		}
	}
	
	public void insertOrd(Node tmp){
		if(first==null){
			first=tmp;
			tmp.setNext(null);
			size++;
		}else {
			if(first.Compare(tmp) == 0) {
				this.insertOrd(tmp);
			}
			if(first.Compare(tmp) == 1) {
				tmp.setNext(first);
			}
			first.setNext(tmp);
		}
	}
	
	
	public void print(){
		Node tmp = first;
		while (tmp != null){
			System.out.print(tmp.getInfo()+"--");
			tmp=tmp.getNext();
			
		}
	}
	
	public boolean buscar(Object ref){
		Node aux = first;
		boolean encontrado = false;
			while(aux!=null && encontrado != true){
				if(ref.equals(aux.getInfo())){
					encontrado=true;
				}else{
					aux=aux.getNext();
				}
			}
		return encontrado;
		
	}
	
	public  lista getComunes( lista acompara){
		lista result = new lista();
		Node cursor1 = first;
		while(cursor1 != null){
			if(!acompara.buscar(cursor1.getInfo())){
				if(!result.buscar(cursor1.getInfo())){
					result.insertFront(cursor1.getInfo());
				}
			}
			cursor1= cursor1.getNext();
		}		
		return result;
	}
	
	
	
}