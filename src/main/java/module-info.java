module es.liernisarraoa.gestionpersonasfiltro {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens es.liernisarraoa.gestionpersonasfiltro.Modelo to javafx.fxml;
    exports es.liernisarraoa.gestionpersonasfiltro.Modelo;
    opens es.liernisarraoa.gestionpersonasfiltro to javafx.fxml;
    exports es.liernisarraoa.gestionpersonasfiltro;
    exports es.liernisarraoa.gestionpersonasfiltro.Controladores;
    opens es.liernisarraoa.gestionpersonasfiltro.Controladores to javafx.fxml;
}