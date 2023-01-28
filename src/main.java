import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;




class Main extends Thread   
{

  public static void main(String[] args) {
    Main thread =new Main();
    thread.start();


    public void run(){
    Frame fen = new Frame ("Bonjour" );
    fen.setSize(600,600);
    fen.setLayout(new FlowLayout( ));
    ///////////////////////boutton///////////////////////////////
    
    Button quitter = new Button("Quitter");
    Button open_directory_explorer = new Button("directory explorer");
    
    ////////////////////////////////////////////////////////////////
    Listener listener=new Listener();
    quitter.addActionListener(listener);
    open_directory_explorer.addActionListener(listener);
    fen.add(quitter);
    fen.add(open_directory_explorer);
    fen.show( );
   }}
}
public void run(){
    Frame fen = new Frame ("Bonjour" );
    fen.setSize(600,600);
    fen.setLayout(new FlowLayout( ));
    ///////////////////////boutton///////////////////////////////
    
    Button quitter = new Button("Quitter");
    Button open_directory_explorer = new Button("directory explorer");
    
    ////////////////////////////////////////////////////////////////
    Listener listener=new Listener();
    quitter.addActionListener(listener);
    open_directory_explorer.addActionListener(listener);
    fen.add(quitter);
    fen.add(open_directory_explorer);
    fen.show( );
   }






class Listener implements ActionListener{ 
    
    public void actionPerformed(ActionEvent evt){ 
        Object source=evt.getActionCommand();
        System.out.println(source);
        switch((String) source){
            
            case "Quitter":System.exit(0);
            case "directory explorer": {
                FileTree2.main(null);
                
            }
            
        }
    }
}

    
    


