package miu.edu.day5springdata.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopIsAwesomeAspect {
    @Pointcut("@within(miu.edu.day5springdata.service..*)")
    public void servicePackageAnnotation(){}

    @Before("servicePackageAnnotation()")
    public Object checkAopAwesomeHeader(Joinpoint joinpoint) throws Throwable {
        System.out.println("validate");
        var result = joinpoint.proceed();
        return result;
    }
}
