package ch5_2;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {90,85,75,80};
		
//		System.out.println(scores[2]);
		System.out.println(scores.length);
		
		for (int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		
		int[] arr1 = new int[10];//모든 칸이 0으로 초기화된 배열이 생성
//		for (int i=0;i<arr1.length;i++) {
//			System.out.println(arr1[i]);
//		}
		for (int i=0;i<10;i++) {
			System.out.println(arr1[i]);
		}	
		String[] arr2 = new String[5];//모든 칸이 null로 초기화된 문자열형 배열이 생성
		for (int i=0;i<5;i++) {
			System.out.println(arr2[i]);
		}
		double[] arr3 = new double[4];// 0.0으로 초기화
		for (int i=0;i<4;i++) {
			System.out.println(arr3[i]);
		}	
		
		boolean[] arr4 = new boolean[4];//false 초기화
		for (int i=0;i<4;i++) {
			System.out.println(arr4[i]);
		}

	}

}
