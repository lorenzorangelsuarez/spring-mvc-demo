package com.luv2code.springdemo.valdiation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

import org.springframework.messaging.handler.annotation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

	
	// Define default course code
	public String value() default "LUV";
	
	// Define default error message
	public String message() default "must start with LUV";
	
	// define default groups
	public Class <?> [] groups() default {};
	
	// definde default payloads
	public Class <? extends Payload>[] payload() default {};
	
}
