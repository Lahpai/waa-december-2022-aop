package miu.edu.day5springdata.aspect;

import lombok.RequiredArgsConstructor;
import miu.edu.day5springdata.service.ActivityLogService;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@RequiredArgsConstructor
public class ExecutionTimeAspect {
    private final ActivityLogService activityLogService;

    @Pointcut("@annotation(miu.edu.day5springdata.annotation.ExecutionTime)")
    public void executionTimeAnnotation(){}

    @Around("executionTimeAnnotion()")
    public Object calculateExecutionTime(ProccedingJoinPoint proccedingJoinPoint) throws Throwable {

        var startTime = System.nanoTime();
        var result = proccedingJoinPoint.proceed();
        var endTime = System.nanoTime();
        System.out.println(proccedingJoinPoint.);
    }

}
