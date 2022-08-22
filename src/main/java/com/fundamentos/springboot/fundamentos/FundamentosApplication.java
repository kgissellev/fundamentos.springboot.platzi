package com.fundamentos.springboot.fundamentos;

import com.fundamentos.springboot.fundamentos.bean.MyBean;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithDependencies;
import com.fundamentos.springboot.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;

	private MyBeanWithDependencies myBeanWithDependencies;

	public FundamentosApplication(@Qualifier("componentToImplement") ComponentDependency componentDependency, MyBean myBean, MyBeanWithDependencies myBeanWithDependencies) {
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependencies = myBeanWithDependencies;
	}
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependencies.printDependency();
	}


}
