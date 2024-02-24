package simplewebbrowser;

import javafx.application.Platform;
import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class SimpleWebBrowser {

 
    public static void main(String[] args) {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(620,440);
        final JFXPanel fxpanel = new JFXPanel();
        frame.add(fxpanel);
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                WebEngine engine;
                WebView WebView= new WebView();
                engine = WebView.getEngine();
                fxpanel.setScene(new Scene (WebView));
                engine.load("https://duckduckgo.com/");
                
            }
        });
         frame.setVisible(true);
                
    }
    
}
