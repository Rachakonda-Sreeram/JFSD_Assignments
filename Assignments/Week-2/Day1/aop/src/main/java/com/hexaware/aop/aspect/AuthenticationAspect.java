package com.hexaware.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {
	
	@Pointcut("execution(* com.hexaware.aop.service.BankService.loginCheck())")
	public void authentication() { // point-cut-1
		
	}
	
	@Pointcut("execution(* com.hexaware.aop.service.BankService.*())")
	public void authorization() { // point-cut-2
		
	}
	
	@Before("authentication() && authorization() ")
	public void authenticationAndAuthorization() {
		System.out.println("Login succesful...User Login Successful");
	}

}
