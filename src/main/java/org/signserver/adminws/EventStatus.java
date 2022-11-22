
package org.signserver.adminws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="eventStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FAILURE"/&gt;
 *     &lt;enumeration value="SUCCESS"/&gt;
 *     &lt;enumeration value="VOID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "eventStatus")
@XmlEnum
public enum EventStatus {

    FAILURE,
    SUCCESS,
    VOID;

    public String value() {
        return name();
    }

    public static EventStatus fromValue(String v) {
        return valueOf(v);
    }

}
