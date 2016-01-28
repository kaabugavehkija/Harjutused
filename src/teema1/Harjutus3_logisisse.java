package teema1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Mario on 11/21/2015.
 */

/**
 * 1. Loo sisse logimise ekraan (ainult visuaal)
 * 2. Määra üks võimalik kasutaja ja parool (andmebaasi veel ei kasuta)
 * 3. Ebaõnnestunud katse näitab kasutajale errorit
 * 4. Õnnestunud katse puhul vaheta pilt uue vastu (kasvõi roheline ring), .
 */
public class Harjutus3_logisisse extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Lava seadistamine
        VBox layout = new VBox();
        layout.setSpacing(10);
        Scene scene = new Scene(layout, 600, 600);

        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setOnCloseRequest(event -> System.exit(0));

        //Visuaalid
        Label ROT = new Label("ROT");
        TextField nihe = new TextField();
        Label tekstiVali = new Label("Tekst toores");
        TextArea sisestusTekst = new TextArea();
        Label tekstiValiSif = new Label("Tekst sifreeritud");
        TextArea sisestusTekstSif = new TextArea();
        Button nupp = new Button("Sifreeri");
        Button nupp2 = new Button("Desifreeri");
        Button nupp3 = new Button("Clear");

        layout.getChildren().addAll (ROT, nihe, tekstiVali, sisestusTekst,tekstiValiSif,sisestusTekstSif, nupp, nupp2,nupp3);

        //nupu tegevus
        nupp.setOnAction(event -> {
            String sifreerimiseks = sisestusTekst.getText();
            int rot = Integer.parseInt(nihe.getText());
            sisestusTekstSif.appendText(CaesarSiffer.siffer(sifreerimiseks,rot));

        });
        nupp2.setOnAction(event -> {
            String desifreerimiseks =sisestusTekst.getText();
            int rot =Integer.parseInt(nihe.getText());
            sisestusTekstSif.appendText(CaesarSiffer.desiffer(desifreerimiseks,rot));

        });
        nupp3.setOnAction(event -> {
            sisestusTekstSif.clear();
            sisestusTekst.clear();
        });
    }
}