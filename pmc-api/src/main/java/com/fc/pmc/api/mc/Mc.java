package com.fc.pmc.api.mc;

import com.fc.pmc.api.mc.bo.McParams;
import com.fc.pmc.api.security.SecurityContext;
import java.util.function.Function;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Andrey Nakin
 */
public interface Mc {

    <T> T build(
            @NotNull SecurityContext securityContext,
            @NotNull McParams params,
            @NotNull Function<McResult, T> mapper
    );

    <T> T build2(
            @NotNull SecurityContext securityContext,
            @NotNull McParams params,
            @NotNull Function<McResult, T> mapper
    );

}
