import java.awt.*;    
import java.awt.event.*;  
class Calculator extends WindowAdapter implements ActionListener  { 
Frame f; 
Label l1;
Button b0,b1, b2,b3,b4,b5,b6,b7,b8,b9;
Button badd,bsub,bmult,bdiv,bmod,bcalc,bclr,bpts,bneg,bback;
float ft;
float num1,num2,check;
Calculator(){  
f= new Frame(" CALCULATOR");
l1=new Label(); 
l1.setBackground(Color.WHITE);
l1.setBounds(50,50,260,60);
l1.setFont(new Font("Arial", Font.BOLD,22));

b1=new Button("1");
  b1.setBounds(50,340,50,50);
b2=new Button("2");
  b2.setBounds(120,340,50,50);
b3=new Button("3");
  b3.setBounds(190,340,50,50);
b4=new Button("4");
  b4.setBounds(50,270,50,50);
b5=new Button("5");
  b5.setBounds(120,270,50,50); 
b6=new Button("6");
  b6.setBounds(190,270,50,50);
b7=new Button("7");
  b7.setBounds(50,200,50,50);
b8=new Button("8");
  b8.setBounds(120,200,50,50);
b9=new Button("9");
  b9.setBounds(190,200,50,50);
b0=new Button("0");
  b0.setBounds(120,410,50,50);
bneg=new Button("+/-");
  bneg.setBounds(50,410,50,50);
bpts=new Button(".");
  bpts.setBounds(190,410,50,50);
bback=new Button("back");
 bback.setBounds(120,130,50,50);

badd=new Button("+");
  badd.setBounds(260,340,50,50);
bsub=new Button("-");
  bsub.setBounds(260,270,50,50);
bmult=new Button("x");
  bmult.setBounds(260,200,50,50);
bdiv=new Button("/");
  bdiv.setBounds(260,130,50,50);
bmod=new Button("%");
  bmod.setBounds(190,130,50,50);
bcalc=new Button("=");
  bcalc.setBounds(260,410,50,50);
bclr=new Button("AC"); 
  bclr.setBounds(50,130,50,50);


b1.addActionListener(this); 
b2.addActionListener(this);  
b3.addActionListener(this);  
b4.addActionListener(this);  
b5.addActionListener(this); 
b6.addActionListener(this); 
b7.addActionListener(this); 
b8.addActionListener(this); 
b9.addActionListener(this);  
b0.addActionListener(this);
b1.setBackground(Color.LIGHT_GRAY);
b2.setBackground(Color.LIGHT_GRAY);
b3.setBackground(Color.LIGHT_GRAY);
b4.setBackground(Color.LIGHT_GRAY);
b5.setBackground(Color.LIGHT_GRAY);
b6.setBackground(Color.LIGHT_GRAY);
b7.setBackground(Color.LIGHT_GRAY);
b8.setBackground(Color.LIGHT_GRAY);
b9.setBackground(Color.LIGHT_GRAY);
b0.setBackground(Color.LIGHT_GRAY);


bpts.addActionListener(this);  
bneg.addActionListener(this);
bback.addActionListener(this); 

bpts.setBackground(Color.LIGHT_GRAY);
bneg.setBackground(Color.LIGHT_GRAY);
bback.setBackground(Color.PINK);

badd.addActionListener(this);
bsub.addActionListener(this);
bmult.addActionListener(this);
bdiv.addActionListener(this);
bmod.addActionListener(this);
bcalc.addActionListener(this);
bclr.addActionListener(this);
 
badd.setBackground(Color.PINK);
bsub.setBackground(Color.PINK);
bmult.setBackground(Color.PINK);
bdiv.setBackground(Color.PINK);
bmod.setBackground(Color.PINK);
bcalc.setBackground(Color.PINK);
bclr.setBackground(Color.PINK);
b0.setFont(new Font("Arial", Font.BOLD, 18));
b1.setFont(new Font("Arial", Font.BOLD,18));
b2.setFont(new Font("Arial", Font.BOLD,18));
b3.setFont(new Font("Arial", Font.BOLD,18));
b4.setFont(new Font("Arial", Font.BOLD,18));
b5.setFont(new Font("Arial", Font.BOLD,18));
b6.setFont(new Font("Arial", Font.BOLD, 18));
b7.setFont(new Font("Arial", Font.BOLD,18));
b8.setFont(new Font("Arial", Font.BOLD,18));
b9.setFont(new Font("Arial", Font.BOLD,18));
bpts.setFont(new Font("Arial", Font.BOLD,18));
bback.setFont(new Font("Arial", Font.BOLD,15));
bneg.setFont(new Font("Arial", Font.BOLD, 18));
badd.setFont(new Font("Arial", Font.BOLD,18));
bsub.setFont(new Font("Arial", Font.BOLD,18));
bmult.setFont(new Font("Arial", Font.BOLD,18));
bdiv.setFont(new Font("Arial", Font.BOLD,18));
bmod.setFont(new Font("Arial", Font.BOLD,18));
bcalc.setFont(new Font("Arial", Font.BOLD,18));
bclr.setFont(new Font("Arial", Font.BOLD,18));

f.addWindowListener(this);
f.setBackground(Color.BLACK);
f.add(l1);  
f.add(b1); f.add(b2); f.add(b3); f.add(b4); f.add(b5);f.add(b6); f.add(b7); f.add(b8);f.add(b9);f.add(b0);

f.add(badd); f.add(bsub); f.add(bmod); f.add(bmult); f.add(bdiv); f.add(bmod);f.add(bcalc);

f.add(bclr); f.add(bpts);f.add(bneg); f.add(bback);

f.setSize(360,500);  
f.setLayout(null);  
f.setVisible(true);  
} 
                     
public void windowClosing(WindowEvent e) {
  f.dispose();
}

public void actionPerformed(ActionEvent e){ 
try{
  String s1,s2;
                     
if(e.getSource()==b1){
 s2=l1.getText();
  s1=s2+"1";
  l1.setText(s1);
}
if(e.getSource()==b2){
s2=l1.getText();
s1=s2+"2";
l1.setText(s1);
}
if(e.getSource()==b3){
  s2=l1.getText();
  s1=s2+"3";
  l1.setText(s1);
}
if(e.getSource()==b4){
  s2=l1.getText();
  s1=s2+"4";
  l1.setText(s1);
}
if(e.getSource()==b5){
  s2=l1.getText();
  s1=s2+"5";
  l1.setText(s1);
}
if(e.getSource()==b6){
  s2=l1.getText();
  s1=s2+"6";
  l1.setText(s1);
}
if(e.getSource()==b7){
  s2=l1.getText();
  s1=s2+"7";
  l1.setText(s1);
}
if(e.getSource()==b8){
  s2=l1.getText();
  s1=s2+"8";
  l1.setText(s1);
}
if(e.getSource()==b9){
  s2=l1.getText();
  s1=s2+"9";
  l1.setText(s1);
}
if(e.getSource()==b0){
  s2=l1.getText();
  s1=s2+"0";
  l1.setText(s1);
}

if(e.getSource()==bpts){  
  s2=l1.getText();
  s1=s2+".";
  l1.setText(s1);
}
if(e.getSource()==bneg){ 
  s2=l1.getText();
  s1="-"+s2;
  l1.setText(s1);
}

if(e.getSource()==bback){ 
  s2=l1.getText();
  try{
    s1=s2.substring(0, s2.length()-1);
    }catch(StringIndexOutOfBoundsException f){return;}
  l1.setText(s1);
}
             
if(e.getSource()==badd){                     
  try{
    num1=Float.parseFloat(l1.getText());
    }catch(NumberFormatException f){
      l1.setText(" ");
      return;
    }
  s1="";
  l1.setText(s1);
  check=1;
}
if(e.getSource()==bsub){                   
  try{
    num1=Float.parseFloat(l1.getText());
    }catch(NumberFormatException f){
      l1.setText(" ");
      return;
    }
  s1="";
  l1.setText(s1);
  check=2;
}
if(e.getSource()==bmult){                  
  try{
    num1=Float.parseFloat(l1.getText());
    }catch(NumberFormatException f){
      l1.setText(" ");
      return;
    }
  s1="";
  l1.setText(s1);
  check=3;
}
if(e.getSource()==bdiv){                 
  try{
    num1=Float.parseFloat(l1.getText());
    }catch(NumberFormatException f){
      l1.setText(" ");
      return;
    }
  s1="";
  l1.setText(s1);
  check=4;
}
if(e.getSource()==bmod){                
  try{
    num1=Float.parseFloat(l1.getText());
    }catch(NumberFormatException f){
      l1.setText(" ");
      return;
    }
  s1="";
  l1.setText(s1);
  check=5;
}
                       
if(e.getSource()==bcalc){          
  try{
    num2=Float.parseFloat(l1.getText());
    }catch(Exception f){
      l1.setText(" ");
      return;
    }
  if(check==1)
    ft =num1+num2;
  if(check==2)
    ft =num1-num2;
  if(check==3)
    ft =num1*num2;
  if(check==4)
    ft =num1/num2; 
  if(check==5)
    ft =num1%num2;    
  l1.setText(String.valueOf(ft));
}
                       
if(e.getSource()==bclr){
  num1=0;
  num2=0;
  check=0;
  ft=0;
   s1="";
   l1.setText(s1);
   } 
}
catch(Exception er){
    System.out.print(" ");
    }

}  
 public static void main(String args[]){  
       new Calculator();  
   }
}  
