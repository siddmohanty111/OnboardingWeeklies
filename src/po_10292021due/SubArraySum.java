package po_10292021due;

public class SubArraySum {

	public static void main(String[] args) {
		
		System.out.println("Testing with array arr[]={14, 12, 70, 15, 99, 65, 21, 90}; and sum = 97");
		
		Integer[] arr = {14, 12, 70, 15, 99, 65, 21, 90};
		
		subarray(arr, 97);
		
		System.out.println("Testing with array arr[] = {1, 2, 3, 3, 4, 5, 9, 28, 7, 5, 2, 1} and sum = 42");
		
		Integer[] arr1 = {1, 2, 3, 3, 4, 5, 9, 28, 7, 5, 2, 1};
		
		subarray(arr1, 42);
	}
	
	public static void subarray(Integer[] arr, Integer sum) {
		
		Integer added = 0;
		Integer first_index = 0;
		Integer last_index = 0;
		Boolean sum_found = false;
		
		loop1: for (int i = 0; i < arr.length; i++) {
			if (arr[i] > sum) {
				continue;
			} else {
				added += arr[i];
				// System.out.println(arr[i]);
				for (int j = i + 1; j < arr.length; j++) {
					added += arr[j];
					// System.out.println(added);
					if (added.equals(sum)) {
						first_index = i;
						last_index = j;
						sum_found = true;
						break loop1;
					}
					if (added > sum) {
						added = 0;
						continue loop1;
					}
				}
				added = 0;
			}
		}
		
		if (sum_found) {
			System.out.println(String.format("sum found between index %s and %s", first_index, last_index));
			System.out.println("The elements are: ");
			for (int i = first_index; i <= last_index; i++) {
				System.out.println(arr[i]);
			}
		} else {
			System.out.println("sum not found");
		}
		
	}
	
}
