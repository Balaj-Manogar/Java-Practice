package practice.generic;

public class LoopDemo
{
	public static void main(String[] args)
	{
		int x = 2;
		boolean a = true;
		switch (x)
		{
			case 10:
			{
				System.out.println("10");
			}	
	
			case 2:
				System.out.println("2");
	
			case 3:
				System.out.println("3");
			
			default:
				System.out.println("default");
		}
		
		while(a = true)
		{
			a = false;
			System.out.println("Setting a false");
			break; // if no break then indefinite loop
		}
		
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Outer loop: " + i);
			for (int j = 0; j < 10; j++)
			{
				
				if(j == 4)
				{
					continue; // not executing this loop after continue
				}
				if(j == 8)
				{
					break; // breaks inner loop
				}
				System.out.println("\tInner loop: " + j);
				
			}
		}
		
		Outer_Loop:
			for (int i = 0; i < 10; i++)
			{
				System.out.println("Labelled outer loop: " + i);
				Inner_loop:
					for (int j = 0; j < 10; j++)
					{
						System.out.println("\tLabelled inner loop: " + j);
						if(j == 4)
						{
							break Outer_Loop;
						}
					}
			}

	}
}
