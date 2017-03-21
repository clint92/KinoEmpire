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
import kino.controller.smallTheaterController;
import kino.model.Movie;

import java.io.IOException;

public class MainApp extends Application {

    private Stage primaryStage;
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

        initReservationMenu();
    }

    public void initReservationMenu() {
        try {
            // Load ReservationMenu
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/view/ReservationMenu.fxml"));
            AnchorPane reservationMenu = loader.load();

            // Show the scene
            Scene scene = new Scene(reservationMenu);
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();

            // Give the reservationMenuController access to the main app.
            ReservationMenuController controller = loader.getController();
            controller.setMainApp(this);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showCreateReservationMenu() {
        try {
            // Load createReservationMenu
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/view/CreateReservationMenu.fxml"));
            AnchorPane createReservation = loader.load();


            // new stage with new scene
            Scene scene = new Scene(createReservation);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Create Reservation");
            primaryStage.show();

            // Give the createReservationController access to the main app.
            CreateReservationController controller = loader.getController();
            controller.setMainApp(this);

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showSeatsSmallTheater() {
        try {
            // Load seatsOverview for Small theater
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/view/SeatsOverview/Seats_SmallTheater.fxml"));
            AnchorPane smallTheater = loader.load();


            // new stage with new scene
            Scene scene = new Scene(smallTheater);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Small Theater");
            primaryStage.show();

            // Give the smallTheaterController access to the main app.
            smallTheaterController controller = loader.getController();
            controller.setMainApp(this);

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
