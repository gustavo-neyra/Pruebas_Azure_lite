package utils;


import java.util.ArrayList;
import java.util.List;



public class Helpers {
    public void sleep (int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
