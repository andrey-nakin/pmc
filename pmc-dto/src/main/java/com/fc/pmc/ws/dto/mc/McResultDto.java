package com.fc.pmc.ws.dto.mc;

import com.fc.pmc.ws.dto.AbstractOutputDto;

/**
 *
 * @author andrey
 */
public class McResultDto extends AbstractOutputDto {

    private McParamsDto params;

    public McParamsDto getParams() {
        return params;
    }

    public void setParams(McParamsDto params) {
        this.params = params;
    }

}
