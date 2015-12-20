/*package beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

public static void main(String args[]){
		
		Resource resource = new ClassPathResource("spring.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
	    ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Application started Successfully");
		Test testBean = (Test) factory.getBean("test");
		Test testBean2 = (Test) factory.getBean("test");
		Test testBean3 = (Test) factory.getBean("test");
		System.out.println("Successfully loaded");
	    Test testBean = (Test) factory.getBean("test");
	    testBean.hello("Bharathsai");
	    
	}
	
}
*/