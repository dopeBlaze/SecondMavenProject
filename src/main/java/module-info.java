module com.broja.secondmavenproject {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.broja.secondmavenproject to javafx.fxml;
    exports com.broja.secondmavenproject;
}