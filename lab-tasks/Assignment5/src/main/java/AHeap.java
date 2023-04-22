

public  class AHeap <Key extends Comparable <Key> , E extends Comparable>{
	HNode <Key , E> [] a;
	int size;
	int maxsize;
	
	public AHeap(int k) {
		maxsize=k;
		a = new HNode[maxsize];
		size = -1;
	}

	public void upheap(int p) {//p is the indeax
		while (p > 0) {
			int pp = parent(p);
			if (a[p].getKey().compareTo(a[pp].getKey())<0) {
				break;
			}
			HNode <Key , E> t = a[p];
			a[p] = a[pp];
			a[pp] = t;
			p = pp;
		}

	}
	public  HNode removeMax() {
		if (isEmpty()) {
			return null;
		}
		HNode n = a[0];
		a[0] = a[size];
		size--;
		downheap(0);
		return n;
	}

	public void downheap(int p) {//index
		while (hasLeft(p)) {
			int lp = left(p);//index
			int sci = lp;//index

			if (hasRight(p)) {
				int rp = right(p);//indexright
				if (a[rp].getKey().compareTo(a[lp].getKey())>0) {
					sci = rp;
				}
			}
			if (a[p].getKey().compareTo( a[sci].getKey())>=0) {
				break;
			}
			HNode <Key , E> t = a[p];
			a[p] = a[sci];
			a[sci] = t;
			p = sci;
		}
	}




	public boolean hasLeft(int p) {
		if (2 * p +  1 <= size) return true;
		return false;
	}

	public boolean hasRight(int p) {
		if (2 * p +  2 <= size) return true;
		return false;
	}


	public HNode insert(Key k, E v) {
		HNode <Key , E> n = new HNode(k,v);

      if (size+1 <maxsize){
		size++;
		a[size] = n;
		upheap(size);}
		

		return n;
	}

	public HNode max() {
		if (isEmpty()) {
			return null;
		}
		return a[0];
	}

	

	public int size() {
		return size + 1;
	}

	public boolean isEmpty() {
		if (size == -1) return true;
		return false;
	}


	public int left(int p) {
		return 2 * p + 1;
	}

	public int right(int p) {
		return 2 * p + 2;
	}

	public int parent(int p) {
		return (p - 1) / 2;
	}



	public void print() {
		for (int i = 0; i <= size; i++) {
			System.out.println("a[" + i + "]: k = " + a[i].getKey() + ", v = " + a[i].getValue());
		}
	}

	
}
