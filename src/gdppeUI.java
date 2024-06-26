import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class gdppeUI {
    int dragValue = 30;
    int shipValue = 40;
    int burstValue = 50;
    int landValue = 10;
    int swingValue = 10;
    int robotValue = 50;
    String fileID = "D:\\Steam\\steamapps\\common\\Geometry Dash\\Resources\\";

    public gdppeUI() {



        dragSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int dragVal = dragSlider.getValue();
                dragLabel.setText("Drag particle amount: " + String.valueOf(dragVal));
            }
        });

        shipSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int shipVal = shipSlider.getValue();
                shipLabel.setText("Ship particle amount: " + String.valueOf(shipVal));
            }
        });

        landSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int landVal = landSlider.getValue();
                landLabel.setText("Land particle amount: " + String.valueOf(landVal));
            }
        });

        burstSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int burstVal = burstSlider.getValue();
                burstLabel.setText("Burst particle amount: " + String.valueOf(burstVal));
            }
        });

        robotSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int robotVal = robotSlider.getValue();
                robotLabel.setText("Robot particle amount: " + String.valueOf(robotVal));
            }
        });

        swingSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int swingVal = swingSlider.getValue();
                swingLabel.setText("Swing particle amount: " + String.valueOf(swingVal));
            }
        });

        noParticle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean particlesDisabled = noParticle.isSelected();
                System.out.println(particlesDisabled);
            }
        });

        resetDefault.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dragSlider.setValue(30);
                shipSlider.setValue(40);
                burstSlider.setValue(50);
                swingSlider.setValue(10);
                landSlider.setValue(10);
                robotSlider.setValue(50);

                statusMessage.setText("default");
            }
        });


        browseFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JFileChooser chooser = new JFileChooser(new File(System.getProperty("user.home") + ""));
               chooser.setDialogTitle("Select your Steam folder (which should contain folder named 'steamapps')");
               chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
               chooser.setAcceptAllFileFilterUsed(true);

               if (chooser.showSaveDialog(new JFileChooser()) == JFileChooser.APPROVE_OPTION)
               {
                   fileID = chooser.getSelectedFile().getPath() + "\\steamapps\\common\\Geometry Dash\\Resources\\";
                   filePath.setText(fileID);
                   System.out.println(fileID);
               }


            }


        });
        setConfig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dragValue = dragSlider.getValue();
                shipValue = shipSlider.getValue();
                burstValue = burstSlider.getValue();
                landValue = landSlider.getValue();
                swingValue = swingSlider.getValue();
                robotValue = robotSlider.getValue();

                Main.dragConfig(dragValue, fileID + "dragEffect.plist");
                Main.shipConfig(shipValue, fileID + "shipDragEffect.plist");
                Main.burstConfig(dragValue, fileID + "burstEffect.plist");
                Main.landConfig(landValue, fileID + "landEffect.plist");
                Main.swingConfig(swingValue, fileID + "swingBurstEffect.plist");
                Main.robotConfig(robotValue, fileID + "burstEffect2.plist");

                statusMessage.setText("changes applied");

            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("gdppeUI");
        frame.setContentPane(new gdppeUI().gdppeWindow);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    private JPanel gdppeWindow;
    private JLabel title;
    public JSlider dragSlider;
    private JSlider shipSlider;
    private JSlider landSlider;
    private JSlider swingSlider;
    private JSlider burstSlider;
    private JRadioButton noParticle;
    private JLabel dragLabel;
    private JLabel shipLabel;
    private JLabel burstLabel;
    private JLabel landLabel;
    private JLabel swingLabel;
    private JButton setConfig;
    private JButton resetDefault;
    private JButton browseFile;
    private JTextArea filePath;
    private JLabel statusMessage;
    private JSlider robotSlider;
    private JLabel robotLabel;
}
