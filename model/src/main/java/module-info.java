module com.chrosciu.model {
    requires java.xml.bind;
    requires static lombok;
    exports com.chrosciu.model;
    opens com.chrosciu.model to java.xml.bind;
}