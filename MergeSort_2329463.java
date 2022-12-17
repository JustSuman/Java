public class MergeSort_2329463 {
	
	ArrayList getInput(ArrayList<Integer> al) {
		//
			
	}
	
	void getOutput(ArrayList<Integer> al) {
		return System.out.println();
	}
	
	
	
	void merge(ArrayList<Integer> al, int beg, int mid, int end) {
		if (al <= 1){
            return al;
        }
        mid = al.length/2;
        int[] left = new int[mid];
        int[] right;
        if(al % 2 == 0){
            right = new int[mid];
        }else{
            right = new int[mid + 1];
        }
        for (int i = 0 ; i < mid ; i++){
            left[i] = al[i];
        }
        for (int j = 0; j < right.length ; j++){
            right[j] = al[mid+j];
        }
        }
	
	
	void sort(ArrayList<Integer> al, int beg, int end) {
		//
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}