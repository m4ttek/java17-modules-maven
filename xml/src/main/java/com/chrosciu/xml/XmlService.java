package com.chrosciu.xml;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import java.io.StringWriter;

public class XmlService {
    public <T> String getXmlForObject(Class<T> clazz, T object) throws Exception {
        Marshaller marshallerObj = JAXBContext.newInstance(clazz).createMarshaller();
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        StringWriter sw = new StringWriter();
        marshallerObj.marshal(object, sw);
        return sw.toString();
    }
}
