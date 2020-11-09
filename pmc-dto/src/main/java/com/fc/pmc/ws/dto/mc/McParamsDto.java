package com.fc.pmc.ws.dto.mc;

import com.fc.pmc.ws.dto.AbstractInputDto;

/**
 *
 * @author andrey
 */
public class McParamsDto extends AbstractInputDto {

    private String timeZone;

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

}
