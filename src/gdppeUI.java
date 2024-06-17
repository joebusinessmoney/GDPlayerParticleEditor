import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        defualtParticle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean particlesDefault = defualtParticle.isSelected();
                System.out.println(particlesDefault);
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
    private JRadioButton defualtParticle;
    private JLabel dragLabel;
    private JLabel shipLabel;
    private JLabel burstLabel;
    private JLabel landLabel;
    private JLabel swingLabel;
    private JButton setConfig;
}
