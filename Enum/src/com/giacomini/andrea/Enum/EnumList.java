package com.giacomini.andrea.Enum;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "status_GN_type")
@XmlEnum
public enum EnumList {

    A,
    R,
    D,
    F,
    H,
    L;

    public String value() {
        return name();
    }

    public static EnumList fromValue(String v) {
        return valueOf(v);
    }
}