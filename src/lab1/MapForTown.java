package lab1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.JMapViewer;

public class MapForTown {

    static void getMapWindow(String longitude, String latitude) {
    System.out.println(longitude);
    System.out.println(latitude);
    double longitudeDo = Double.parseDouble(longitude);
    double latitudeDo = Double.parseDouble(latitude);
    display(longitudeDo, latitudeDo);
}
    private static void display(Double longitude, Double latitude) {
        String nameTest = Coordinates.getCityName(latitude, longitude);
        JFrame f = new JFrame(nameTest);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMapViewer map = new JMapViewer() {

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(320, 240);
            }
        };
        Coordinate coordinateToPlace = new Coordinate(latitude, longitude);
        map.setDisplayPosition(coordinateToPlace, 10);

        JMenuBar menuBar = new JMenuBar();
        
        JMenu menu = new JMenu("Menu");
        menuBar.add(menu);
        JMenuItem item = new JMenuItem("Close");
        item.addActionListener((ActionEvent e) -> {
            f.dispose();
        });
        menu.add(item);
        f.setJMenuBar(menuBar);
        f.add(map);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}