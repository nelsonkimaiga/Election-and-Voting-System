package MVoter;
//new Splash(5000);//used for calling

import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;

public class SplashScreen{

    private JLabel SplashImage;
    private JWindow window;
    private JPanel panel;
    public SplashScreen(int duration) {
        window=new JWindow();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        window.setBounds((screen.width - 490) / 2, (screen.height - 300) / 2,400, 300);

        panel=(JPanel)window.getContentPane();
        SplashImage=new JLabel(""); 
        final ImageIcon im = new ImageIcon("src/MVoter/splash.jpg");
        SplashImage.setIcon(im);
        //SplashImage = new JLabel(new ImageIcon(ClassLoader.getSystemResource("splash.jpg")));
        //SplashImage.setIcon(new javax.swing.ImageIcon("splash.jpg"));
         //SplashImage.setIcon(new javax.swing.ImageIcon(getClass().getResource(null)));
         panel.add(SplashImage, BorderLayout.CENTER);

        window.setVisible(true);
        try{
            Thread.sleep(duration);
        }catch(Exception ex){
        }//try catch closed
        window.setVisible(false);
        window.dispose();
    }//constructr closed

}//class closed

