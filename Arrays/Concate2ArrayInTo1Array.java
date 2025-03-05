package Com;

public class Concate2ArrayInTo1Array {
	public static void main(String[] args)
	{
	    int [] a= {1,2,3,4};
	    int [] b= {5,6,7,8,9};
	    int [] c=new int[a.length+b.length];
	    for(int i=0;i<=a.length-1;i++)
	    {
	    	
	    	c[i]=a[i];
	    }
	    for(int i=0;i<=b.length-1;i++)
	    {
	    	c[a.length+i]=b[i];
	    	
	    }
	    System.out.println("array-c elements are : ");
	    for(int  i=0;i<=c.length-1;i++)
	    {
	    	System.out.println(c[i]);
	    }
	    }
		
	}


