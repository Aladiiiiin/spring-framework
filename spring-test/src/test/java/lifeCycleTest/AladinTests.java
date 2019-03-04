package lifeCycleTest;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
public class AladinTests {
	@Configuration
	static class AladinTestsConfiguration {
		@Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
		public AladinLifeCycleBean aladinLifeCycleBean() {
			return new AladinLifeCycleBean();
		}
	}


	@Test
	void testBeanLifeCycle() {
		new AladinLifeCycleBean().display();
	}
}
