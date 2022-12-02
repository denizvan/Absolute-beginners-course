module nl.fesma.absolute.beginners.cours {
    requires javafx.controls;
    requires javafx.fxml;

    opens nl.fesma.absolute.beginners.course to javafx.fxml;
    exports nl.fesma.absolute.beginners.course;
}