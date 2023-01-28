import java.awt.*;
import java.awt.event.*;

class ListenerQuitter implements ActionListener
{ public void actionPerformed(ActionEvent e)
  { System.exit(0); // arrêter la machine java
  }
}





class AppliWindow
{

  public static void main(String [] arg) {
     
    Frame fen = new Frame ("Bonjour" );
    fen.setSize(1920,1080);
    fen.setLayout(new FlowLayout( ));
    ///////////////////////boutton///////////////////////////////
    
    Button quitter = new Button("Quitter l'application");
    Button open_diredctory_explorer = new Button("directory_explorer");
    
    ////////////////////////////////////////////////////////////////
    quitter.addActionListener(new ListenerQuitter( ));
    fen.add(quitter);
    fen.add(open_diredctory_explorer);
    fen.show( );
   }
}