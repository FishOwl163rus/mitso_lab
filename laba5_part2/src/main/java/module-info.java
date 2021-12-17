module com.example.laba5_part {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.laba5_part2 to javafx.fxml;
    exports com.example.laba5_part2;
}