package com.hexaware.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.aop.config.AppConfig;
import com.hexaware.aop.exception.InsuffFundExcep;
import com.hexaware.aop.service.BankService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InsuffFundExcep
    {
        System.out.println( "Hello World!" );
       
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BankService service = context.getBean(BankService.class);
        service.loginCheck();
        service.deposit();
        service.withdraw();
        service.fundTransfeer();
       // service.checkBalance(101);
    }
}
