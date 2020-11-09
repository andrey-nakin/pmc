package com.fc.pmc.api.mc.impl;

import com.fc.api.mc.Mc;
import com.fc.api.mc.bo.McParams;
import com.fc.api.mc.bo.McResult;
import javax.validation.constraints.NotNull;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andrey Nakin
 */
@Service
public class McImpl implements Mc {

    @NotNull
    public McResult build(
            @NotNull final McParams params
    ) {
        throw new UnsupportedOperationException();
    }

}
