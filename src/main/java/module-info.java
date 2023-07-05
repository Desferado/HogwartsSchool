module ru.hogwarts.school {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.hogwarts.school to javafx.fxml;
    exports ru.hogwarts.school;
}