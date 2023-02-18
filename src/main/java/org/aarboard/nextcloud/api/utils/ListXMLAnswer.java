package org.aarboard.nextcloud.api.utils;

import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "ocs")
public class ListXMLAnswer extends XMLAnswer
{
    @XmlElementWrapper(name = "data")
    @XmlElement(name = "element")
    private List<String> result;

    public List<String> getResult() {
        return result;
    }
}
