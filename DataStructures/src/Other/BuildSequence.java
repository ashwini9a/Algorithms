package Other;

public class BuildSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		String seq = "abc";
		int len = seq.length();
		
		for(int i=0; i <len;i++)
		{
			for(int j=i;j<len;j++)
			{
				
				for(int k=i;k<=j;k++)
				{
					
					System.out.print(seq.charAt(k));
				}
				System.out.println();
			}
			//System.out.println();
		}

	}

}
