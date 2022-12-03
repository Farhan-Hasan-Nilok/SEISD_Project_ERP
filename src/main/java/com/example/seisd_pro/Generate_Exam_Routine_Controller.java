package com.example.seisd_pro;

import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Generate_Exam_Routine_Controller {

    static Connection c1;
    static Statement s;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> Col_Course_Name;

    @FXML
    private TableColumn<?, ?> Col_Exam_Date;

    @FXML
    private TableColumn<?, ?> Col_Room;

    @FXML
    private TableColumn<?, ?> Col_Time;

    @FXML
    private TableView<ExamScheduleTableClass> ESchedule_table;

    @FXML
    private TextField End_time1;

    @FXML
    private DatePicker Exam_Offdate;

    @FXML
    private DatePicker Exam_Startdate;

    @FXML
    private TextField RoomNo;

    @FXML
    private TextField Start_time1;

    @FXML
    private TextField Start_time2;

    @FXML
    private TextField Strat_time2;

    @FXML
    private TextField Ucourse;

    @FXML
    private DatePicker Udate;

    @FXML
    private TextField UroomNo;

    @FXML
    private TextField Utime;

    @FXML
    private TableColumn<?, ?> col_offday;

    @FXML
    private Button create;

    @FXML
    private Label error;

    @FXML
    private Button gadd;

    @FXML
    private Button gupdate;

    @FXML
    private TableView<offDayListTableClass> off_table;

    @FXML
    private Button publish;

    @FXML
    void OffDayAddButton(ActionEvent event) {

    }


    @FXML
    void CreateRoutineButton(ActionEvent event) {
        LocalDate examStartDay = Exam_Startdate.getValue();
        System.out.println(examStartDay.getDayOfMonth());
        System.out.println(examStartDay.getDayOfWeek());
        System.out.println(examStartDay.getDayOfYear());
        System.out.println(examStartDay.getMonth());
        System.out.println(examStartDay.getYear());
        System.out.println(examStartDay.getMonth());

    }


    @FXML
    void IndividualUpdateRoutineButton(ActionEvent event) {

    }


    @FXML
    void RoutinePublishButton(ActionEvent event) {

    }
    @FXML
    void initialize() {
        this.c1 = jdbc.c1;
        this.s = jdbc.s;

        Col_Exam_Date.setCellValueFactory(new PropertyValueFactory<>("eDate"));
        Col_Course_Name.setCellValueFactory(new PropertyValueFactory<>("eCourseCode"));
        Col_Time.setCellValueFactory(new PropertyValueFactory<>("eTime"));
        Col_Room.setCellValueFactory(new PropertyValueFactory<>("eRoomNo"));


    }

}
