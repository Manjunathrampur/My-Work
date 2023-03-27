package pom2;


import org.testng.annotations.Test;



public class FBlog extends Generic111
{
    @Test
	public void facebook() throws InterruptedException
	{
   Pom p=new Pom(driver);
    p.username("xyz");
    Thread.sleep(1000);
    p.password("cyt");
    Thread.sleep(1000);
    p.button();
    Thread.sleep(4000);
    p.photoBTN();
    
   
    System.out.println("143");
	}
}

