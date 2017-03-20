package kino; /**
 * @author samm0091
 * @version 16-03-2017.
 */

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import kino.controller.CreateReservationController;
import kino.controller.ReservationMenuController;
import kino.model.Movie;

import java.io.IOException;

public class MainApp extends Application {

    private Stage primaryStage;
    private AnchorPane rootLayout;
    private ObservableList<Movie> movieList = FXCollections.observableArrayList();


    public MainApp() {
        movieList.add(new Movie("Ali G"));
        movieList.add(new Movie("Ali G in da house"));

    }

    public ObservableList<Movie> getMovieList() {
        return movieList;
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Keanu");

        initRootLayout();

        //showCreateReservationMenu();
    }

    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/view/ReservationMenu.fxml"));
            rootLayout = loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();

            // Give the kino.controller access to the main app.
            ReservationMenuController controller = loader.getController();
            controller.setMainApp(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showCreateReservationMenu() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/view/CreateReservationMenu.fxml"));
            AnchorPane createReservation = loader.load();


            Stage newStage = new Stage();
            Scene scene = new Scene(createReservation);
            newStage.setScene(scene);
            newStage.show();

            // Give the kino.controller access to the main app.
            CreateReservationController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
