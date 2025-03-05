package org;

public class ReverseCharacters {
	public static void main(String[] args)
	{
	String s="tjspider";
	char []charrr = s.toCharArray();
	for(int i=0;i<charrr.length-1;i++)
	{
		for(int j=0;j<charrr.length-1-i;j++)
		{
			if(charrr[j]>charrr[j+1])
			{
				char temp=charrr[j];
				charrr[j]=charrr[j+1];
				charrr[j+1]=temp;
	       }
       }
    }
	for(int k=0;k<charrr.length-1;k++)
	{
		System.out.print(charrr[k]);
		

}
}
}
