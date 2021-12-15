package lt.itmokymai.spring;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/application-context.xml"})
public class AppTest 
{
	@Autowired
	private ServiceC serviceC;
 
	
	@Autowired
	public void setServiceC(ServiceC serviceC) {
		this.serviceC = serviceC;
	}
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void serviceCproductlistNotNull() {
    	Assert.assertNotNull(serviceC.getProducts());
    }
    @Test
    public void serviceCPrintsCorrectly() {
    	Assert.assertEquals("limonadasalus", serviceC.spaudsinti());
    }
}
