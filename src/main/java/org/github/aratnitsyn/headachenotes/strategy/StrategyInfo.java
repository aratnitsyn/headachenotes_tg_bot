package org.github.aratnitsyn.headachenotes.strategy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface StrategyInfo {
    String code();

    boolean defaultStrategy() default false;

    Condition[] conditions() default {};

    @interface Condition {
        String baseUrn();
    }
}
