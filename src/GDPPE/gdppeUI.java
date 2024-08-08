package GDPPE;

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
    int orbValue = 30;
    boolean noParticles = false;
    boolean noAllParticles = false;
    boolean squareParticles = true;
    boolean circleParticles = false;
    boolean customParticles = false;
    int changesCounter = 0;
    String fileID = "D:\\Steam\\steamapps\\common\\Geometry Dash\\Resources\\";

    public gdppeUI() {

        ButtonGroup shape = new ButtonGroup(); // radio button group
        shape.add(squareShape);
        shape.add(circleShape);
        shape.add(customShape);




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

        orbSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int orbVal = orbSlider.getValue();
                orbLabel.setText("Orb particle amount: " + String.valueOf(orbVal));
            }
        });

        squareShape.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                squareParticles = squareShape.isSelected();
                System.out.println("sqr " + squareParticles);
            }
        });

        circleShape.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                circleParticles = circleShape.isSelected();
                System.out.println("crc " + circleParticles);
            }
        });

        customShape.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                customParticles = customShape.isSelected();
                System.out.println("cust " + customParticles);
            }
        });

        noParticle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean pParticlesDisabled = noParticle.isSelected();
                System.out.println("p " + pParticlesDisabled);
            }
        });
        noAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean aParticlesDisabled = noAll.isSelected();
                System.out.println("a " + aParticlesDisabled);
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

                orbSlider.setValue(30);

                squareShape.setSelected(true);

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
                orbValue = orbSlider.getValue();
                noParticles = noParticle.isSelected();
                noAllParticles = noAll.isSelected();
                squareParticles = squareShape.isSelected();
                circleParticles = circleShape.isSelected();
                customParticles = customShape.isSelected();
                String particleShape = "square";

                if (squareParticles == true) {
                    particleShape = "square";
                } else if (circleParticles == true) {
                    particleShape = "circle";
                } else if (customParticles == true) {
                    particleShape = customInput.getText().strip();
                }


                changesCounter++;

                System.out.println(noParticles);
                System.out.println(fileID);

                if (noParticles != false) {
                    dragValue = 0;
                    shipValue = 0;
                    burstValue = 0;
                    landValue = 0;
                    swingValue = 0;
                    robotValue = 0;

                } if (noAllParticles != false) {
                    dragValue = 0;
                    shipValue = 0;
                    burstValue = 0;
                    landValue = 0;
                    swingValue = 0;
                    robotValue = 0;
                    orbValue = 0;
                }
                    Main.dragConfig(dragValue, fileID + "dragEffect.plist", particleShape);
                    Main.shipConfig(shipValue, fileID + "shipDragEffect.plist", particleShape);
                    Main.burstConfig(burstValue, fileID + "burstEffect.plist", particleShape);
                    Main.landConfig(landValue, fileID + "landEffect.plist", particleShape);
                    Main.swingConfig(swingValue, fileID + "swingBurstEffect.plist", particleShape);
                    Main.robotConfig(robotValue, fileID + "burstEffect2.plist", particleShape);
                    Main.orbConfig(orbValue, fileID + "ringEffect.plist", particleShape);


                statusMessage.setText("changes applied (" + changesCounter + ")");

            }
        });
    }
        public void setFilePath (String pathSelected) {
            fileID = pathSelected;
        }






        static void run() {
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
    private JLabel orbLabel;
    private JSlider orbSlider;
    private JRadioButton noAll;
    private JLabel ppLabel;
    private JLabel opLabel;
    private JLabel pShapeLabel;
    private JRadioButton squareShape;
    private JRadioButton circleShape;
    private JRadioButton customShape;
    private JTextArea customInput;


}
