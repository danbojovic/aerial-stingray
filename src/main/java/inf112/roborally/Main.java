package inf112.roborally;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import inf112.roborally.ui.Board;


public class Main {
    public static void main(String[] args) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = "RoboRally by aerial-stingray";
        cfg.width = 900;
        cfg.height = 900;

        new LwjglApplication(new Board(), cfg);
    }
}