//ProductInsertClient.java
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class SelectOperation {
	public static void main(String[] args) 
	{
		//step1
		Configuration conf=new Configuration();
			conf.configure("hibernate.cfg.xml");
		//step2
		SessionFactory factory=conf.buildSessionFactory();
		//step3
		Session session=factory.openSession();
		//create pojo class object
		Product p=new Product();
		p.setProductId(575);
		Product data = (Product)session.load(Product.class, p.getProductId());
		//if we pass here p object the Product class must be serializable type
		System.out.println(data );
		
		//step7
		session.close();
         //step 8
		factory.close();
	}//end of main()
}//end of class
