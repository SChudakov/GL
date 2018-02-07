package com.sschudakov.tostring;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class AircraftToStringBuilder extends ToStringBuilder{

    public AircraftToStringBuilder(Object object) {
        super(object);
    }

    public AircraftToStringBuilder(Object object, ToStringStyle style) {
        super(object, style);
    }

    public AircraftToStringBuilder(Object object, ToStringStyle style, StringBuffer buffer) {
        super(object, style, buffer);
    }


}
