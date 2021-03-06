import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		CustomerService customerService = new CustomerServiceImpl();
		CustomerService customerService = appContext.getBean("customerService", CustomerService.class);
		System.out.println(customerService.findAll().get(0).getFirstname());
	}

}
