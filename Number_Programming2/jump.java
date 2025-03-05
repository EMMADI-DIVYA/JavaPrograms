class  jump
{
	public static void main(String[] args) 
	{
		int arr[]={2,3,1,1,4};
		int n=arr.length;
		for(int i=1;i<n;i+=arr[i]){
			if(i==n){
				System.out.println(true);
				return;
			}
		}
		System.out.println(false);

	}
}
