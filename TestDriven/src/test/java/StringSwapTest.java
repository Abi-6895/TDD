import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringSwapTest {

	  StringSwap swap = new StringSwap();
	  

	@Test
	public void teststringswap() {
		 
		assertEquals("TN",swap.swap2chars("NT"));
		
	}
	
	@Test
	public void teststringswap4char() 
	{
		
		assertEquals("TNAB", swap.swaplast2chars("TNBA"));
		
	}
	
	@Test
	public void teststringswaplast2chars() {
		
    assertEquals("TNABITN", swap.swaplast2chars("TNABINT"));
    
    		
    			
	}

}
