package Checkbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JCheckBox checkBox;
    ImageIcon xIcon;
    ImageIcon checkIcon;

    MyFrame () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xIcon = new ImageIcon("face1.png");
        checkIcon = new ImageIcon("face2.png");

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        // JCheckBox checkBox = new JCheckBox("I am not a robot");
        checkBox.setText("I am not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(checkIcon);

        this.add(checkBox);
        this.add(button);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(checkBox.isSelected());
        }
    }

}
