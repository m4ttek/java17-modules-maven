module com.chrosciu.model {
    requires java.xml.bind;
    exports com.chrosciu.model;
    opens com.chrosciu.model to java.xml.bind;
}