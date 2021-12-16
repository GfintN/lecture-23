package by.it.academy.enterprise.aop;

import org.aspectj.lang.annotation.Pointcut;

public class AbstractAspect {
    @Pointcut("execution(public Long by.it.academy.enterprise.components.NumberTransform.transform(Long))")
    void transformWithOneArgument() {
    };

    @Pointcut("execution(public Long by.it.academy.enterprise.components.NumberTransform.transform(Long, boolean))")
    void transformWithTwoArguments() {
    };
}
