package classicprograms;

public class StringReverse {

	public static void main(String[] args) {
		String inputStr = "Srini";
		char inputCharArray[] = inputStr.toCharArray();
		for(char c: inputCharArray){
			System.out.print(c);
		}
		int left, right=inputStr.length()-1;
		for(left=0; left < right; left++, right--){
			char temp = inputCharArray[left];
			inputCharArray[left]=inputCharArray[right];
			inputCharArray[right]=temp;
		}
		System.out.println();
		for(char c: inputCharArray){
			System.out.print(c);
		}
	}

}
