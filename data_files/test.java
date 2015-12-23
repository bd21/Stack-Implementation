import data_files;
public class test {
	public static void main(String[] args) {
		int min = 0;
		int max = 0;
		int[] array = new int[7];
		array[0] = 4;
		array[1] = 6;
		array[2] = 3;
		array[3] = 9;
		array[4] = 2;
		array[5] = 1;
		array[6] = 20;
		for(int i = 0; i < array.length; i++) {
			if(min < array[i]) {
				min = array[i];
				
			}
			if(max > array[i]) {
				max = array[i];
				
			}
		}
		System.out.println(max-min);
	
	}
}
