package com.ironyard;

import javax.swing.*;
import java.awt.*;

/**
 * Created by illladell on 8/9/16.
 */
public class Renderer extends JPanel {

    private static final long serialVersionUID = 11;

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        FlappyBird.flappyBird.repaint(g);
    }
}
