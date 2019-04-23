public class Main {

	public static void main(String[] args) {
		
		lista l1 = new lista();
		lista l2 =new lista();
		
		Node v1 = new Node (1,null);
		Node v3 = new Node (3,null);
		Node v4 = new Node (4,null);
		Node v5 = new Node (5,null);
		Node v7 = new Node (7,null);
		Node v9 = new Node (9,null);
		l1.insertOrd(v1);
		l1.insertOrd(v3);
		//l1.insertOrd(v4);
		//l1.insertOrd(v5);
		//l1.insertOrd(v7);
		System.out.println("lista 1");
		l1.print();
		
		//l2.insertOrd(v4);
		//l2.insertOrd(v5);
		//l2.insertOrd(v7);
		//l2.insertOrd(v9);
		System.out.println(" ");
		System.out.println("lista 2");
		l2.print();
		
		lista result = l1.getComunes(l2);
		System.out.println(" ");
		System.out.println("lista ordenada");
		result.print();
		
		lista l3=new lista();
		
		lista l4 =new lista();
		
		CargarLista(l3,10);
		CargarLista(l4,20);
		System.out.println(" ");
		System.out.println("lista 3");
		l3.print();
		System.out.println(" ");
		System.out.println("lista 4");
		l4.print();
		System.out.println();
		lista result2= l3.getComunes(l4);
		System.out.println("lista desordenada");
		result2.print();
		System.out.println("imp");
		l4.imp(2);
		
	}
	public static void CargarLista(lista list, int cantElem){
		int cont=0;
		while(cont<cantElem){
			int valor = (int) (Math.random() * 20) + 1;
			list.insertFront(valor);
			cont++;
		}
	}
	


	}
