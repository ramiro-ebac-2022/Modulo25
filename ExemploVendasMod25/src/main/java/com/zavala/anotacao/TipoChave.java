package com.zavala.anotacao;

import java.lang.annotation.*;

/**
 * @author Ramiro
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
