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
import kino.controller.loginController;
import kino.controller.smallTheaterController;
import kino.dao.DaoTicketSale;
import kino.model.Movie;
import kino.model.TicketSale;

import java.io.IOException;

public class MainApp extends Application {

    private Stage primaryStage;
    private ObservableList<Movie> movieList = FXCollections.observableArrayList();
    private DaoTicketSale daoTicketSale = new DaoTicketSale();


    public MainApp() {
        movieList.add(new Movie("Ali G", "Comedy"));
        movieList.add(new Movie("Ali G in da house", "Romance"));

    }

    public ObservableList<Movie> getMovieList() {
        return movieList;
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Keanu");

        //showLoginMenu();

        showReservationMenu();
    }

    public void showReservationMenu() {
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


            // new scene
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


    public void showLoginMenu() {
        try {
            // Load loginMenu overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/view/Login.fxml"));
            AnchorPane createReservation = loader.load();


            Scene scene = new Scene(createReservation);
            primaryStage.setScene(scene);
            primaryStage.show();

            // Give the loginController access to the main app.
            loginController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showSeatsSmallTheater() {
        try {
            // Load seatsOverview for Small theater
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/view/SeatsOverview/Seats_SmallTheater.fxml"));
            AnchorPane smallTheater = loader.load();


            // new Stage with new scene
            Stage seatStage = new Stage();
            Scene scene = new Scene(smallTheater);
            seatStage.setScene(scene);
            seatStage.setTitle("Small Theater");
            seatStage.show();

            // Give the smallTheaterController access to the main app.
            smallTheaterController controller = loader.getController();
            controller.setMainApp(this);

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void saveToDB(TicketSale ticketSale) {
        this.daoTicketSale.createTicketSale(ticketSale);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
