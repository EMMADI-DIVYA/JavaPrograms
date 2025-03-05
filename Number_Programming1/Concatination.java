class Concatination
{
	public static void main(String [] args)
	{
		System.out.println('A'+10.5); // output:65+10.5=75.5
		System.out.println(true+"hello");// output:"truehello"
		//System.out.println(true+false);// output:error
		System.out.println("hello"+10+30); // output:"hello1030"
		System.out.print(10+20+"hello"); // output:"30hello"
		System.out.println(10.5+"hello"+10.5); // output:"10.5hello10.5"
		System.out.println(10.5+11.6+"hello");// output:"22.1hello"
		System.out.println("hello"+'A'); //output:"helloA"(if there is string then don't take ascii value (ascii val of A).
		System.out.println('A'+'B'+"Hello"); //output:131Hello
		System.out.println('1'+'2'); // output:99( ascii values of 1 is 49 and ascii values of 2 is 50 so,49+50=99)
	
	}
}
