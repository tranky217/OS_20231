module com.example.os_monitor {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.os_monitor to javafx.fxml;
    exports com.example.os_monitor;
}