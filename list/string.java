package data_structure.list;


public class string {
	public static void main(String[] args) {
		String []data = {"apple","grape","persimmon", "pear","blueberry", "strawberry", "melon", "oriental melon"};

		showData(data);
		sortData(data);
		showData(data);
	}
	static void showData(String[]arr) {
		for(int i = 0; i <arr.length; i++)
			System.out.println(arr[i]);

	}

	static void swap(String[]arr, int ind1, int ind2) {

		String t = arr[ind1]; arr[ind1] = arr[ind2]; arr[ind2] = t;

	}
	static void sortData(String []arr) {
		for (int i = 0 ; i < arr.length ; i ++)
			for (int j = i+1 ; j < arr.length; j++) {
				if(arr[i].compareTo(arr[j])> 0) 
					swap(arr, i, j);

			}
	}
}
