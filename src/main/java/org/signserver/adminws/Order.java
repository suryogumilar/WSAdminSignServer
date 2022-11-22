
package org.signserver.adminws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for order.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="order"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASC"/&gt;
 *     &lt;enumeration value="DESC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "order")
@XmlEnum
public enum Order {

    ASC,
    DESC;

    public String value() {
        return name();
    }

    public static Order fromValue(String v) {
        return valueOf(v);
    }

}
