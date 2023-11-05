package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Flipkart;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext  ctx= new ClassPathXmlApplicationContext(
        		"com/nt/cfgs/applicationContext.xml");
    		 Flipkart fpkt1= ctx.getBean("flipkart",Flipkart.class);
    		 Flipkart fpkt2=ctx.getBean("flipkart",Flipkart.class);
    		 System.out.println(fpkt1==fpkt2);
    		 System.out.println(fpkt1.hashCode());
    		 System.out.println(fpkt2.hashCode());
    		 //hashcode is same it means one flipkart object only created in singleton
    		 //scope and that will be given anytime we call ctx.getBean() method
    		 
//    		 String result=fpkt.shopping(new String[] {"shirts","trousers"}, new double[] {500.0,238.0});
//    		System.out.println(result);
    		 ctx.close();

    }
}
