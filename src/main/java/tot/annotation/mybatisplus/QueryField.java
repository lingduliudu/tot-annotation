package tot.annotation.mybatisplus;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import tot.annotation.enums.QueryType;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface QueryField {

	String query();
	QueryType matchType() default QueryType.EQ;
	boolean To19() default false;
	
	
}
