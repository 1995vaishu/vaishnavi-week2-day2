package week2.day2;

public class RemoveDuplicate {
	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] carr = text.split(" ");
		
		for(int i=0;i<carr.length;i++) 
		{
			for(int j=i+1;j<carr.length;j++)
			{
				if(carr[i].equals(carr[j]))
				{
					count =count+1;
					if(count>0)
					{	
						carr[j]=" ";
					}
				}
				
			}
			System.out.print(carr[i]+" "); 
		} 
			
	}

}
