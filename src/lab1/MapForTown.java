package lab1;

import java.awt.Dimension;
import javax.swing.JFrame;
import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.JMapViewer;

public class MapForTown {

    //static void getMapWindow() {
    public static void main(String[] args) {
    display();
    System.setProperty("http.agent", "Mozilla/5.0");
}
    public static void display() {
        JFrame f = new JFrame("Sundsvall");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMapViewer map = new JMapViewer() {

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(320, 240);
            }
        };
        Coordinate coordinateToPlace = new Coordinate(62.3907552, 17.3071024);
        map.setDisplayPosition(coordinateToPlace, 12);
        f.add(map);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}