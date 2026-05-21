package Frontend;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class AppTheme {
    //Color Palette ---
    public static final Color NAVY = new Color(0x04, 0x36, 0x76);
    public static final Color SKY       = new Color(0x5B, 0x90, 0xC3); // Dream Sky
    public static final Color BLOOM     = new Color(0xC5, 0x7C, 0xA1); // Bloom Pink
    public static final Color MAUVE     = new Color(0xDC, 0xA8, 0xC2); // Mauve Milk
    public static final Color LAVENDER  = new Color(0xC2, 0xBD, 0xDD); // Lavender
    public static final Color WHITE     = Color.WHITE;
    //Background Colors
    public static final Color SOFT_BG   = new Color(0xF4, 0xF2, 0xF8); // off-white page bg
    public static final Color TEXT_DARK = new Color(0x1A, 0x1A, 0x2E); // near-black text
    public static final Color TEXT_MID  = new Color(0x5A, 0x58, 0x72); // secondary

    //Font Styles ---
    public static final Font FONT_TITLE = new Font("Georgia", Font.BOLD, 22);
    public static final Font FONT_HEADING = new Font("Georgia", Font.BOLD, 15);
    public static final Font FONT_BODY    = new Font("Segoe UI", Font.PLAIN, 13);
    public static final Font FONT_LABEL   = new Font("Segoe UI", Font.PLAIN, 12);
    public static final Font FONT_SMALL   = new Font("Segoe UI", Font.PLAIN, 11);
    public static final Font FONT_BUTTON  = new Font("Segoe UI", Font.BOLD, 12);
    public static final Font FONT_TAB     = new Font("Segoe UI", Font.PLAIN, 12);

    //Re-Usable Components ---
    //1) Primary Button
    public static JButton primaryButton(String text)
    {
        JButton btn = new JButton(text){  //anonymous class override method
            @Override
            protected void paintComponent(Graphics g){
                Graphics2D g2 = (Graphics2D) g.create(); //create a copy to be used and disposed to avoid UI imbalance
                //Anti-aliasing for smooth rounded buttons
                g2.setRenderingHint(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON
                );
                //Button Features for current button state : pressed, hover over, normal
                //This is for the complete canvas
                //g2.setColor() dips the paintbrush in the color chosen and any component next to it gets painted in that color
                if(getModel().isPressed()){
                    g2.setColor(AppTheme.NAVY.darker()); 
                }else if(getModel().isRollover()){
                    g2.setColor(AppTheme.SKY);
                }else{
                    g2.setColor(AppTheme.NAVY);
                }
                //Now we confine it into a button by fillRoundRect : (0,0) ensures the paintbrush g2 starts exactly at the top-left corner of our button to start painting. getWidth() and getHeight() are the methods in JButton class
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);

                g2.setColor(Color.WHITE);

                //Get the font metrics to find the exact location for the button text to be centered
                FontMetrics fm = g2.getFontMetrics();
                int x = (getWidth() - fm.stringWidth(getText()))/2;
                int y = (getHeight() + fm.getAscent() - fm.getDescent())/2;

                g2.drawString(getText(), x, y);
                g2.dispose();
            }
        };
        //paintComponent is responsible for the button's complete look
        //These components ensure the method gets the required settings on calling FontMetrics
        btn.setFont(AppTheme.FONT_BUTTON);
        btn.setForeground(Color.WHITE);
        btn.setOpaque(false); //otherwise a gray boundary appears around the button
        btn.setContentAreaFilled(false); //To disallow the L&F from applying standard design over ours
        btn.setBorderPainted(false);
        btn.setFocusPainted(false); //To avoid having a dotted rectangle on a clicked button
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        //btn.setPreferredSize(new Dimension(140,34));
        return btn;
    }

    //2) Secondary Button
    public static JButton secondaryButton(String text) {

    JButton btn = new JButton(text) {
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            if (getModel().isPressed()) {
                g2.setColor(AppTheme.BLOOM.darker()); // pressed: darkens to deeper pink
            } else if (getModel().isRollover()) {
                g2.setColor(AppTheme.MAUVE);          // hover: warms up to mauve
            } else {
                g2.setColor(AppTheme.LAVENDER);       // default: soft lavender
            }

            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);

            // Text is NAVY here, not WHITE — because lavender is a light color.
            // White on lavender would be barely readable.
            g2.setColor(AppTheme.NAVY);
            FontMetrics fm = g2.getFontMetrics();
            int x = (getWidth() - fm.stringWidth(getText())) / 2;
            int y = (getHeight() + fm.getAscent() - fm.getDescent()) / 2;
            g2.drawString(getText(), x, y);
            g2.dispose();
        }
    };

    btn.setFont(AppTheme.FONT_BUTTON);
    btn.setOpaque(false);
    btn.setContentAreaFilled(false);
    btn.setBorderPainted(false);
    btn.setFocusPainted(false);
    btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    //btn.setPreferredSize(new Dimension(140, 34));
    return btn;
}

//2) Danger / Exit Button
public static JButton dangerButton(String text) {

    JButton btn = new JButton(text) {
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // This one has only two states (no separate hover vs default color),
            // just a simple darker-on-hover. Perfectly fine for a smaller button.
            g2.setColor(getModel().isRollover() ? AppTheme.BLOOM.darker() : AppTheme.BLOOM);

            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);

            // BLOOM is dark enough that white text is readable on top of it.
            g2.setColor(Color.WHITE);
            FontMetrics fm = g2.getFontMetrics();
            int x = (getWidth() - fm.stringWidth(getText())) / 2;
            int y = (getHeight() + fm.getAscent() - fm.getDescent()) / 2;
            g2.drawString(getText(), x, y);
            g2.dispose();
        }
    };

    btn.setFont(AppTheme.FONT_BUTTON);
    btn.setOpaque(false);
    btn.setContentAreaFilled(false);
    btn.setBorderPainted(false);
    btn.setFocusPainted(false);
    btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    //btn.setPreferredSize(new Dimension(140, 34));
    return btn;
}
    //For applying themes to entire JFrame
    public static void applyGlobalDefaults(){
        UIManager.put("Panel.background", AppTheme.SOFT_BG);
        UIManager.put("Label.font", AppTheme.FONT_LABEL);
        UIManager.put("Label.foreground", AppTheme.TEXT_DARK);
        UIManager.put("JOptionPane.messageFont", AppTheme.FONT_BODY);
        UIManager.put("JOptionPane.background", Color.WHITE);
        UIManager.put("ScrollPane.background", AppTheme.SOFT_BG);
        UIManager.put("TabbedPane.background", AppTheme.SOFT_BG);
        UIManager.put("TabbedPane.selected", Color.WHITE);
        UIManager.put("TabbedPane.font", AppTheme.FONT_TAB);
    }
    
}
