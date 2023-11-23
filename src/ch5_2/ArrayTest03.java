package ch5_2;

import java.awt.List;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[4];
		arr1[0] = 10;
		for (int i=0;i<4;i++) {
			System.out.println(arr1[i]);
		}
		List list1 = new ArrayList(Arrays.asList(arr1));
		list1.add(99);
		arr1 = list1.toArray(arr1);

	}

}
