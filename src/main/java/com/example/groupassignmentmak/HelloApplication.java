package com.example.groupassignmentmak;
import javafx.application.Application;
import javafx.concurrent.Worker;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class HelloApplication extends Application {


    /**************************Declaring images hBoxs Variables to be used in a code**************************/
    HBox box1 = new HBox();
    HBox box2 = new HBox();
    HBox box3 = new HBox();



    /**************************Declaring Texts Variables to be used in a code**************************/
    Text welname = new Text("Baby Day Out");
    Text supers = new Text("Super Detention");
    Text muvhango = new Text("Muvhango");
    Text scandal = new Text("Scandal");
    Text generations = new Text("Generations");
    Text RhythmCity = new Text("Rhythm City");
    Text sa = new Text("SA Got Talent 2020");
    Text sevenda = new Text("7de laan");
    Text isidingo = new Text("Isidingo Episode");
    Text usalo = new Text("Uzalo E72 S8");
    Text raya = new Text("Raya & Last Dragon");
    Text closerange = new Text("Close Range");
    Text kidking = new Text("Kid King");
    Text pandamic = new Text("Pandamic");
    Text painful = new Text("Beast-Mode-Movie");
    Text totalspies = new Text("Totally Spies!");
    Text info1 = new Text("Play All TV comedies \n" +
            "Movies With Your \n" +
            "Favourate Appliction");
    Text info2 = new Text("Play All TV comedies \n" +
            "Movies With Your \n" +
            "Favourate Appliction");
    Text info3 = new Text("Play All Action \n" +
            "And Adventure \n" +
            "Movies With Your \n" +
            "Favourate Appliction");

    Text upview1 = new Text("Netflix is a streaming service taht offers a wide \n" +
            "variety of award-winning TV shows, Movies, anime, \n" +
            "documentaries, and more on thousands movies.");

    Text upview2 = new Text("Netflix, Inc. is a American subscription streaming \n" +
            "service and production company. Launched on \n" +
            "August 29, 1997.");

    Text upview3 = new Text("Enjoy the services of this appication. Know that  \n" +
            "this application is protected from malware attacks. \n" +
            "Customer information is kept private by the company.");

    Text catagory1 = new Text("TV comedies");
    Text catagory2 = new Text("TV Dramas");
    Text catagory3 = new Text("Action & Adventure");
    Text name = new Text("Netflix");
    Text babymama = new Text("Baby Mama");
    Text jungle = new Text("Jungle Beate");
    Text bigma = new Text("Big Mama");
    Text single = new Text("Seriously Single");
    Text barwartch = new Text("Bay Watch");
    Text fatherhood = new Text("Father Hood");
    Text jumanji = new Text("Jumanji");
    Text blackcrab = new Text("Black Crab");



    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        Media buzer = new Media(getClass().getResource("/sound.mp3").toExternalForm());


        box1.setAlignment(Pos.TOP_LEFT);
        box1.setPadding(new Insets(165,0,0,545));
        box1.setSpacing(10);



        box2.setAlignment(Pos.CENTER_LEFT);
        box2.setPadding(new Insets(70,0,0,545));
        box2.setSpacing(10);



        box3.setAlignment(Pos.BOTTOM_LEFT);
        box3.setPadding(new Insets(70,0,0,545));
        box3.setSpacing(10);


        welname.setFont(Font.font("Arial",16));
        welname.setFill(Color.WHITE);

        supers.setFont(Font.font("Arial",16));
        supers.setFill(Color.WHITE);

        muvhango.setFont(Font.font("Arial",16));
        muvhango.setFill(Color.WHITE);

        scandal.setFont(Font.font("Arial",16));
        scandal.setFill(Color.WHITE);

        generations.setFont(Font.font("Arial",16));
        generations.setFill(Color.WHITE);

        RhythmCity.setFont(Font.font("Arial",16));
        RhythmCity.setFill(Color.WHITE);

        sa.setFont(Font.font("Arial",16));
        sa.setFill(Color.WHITE);

        sevenda.setFont(Font.font("Arial",16));
        sevenda.setFill(Color.WHITE);

        isidingo.setFont(Font.font("Arial",16));
        isidingo.setFill(Color.WHITE);

        usalo.setFont(Font.font("Arial",16));
        usalo.setFill(Color.WHITE);

        raya.setFont(Font.font("Arial",16));
        raya.setFill(Color.WHITE);

        closerange.setFont(Font.font("Arial",16));
        closerange.setFill(Color.WHITE);

        kidking.setFont(Font.font("Arial",16));
        kidking.setFill(Color.WHITE);

        pandamic.setFont(Font.font("Arial",16));
        pandamic.setFill(Color.WHITE);

        painful.setFont(Font.font("Arial",16));
        painful.setFill(Color.WHITE);

        totalspies.setFont(Font.font("Arial",16));
        totalspies.setFill(Color.WHITE);

        catagory1.setFont(Font.font("Arial",FontWeight.BOLD,25));
        catagory1.setFill(Color.WHITE);
        catagory1.setId("shadowmake1");

        catagory2.setFont(Font.font("Arial",FontWeight.BOLD,25));
        catagory2.setFill(Color.WHITE);
        catagory2.setId("shadowmake2");

        catagory3.setFont(Font.font("Arial",FontWeight.BOLD,25));
        catagory3.setFill(Color.WHITE);
        catagory3.setId("shadowmake3");

        info1.setFont(Font.font("Arial",16));
        info1.setFill(Color.WHITE);

        info2.setFont(Font.font("Arial",16));
        info2.setFill(Color.WHITE);

        info3.setFont(Font.font("Arial",16));
        info3.setFill(Color.WHITE);

        name.setFont(Font.font("Arial",FontWeight.BOLD,50));
        name.setFill(Color.WHITE);
        name.setId("shadowmake");

        upview1.setFont(Font.font("Arial",14));
        upview1.setFill(Color.WHITE);
        upview1.setId("shadowmake4");

        upview2.setFont(Font.font("Arial",14));
        upview2.setFill(Color.WHITE);
        upview2.setId("shadowmake5");

        upview3.setFont(Font.font("Arial",12));
        upview3.setFill(Color.WHITE);
        upview3.setId("shadowmake6");

        babymama.setFont(Font.font("Arial",16));
        babymama.setFill(Color.WHITE);

        jungle.setFont(Font.font("Arial",16));
        jungle.setFill(Color.WHITE);

        bigma.setFont(Font.font("Arial",16));
        bigma.setFill(Color.WHITE);

        single.setFont(Font.font("Arial",16));
        single.setFill(Color.WHITE);

        barwartch.setFont(Font.font("Arial",16));
        barwartch.setFill(Color.WHITE);

        fatherhood.setFont(Font.font("Arial",16));
        fatherhood.setFill(Color.WHITE);

        jumanji.setFont(Font.font("Arial",16));
        jumanji.setFill(Color.WHITE);

        blackcrab.setFont(Font.font("Arial",16));
        blackcrab.setFill(Color.WHITE);


        Text welname1 = new Text("Officicial Netflix Playlists");
        welname1.setFont(Font.font("Arial",15));
        welname1.setFill(Color.WHITE);


        Text welname2 = new Text("Netflix Soundtract Albums");
        welname2.setFont(Font.font("Arial",15));
        welname2.setFill(Color.WHITE);


        Text welname3 = new Text("Netflix Podcast");
        welname3.setFont(Font.font("Arial/Italic", FontWeight.BOLD,20));
        welname3.setFill(Color.WHITE);

        ProgressBar progressBar = new ProgressBar();



        /**************************Declaring first image Variables to be used in a code**************************/

        Image image1 = new Image("/baby.jpg");
        ImageView imageView1 = new ImageView(image1);
        imageView1.setId("image1");
        imageView1.setFitWidth(150);
        imageView1.setFitHeight(110);



        imageView1.setOnMouseClicked(Event->{


            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/pzow5wUp7hY\" frameborder=\"0\" allowfullscreen></iframe>";


            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);
            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {

                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();

        });


//        imageView1.setOnMouseClicked(Event->{
//            WebView webView = new WebView();
//            webView.getEngine().load(
//                    "http://www.youtube.com/embed/k0BWlvnBmIE"
//            );
//            webView.setPrefSize(1100,600);
//            progressBar.progressProperty().bind(webView.getEngine().getLoadWorker().progressProperty());
//            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
//                if (t1== Worker.State.SUCCEEDED){
//                    System.out.println("Working");
//                    Media media = new Media(webView+"");
//                    MediaPlayer mediaPlayer= new MediaPlayer(media);
//                    MediaView view = new MediaView(mediaPlayer);
//                    pane.getChildren().add(webView);
//                    pane.setCenter(webView);
//                }
//                else {
//                    System.out.println("Not working connect to the properly");
//                }
//            });
//
//            Stage stage = new Stage();
//            primaryStage.setTitle("Netflix");
//            stage.setScene( new Scene(webView));
//            stage.show();
//
//        });

        /**************************Declaring second image Variables to be used in a code**************************/


        Image image2 = new Image("/babymama.jpg");
        ImageView imageView2 = new ImageView(image2);
        imageView2.setId("image2");
        imageView2.setFitWidth(150);
        imageView2.setFitHeight(110);


        /**************************Creating clickable second image in a code**************************/


        imageView2.setOnMouseClicked(Event->{

            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/D7a50sBaMxs\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();

        });



        /**************************Declaring third image Variables to be used in a code**************************/


        Image image3 = new Image("/jungle.jpeg");
        ImageView imageView3 = new ImageView(image3);
        imageView3.setId("image3");
        imageView3.setFitWidth(150);
        imageView3.setFitHeight(110);


        /**************************Creating clickable second image in a code**************************/

        imageView3.setOnMouseClicked(Event->{
            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/b588Pp9NekA\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();
        });

        /**************************Declaring 4th image Variables to be used in a code**************************/


        Image image4 = new Image("/big.jpg");
        ImageView imageView4 = new ImageView(image4);
        imageView4.setId("image4");
        imageView4.setFitWidth(150);
        imageView4.setFitHeight(110);


        /**************************Creating clickable 4th image in a code**************************/

        imageView4.setOnMouseClicked(Event->{

            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/3B03W3bCay4\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();

        });


        /**************************Declaring 5th image Variables to be used in a code**************************/


        Image image5 = new Image("/single.png");
        ImageView imageView5 = new ImageView(image5);
        imageView5.setId("image5");
        imageView5.setFitWidth(150);
        imageView5.setFitHeight(110);


        /**************************Creating clickable 5th image in a code**************************/

        imageView5.setOnMouseClicked(Event->{
            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/UOJxtmDEjZo\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();
        });


        /**************************Declaring third image Variables to be used in a code**************************/


        Image image6 = new Image("/maxresdefault.jpg");
        ImageView imageView6 = new ImageView(image6);
        imageView6.setId("image6");
        imageView6.setFitWidth(150);
        imageView6.setFitHeight(110);


        /**************************Creating clickable second image in a code**************************/

        imageView6.setOnMouseClicked(Event->{
            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/X1ZGBye0cz0\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();
        });

        /**************************Declaring 7th image Variables to be used in a code**************************/


        Image image7 = new Image("/fatherhood.jpg");
        ImageView imageView7 = new ImageView(image7);
        imageView7.setId("image7");
        imageView7.setFitWidth(150);
        imageView7.setFitHeight(110);


        /**************************Creating clickable 7th image in a code**************************/

        imageView7.setOnMouseClicked(Event->{
            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/IYNd6JLx6cU\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();
        });



        /**************************Declaring 8th image Variables to be used in a code**************************/


        Image image8 = new Image("/jumanji.jpg");
        ImageView imageView8 = new ImageView(image8);
        imageView8.setId("image8");
        imageView8.setFitWidth(150);
        imageView8.setFitHeight(110);


        /**************************Creating clickable 8th image in a code**************************/

        imageView8.setOnMouseClicked(Event->{
            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/Gmh5PysC7J0\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();
        });


        /**************************Declaring 9th image Variables to be used in a code**************************/


        Image image9 = new Image("/mova.jpg");
        ImageView imageView9 = new ImageView(image9);
        imageView9.setId("image9");
        imageView9.setFitWidth(150);
        imageView9.setFitHeight(110);


        /**************************Creating clickable 9th image in a code**************************/

        imageView9.setOnMouseClicked(Event->{
            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/cAuJTlb0uHc\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();
        });

        /**************************Declaring 10th image Variables to be used in a code**************************/


        Image image10 = new Image("/scan.jpg");
        ImageView imageView10 = new ImageView(image10);
        imageView10.setId("image10");
        imageView10.setFitWidth(150);
        imageView10.setFitHeight(110);


        /**************************Creating clickable 10th image in a code**************************/

        imageView10.setOnMouseClicked(Event->{
            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/cm1CCRA3xTo\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();
        });

        /**************************Declaring 11th image Variables to be used in a code**************************/


        Image image11 = new Image("/generations.jpg");
        ImageView imageView11 = new ImageView(image11);
        imageView11.setId("image11");
        imageView11.setFitWidth(150);
        imageView11.setFitHeight(110);


        /**************************Creating clickable 11th image in a code**************************/

        imageView11.setOnMouseClicked(Event->{
            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/b7VzEcI8LrA\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();
        });

        /**************************Declaring 12th image Variables to be used in a code**************************/


        Image image12 = new Image("/ry.jpg");
        ImageView imageView12 = new ImageView(image12);
        imageView12.setId("image12");
        imageView12.setFitWidth(150);
        imageView12.setFitHeight(110);


        /**************************Creating clickable 12th image in a code**************************/

        imageView12.setOnMouseClicked(Event->{

            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/OaKtqMUAgyo\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();
        });

        /**************************Declaring 13th image Variables to be used in a code**************************/


        Image image13 = new Image("/SA.jpg");
        ImageView imageView13 = new ImageView(image13);
        imageView13.setId("image13");
        imageView13.setFitWidth(150);
        imageView13.setFitHeight(110);


        /**************************Creating clickable 13th image in a code**************************/

        imageView13.setOnMouseClicked(Event->{
            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/leZFo4OlNOg\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();
        });


        /**************************Declaring 14th image Variables to be used in a code**************************/


        Image image14 = new Image("/seven.jpg");
        ImageView imageView14 = new ImageView(image14);
        imageView14.setId("image14");
        imageView14.setFitWidth(150);
        imageView14.setFitHeight(110);


        /**************************Creating clickable 14th image in a code**************************/

        imageView14.setOnMouseClicked(Event->{

            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/hOc8jdOG77I\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();
        });


        /**************************Declaring 15th image Variables to be used in a code**************************/


        Image image15 = new Image("/in.jpg");
        ImageView imageView15 = new ImageView(image15);
        imageView15.setId("image15");
        imageView15.setFitWidth(150);
        imageView15.setFitHeight(110);


        /**************************Creating clickable 15th image in a code**************************/

        imageView15.setOnMouseClicked(Event->{

            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/ZWHpuu-KGjE\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();
        });



        /**************************Declaring 16th image Variables to be used in a code**************************/


        Image image16 = new Image("/usalo.jpg");
        ImageView imageView16 = new ImageView(image16);
        imageView16.setId("image16");
        imageView16.setFitWidth(150);
        imageView16.setFitHeight(110);


        /**************************Creating clickable 16th image in a code**************************/

        imageView16.setOnMouseClicked(Event->{

            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/JtSVHYOMND4\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();
        });


        /**************************Declaring 17th image Variables to be used in a code**************************/


        Image image17 = new Image("/test.png");
        ImageView imageView17 = new ImageView(image17);
        imageView17.setId("image17");
        imageView17.setFitWidth(150);
        imageView17.setFitHeight(110);


        /**************************Creating clickable 17th image in a code**************************/

        imageView17.setOnMouseClicked(Event->{
            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/m4Zevk9Fqhc\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();
        });


        /**************************Declaring 18th image Variables to be used in a code**************************/


        Image image18 = new Image("/super.jpg");
        ImageView imageView18 = new ImageView(image18);
        imageView18.setId("image18");
        imageView18.setFitWidth(150);
        imageView18.setFitHeight(110);


        /**************************Creating clickable 18th image in a code**************************/

        imageView18.setOnMouseClicked(Event->{

            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/m4Zevk9Fqhc\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();
        });


        /**************************Declaring 19th image Variables to be used in a code**************************/


        Image image19 = new Image("/spacy2.jpg");
        ImageView imageView19 = new ImageView(image19);
        imageView19.setId("image19");
        imageView19.setFitWidth(150);
        imageView19.setFitHeight(110);


        /**************************Creating clickable 19th image in a code**************************/

        imageView19.setOnMouseClicked(Event->{
            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/1fqdB0ZcNvc\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();
        });


        /**************************Declaring 20th image Variables to be used in a code**************************/


        Image image20 = new Image("/beast-mode-movie.jpg");
        ImageView imageView20 = new ImageView(image20);
        imageView20.setId("image20");
        imageView20.setFitWidth(150);
        imageView20.setFitHeight(110);


        /**************************Creating clickable 20th image in a code**************************/

        imageView20.setOnMouseClicked(Event->{
            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/XYrpHfJyr44\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();
        });

        /**************************Declaring 21st image Variables to be used in a code**************************/


        Image image21 = new Image("/pandemic.jpg");
        ImageView imageView21 = new ImageView(image21);
        imageView21.setId("image21");
        imageView21.setFitWidth(150);
        imageView21.setFitHeight(110);


        /**************************Creating clickable 21th image in a code**************************/

        imageView21.setOnMouseClicked(Event->{
            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/9yHG1kk9XgE\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();
        });


        /**************************Declaring 22th image Variables to be used in a code**************************/


        Image image22 = new Image("/kids.jpg");
        ImageView imageView22 = new ImageView(image22);
        imageView22.setId("image22");
        imageView22.setFitWidth(150);
        imageView22.setFitHeight(110);


        /**************************Creating clickable 22nd image in a code**************************/

        imageView22.setOnMouseClicked(Event->{
            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/ceHDML7BD-I\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();
        });

        /**************************Declaring 23 thrd image Variables to be used in a code**************************/


        Image image23 = new Image("/closerange.jpg");
        ImageView imageView23 = new ImageView(image23);
        imageView23.setId("image23");
        imageView23.setFitWidth(150);
        imageView23.setFitHeight(110);


        /**************************Creating clickable 23thrd image in a code**************************/

        imageView23.setOnMouseClicked(Event->{
            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/rF7k75JCLZQ\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();
        });


        /**************************Declaring 24 th image Variables to be used in a code**************************/


        Image image24 = new Image("/Raya.png");
        ImageView imageView24 = new ImageView(image24);
        imageView24.setId("image24");
        imageView24.setFitWidth(150);
        imageView24.setFitHeight(110);


        /**************************Creating clickable 24th image in a code**************************/

        imageView24.setOnMouseClicked(Event->{
            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/fdrAZZKGmMs\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();
        });


        /**************************Declaring 25 th image Variables to be used in a code**************************/


        Image image25 = new Image("/BlackCrab.jpg");
        ImageView imageView25 = new ImageView(image25);
        imageView25.setId("image25");
        imageView25.setFitWidth(150);
        imageView25.setFitHeight(110);


        /**************************Creating clickable 25 th image in a code**************************/

        imageView25.setOnMouseClicked(Event->{
            String content_Url = "<iframe width=\"1100\" height=\"600\" src=\"http://www.youtube.com/embed/fmjKsL_-rfw\" frameborder=\"0\" allowfullscreen></iframe>";

            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.loadContent(content_Url);

            webView.setPrefSize(1100,600);

            webView.getEngine().getLoadWorker().stateProperty().addListener((observableValue, state, t1) -> {
                if (t1== Worker.State.SUCCEEDED){
                    System.out.println("Working");


                }
                else {
                    System.out.println("Not working connect to the properly");
                }
            });
            Stage stage = new Stage();
            stage.setTitle("Netflix");
            stage.setScene( new Scene(webView));
            stage.show();
//            WebView webView = new WebView();
//            webView.getEngine().load(url);
//            webView.setPrefSize(1100,600);
//            Stage stage = new Stage();
//            primaryStage.setTitle("Netflix");
//            stage.setScene( new Scene(webView));
//            stage.show();
        });



        /****************************************Getting hbox values*********************************************/

        box1.getChildren().addAll(imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8);
        box2.getChildren().addAll(imageView9,imageView10,imageView11,imageView12,imageView13,imageView14,imageView15,imageView16);
        box3.getChildren().addAll(imageView18,imageView19,imageView20,imageView21,imageView22,imageView23,imageView24,imageView25);






        /****************************************Getting Image for background*********************************************/



        /****************************************Getting a scene values*********************************************/


        root.getChildren().add(name);
        name.setX(180);
        name.setY(62);
        name.toFront();

        root.getChildren().add(babymama);
        babymama.setX(735);
        babymama.setY(135);
        babymama.toFront();

        root.getChildren().add(jungle);
        jungle.setX(890);
        jungle.setY(135);
        jungle.toFront();

        root.getChildren().add(bigma);
        bigma.setX(1050);
        bigma.setY(135);
        bigma.toFront();


        root.getChildren().add(single);
        single.setX(1190);
        single.setY(135);
        single.toFront();

        root.getChildren().add(barwartch);
        barwartch.setX(1380);
        barwartch.setY(135);
        barwartch.toFront();

        root.getChildren().add(fatherhood);
        fatherhood.setX(1515);
        fatherhood.setY(135);
        fatherhood.toFront();

        root.getChildren().add(jumanji);
        jumanji.setX(1695);
        jumanji.setY(135);
        jumanji.toFront();

        root.getChildren().add(upview1);
        upview1.setX(645);
        upview1.setY(35);
        upview1.toFront();

        root.getChildren().add(upview2);
        upview2.setX(1105);
        upview2.setY(35);
        upview2.toFront();

        root.getChildren().add(upview3);
        upview3.setX(1525);
        upview3.setY(35);
        upview3.toFront();

        root.getChildren().add(catagory1);
        catagory1.setX(100);
        catagory1.setY(130);
        catagory1.toFront();

        root.getChildren().add(catagory2);
        catagory2.setX(100);
        catagory2.setY(315);
        catagory2.toFront();

        root.getChildren().add(catagory3);
        catagory3.setX(100);
        catagory3.setY(500);
        catagory3.toFront();

        root.getChildren().add(info1);
        info1.setX(140);
        info1.setY(205);
        info1.toFront();

        root.getChildren().add(info2);
        info2.setX(140);
        info2.setY(390);
        info2.toFront();

        root.getChildren().add(info3);
        info3.setX(140);
        info3.setY(550);
        info3.toFront();

        root.getChildren().add(welname);
        welname.setX(565);
        welname.setY(135);
        welname.toFront();





        root.getChildren().add(supers);
        supers.setX(565);
        supers.setY(500);
        supers.toFront();


        root.getChildren().add(muvhango);
        muvhango.setX(565);
        muvhango.setY(315);
        muvhango.toFront();

        root.getChildren().add(scandal);
        scandal.setX(730);
        scandal.setY(315);
        scandal.toFront();

        root.getChildren().add(generations);
        generations.setX(890);
        generations.setY(315);
        generations.toFront();


        root.getChildren().add(RhythmCity);
        RhythmCity.setX(1050);
        RhythmCity.setY(315);
        RhythmCity.toFront();

        root.getChildren().add(sa);
        sa.setX(1190);
        sa.setY(315);
        sa.toFront();

        root.getChildren().add(sevenda);
        sevenda.setX(1380);
        sevenda.setY(315);
        sevenda.toFront();

        root.getChildren().add(isidingo);
        isidingo.setX(1515);
        isidingo.setY(315);
        isidingo.toFront();


        root.getChildren().add(usalo);
        usalo.setX(1695);
        usalo.setY(315);
        usalo.toFront();


        root.getChildren().add(totalspies);
        totalspies.setX(730);
        totalspies.setY(500);
        totalspies.toFront();

        root.getChildren().add(painful);
        painful.setX(875);
        painful.setY(500);
        painful.toFront();

        root.getChildren().add(pandamic);
        pandamic.setX(1060);
        pandamic.setY(500);
        pandamic.toFront();

        root.getChildren().add(kidking);
        kidking.setX(1225);
        kidking.setY(500);
        kidking.toFront();

        root.getChildren().add(closerange);
        closerange.setX(1380);
        closerange.setY(500);
        closerange.toFront();

        root.getChildren().add(raya);
        raya.setX(1508);
        raya.setY(500);
        raya.toFront();

        root.getChildren().add(blackcrab);
        blackcrab.setX(1695);
        blackcrab.setY(500);
        blackcrab.toFront();



        root.setTop(box1);
        root.setCenter(box2);
        root.setBottom(box3);


        /****************************************Getting a scroll view values*********************************************/

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent( new BorderPane(root));
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        scrollPane.setStyle("-fx-background-image:url('/AssignmentGroupMakhanya1.png');");



        /****************************************Getting a scene*********************************************/

        Scene scene = new Scene(scrollPane, 1360,695);

        String style = getClass().getResource("/group.css").toExternalForm();

        root.setStyle("-fx-background-image:url('/AssignmentGroupMakhanya1.png')");
        scene.setCursor(Cursor.OPEN_HAND);
        scene.getStylesheets().add(style);
        primaryStage.setTitle("Netflix");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String args[]){
        launch(args);
    }

}