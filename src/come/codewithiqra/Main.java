package come.codewithiqra;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int [] my_array={2,4,6,8,90,64,37,29,37};

	String[] my_array2 ={"C++","Python","C#","Java","Assembly"};

        System.out.println("Original Numeric Array:" +Arrays.toString(my_array));
        Arrays.sort(my_array);
        System.out.println("Sorted Numeric Array:"+ Arrays.toString(my_array));



        System.out.println("Original String Array:" +Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted String Array:" + Arrays.toString(my_array2));


    }
}
