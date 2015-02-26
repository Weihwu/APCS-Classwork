public class MergeSort{
    
    public int[] merge(int[] a , int[] b){
	int[] c = new int[a.length + b.length];
	
	int placea = 0;
	int placeb = 0;

	for (int x = 0; x < c.length; x++){
	    if (placea == a.length){
		c[x] = b[placeb++];
	    }else if (placeb == b.length){
		c[x] = a[placea++];
	    }else{
		if (a[placea] < b[placeb]){
		    c[x] = a[placea++];
		}else{
		    c[x] = b[placeb++];
		}
	    }
	}
	return c;
    }
}
