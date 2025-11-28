module ru.demo.tradeapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;
    requires java.desktop;
    requires javafx.swing;
    opens ru.demo.tradeapp to javafx.fxml;
    opens ru.demo.tradeapp.models to org.hibernate.orm.core;
    exports ru.demo.tradeapp;
    exports ru.demo.tradeapp.controllers;
    opens ru.demo.tradeapp.controllers to javafx.fxml;
}