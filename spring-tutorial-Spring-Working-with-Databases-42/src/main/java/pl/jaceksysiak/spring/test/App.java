package pl.jaceksysiak.spring.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("pl/jaceksysiak/spring/test/beans/beans.xml");
 
		OffersDAO offersDao  = (OffersDAO)context.getBean("offersDao");
		
		List<Offer> offers = offersDao.getOffers();
		
		for(Offer offer : offers){
			
			System.out.println(offer);
		}
	 
		((ClassPathXmlApplicationContext)context).close();

	}
 
 

}




























