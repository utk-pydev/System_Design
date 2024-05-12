module com.example.book_my_show {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;


    opens com.example.book_my_show to javafx.fxml;
    exports com.example.book_my_show;
}