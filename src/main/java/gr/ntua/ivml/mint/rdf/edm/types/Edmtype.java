//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.04 at 01:49:42 PM EEST 
//


package gr.ntua.ivml.mint.rdf.edm.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Edmtype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Edmtype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="VIDEO"/>
 *     &lt;enumeration value="IMAGE"/>
 *     &lt;enumeration value="SOUND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Edmtype")
@XmlEnum
public enum Edmtype {

    TEXT,
    VIDEO,
    IMAGE,
    SOUND;

    public String value() {
        return name();
    }

    public static Edmtype fromValue(String v) {
        return valueOf(v);
    }

}
