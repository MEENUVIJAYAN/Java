// A Hello World Applet
// Save file as HelloWorld.java
  
import java.applet.Applet;
import java.awt.Graphics;
  
/*
<applet code="New" width=200 height=60>
</applet>
*/
  
// HelloWorld class extends Applet
public class New extends Applet 
{
    // Overriding paint() method
    @Override
    public void paint(Graphics g) 
    {
        g.drawString("Hello World", 20, 20);
    }
      
}