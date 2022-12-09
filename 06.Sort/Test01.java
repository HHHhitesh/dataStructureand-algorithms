import java.util.Arrays;
class Test01
{
	public static void main(String[]args)
	{
		int arr1[]={5,9,3,77,0,15,658,99,999};
		char arr2[]={'a','q','t','u','z','y','x'};
		Arrays.sort(arr1,0,5);
		System.out.print(Arrays.toString(arr1));
		System.out.print(Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.print(Arrays.toString(arr2));
	}
}