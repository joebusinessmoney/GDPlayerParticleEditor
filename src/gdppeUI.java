import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class gdppeUI {

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
            }
        });


        browseFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JFileChooser chooser = new JFileChooser(new File(System.getProperty("user.home") + ""));
               chooser.setDialogTitle("Select Location");
               chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
               chooser.setAcceptAllFileFilterUsed(true);

               if (chooser.showSaveDialog(new JFileChooser()) == JFileChooser.APPROVE_OPTION)
               {
                   String fileID = chooser.getSelectedFile().getPath();
                   filePath.setText(fileID);
               }
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
}
