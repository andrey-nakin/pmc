package com.fc.api.mc;

import com.fc.api.mc.bo.McParams;
import com.fc.api.mc.bo.McResult;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Andrey Nakin
 */
public interface Mc {

    @NotNull
    McResult build(
            @NotNull McParams params
    );

}
