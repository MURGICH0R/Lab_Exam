
class program {
	
	public static void main(String[] args) {
		
				
		int number = 8;
		
		int array_length = (2 * number ) - 1;
		
		char arr_even[] = new char[array_length];
		
		char arr_odd[] = new char[array_length];
		
		int l = array_length / 2;
		
		int k = array_length / 2;
		
		for(int i = 0; i < array_length; i++) {
			
			arr_even[i] = ' ';
			
			arr_odd[i] = ' ';
		}
		
		
		for(int i = 1; i <= number; i++) {
			
			
			if( (i % 2) != 0) {
				
				arr_even[l] = '*'; 
				
				arr_even[k] = '*';
				
				System.out.println(arr_even);	
				
			}
			else{
				arr_odd[l] = '*'; 
				
				arr_odd[k] = '*';
				
				System.out.println(arr_odd);
			}
			
			l = l + 1;
			
			k = k - 1;
				
		}
		
		
		
		
	}

}