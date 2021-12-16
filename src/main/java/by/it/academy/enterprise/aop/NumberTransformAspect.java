package by.it.academy.enterprise.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NumberTransformAspect extends AbstractAspect{
    private static final Logger logger = LoggerFactory.getLogger(NumberTransformAspect.class);

    @Before(value = "transformWithOneArgument()")
    public void beforeCallTransformWithOneArgument(JoinPoint jp) {
        logger.info("Executing aspect before " + jp.getSignature().toShortString());
    }

    @AfterReturning(value = "transformWithTwoArguments()", returning = "result")
    public void afterCallTransformWithThreeArgs(JoinPoint jp, Object result) {
        logger.info("Executing aspect after returning from " + jp.getSignature().toShortString());
        logger.info("Method returned result: " + result.toString());
    }
}
