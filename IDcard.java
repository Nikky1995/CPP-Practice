//package p1;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.*;

public class IDcard extends Frame implements ActionListener,ItemListener
{

Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
TextField tf1,tf2,tf3;
TextArea ta;
String path="";
Choice ls1,ls2,ls3,ls4,ls5,ls6,ls7;
Button b1,b2,imageBrowse;
int i;
Toolkit k;
static Image img;
public static void main(String[] args)
{

IDcard c=new IDcard();
}
public IDcard()
{
super("IDcard");
setSize(800,800);
setVisible(true);
setLayout(null);

b1=new Button("OK");
b2=new Button("CANCEL");

l1=new Label("NAME ");
tf1=new TextField(20);

l2=new Label("ROLL NO. ");
tf2=new TextField(20);

l3=new Label("BATCH ",Label.LEFT);
ls1=new Choice();
ls1.add("BE");
ls1.add("MBA");
ls1.add("MCA");
ls1.add("M.TECH");
ls1.add("others");

//year
imageBrowse = new Button("IMAGE");

l10=new Label("YEAR OF ADMISSION");
ls3=new Choice();

for(i=1990;i<=2020;i++)
ls3.add(""+i);


l4=new Label("BRANCH ",Label.LEFT);
ls2=new Choice();
ls2.add("AUTOMOBILE");
ls2.add("CIV");
ls2.add("CSE");
ls2.add("ECE");
ls2.add("EEE");
ls2.add("MECH");

//DOB

l6=new Label("DOB :");
l7=new Label("DD");
l8=new Label("MM");
l9=new Label("YYYY");
ls4=new Choice();
for(int i=1;i<32;i++)
ls4.add(""+i);

ls5=new Choice();
ls5.add("JAN");
ls5.add("FEB");
ls5.add("MAR");
ls5.add("APR");
ls5.add("MAY");
ls5.add("JUN");
ls5.add("JUL");
ls5.add("AUG");
ls5.add("SEPT");
ls5.add("OCT");
ls5.add("NOV");
ls5.add("DEC");

ls6=new Choice();
for(i=1990;i<2010;i++)
ls6.add(""+i);

l5=new Label("ADDRESS ");
ta=new TextArea(10,20);

//l6=new Label("DOB: ");
tf3=new TextField(10);
tf1.addActionListener(this);
tf2.addActionListener(this);
tf3.addActionListener(this);

//ta.addActionListener(this);

ls1.addItemListener(this);
ls2.addItemListener(this);
ls3.addItemListener(this);
ls4.addItemListener(this);
ls5.addItemListener(this);
ls6.addItemListener(this);
//ls7.addActionListener(this);

b1.addActionListener(this);
b2.addActionListener(this);
imageBrowse.addActionListener(this);

//img=getImage(getDocumentBase(),getParameter("img"));

add(l1);
//setBounds(50,100,50,50);
add(tf1);
//tf1.setBounds(50,100,400,550);
add(l2);
//setBounds0,100,50,50);
add(tf2);
//tf2.setBounds(50,120,400,550);
add(l3);
add(ls1);
//ls1.setBounds(50,140,400,550);
add(l4);
add(ls2);
add(l5);
add(ta);
//ta.setBounds(50,160,400,550);
add(l10);
add(ls3);
add(l6);
add(l7);
add(ls4);
add(l8);
add(ls5);
add(l9);
add(ls6);

add(b1);
add(b2);

add(imageBrowse);

l1.setBounds(50,50,70,20);
tf1.setBounds(150,50,150,20);
l2.setBounds(50,80,70,20);
tf2.setBounds(150,80,150,20);
l3.setBounds(50,110,70,20);
ls1.setBounds(150,110,150,20);
l4.setBounds(50,140,70,20);
ls2.setBounds(150,140,150,20);
l5.setBounds(50,170,70,20);
ta.setBounds(150,170,150,70);

l10.setBounds(50,300,70,20);
ls3.setBounds(200,300,70,20);

l6.setBounds(25,330,50,20);
l7.setBounds(80,330,50,20);
ls4.setBounds(130,330,50,20);
l8.setBounds(185,330,50,20);
ls5.setBounds(235,330,50,20);
l9.setBounds(290,330,50,20);
ls6.setBounds(340,330,50,20);

b1.setBounds(50,380,50,20);
b2.setBounds(100,380,50,20);
imageBrowse.setBounds(200,380,50,20);
/*}



public void start()
{*/
mwa1 ob=new mwa1(this);
addWindowListener(ob);

//l1.setBounds(10,100,20,50);
}


public void actionPerformed(ActionEvent ae)
{
if (ae.getSource().equals(imageBrowse)) {
String s;
JFileChooser jfc = new JFileChooser();
jfc.showDialog(jfc, "Choose an image file");
s = jfc.getSelectedFile().getAbsolutePath();
path+=s;
repaint();
}

Frame f;
String d[]=new String[9];
//int d6,d7,d8,d9;
String str=ae.getActionCommand();

if(str.equals("OK"))
{
d[0]=tf1.getText();
d[1]=tf2.getText();
d[2]=ls1.getSelectedItem();
d[3]=ls2.getSelectedItem();
d[4]=ta.getText();
d[5]=ls3.getSelectedItem();
d[6]=ls4.getSelectedItem();
d[7]=ls5.getSelectedItem();
d[8]=ls6.getSelectedItem();

/*
try{
FileWriter os=new FileWriter("ganesh.txt");
os.write("name : "+d1+"\n");
os.write("Roll No. : "+d2+"\n");
os.write("Batch : "+d3);
os.write("Branch : "+d4);
os.write("DOB : "+d7+"-"+d8+"-"+d9+"\n");
os.write("Address : "+d5);
os.close();
}

catch(Exception e){}

*/

//Cherry c=new Cherry();
ma(d);




f=new frame("IDcard",d[0],d[1],d[2],d[3],d[4],d[5],d[6],d[7],d[8],img);
f.setSize(600,350);
f.setVisible(true);


}

else if(str.equals("CANCEL"))
{
tf1.setText(" ");
tf2.setText(" ");
ta.setText(" ");





}

}

public void itemStateChanged(ItemEvent ae)
{

}


	public void paint(Graphics g)
		{
		img = Toolkit.getDefaultToolkit().getImage(path);
    setIconImage(img);
		 /*img=k.getImage(path);*/
		 g.drawImage(img,400,120,300,250,this);
		}
		public static void ma(String args[])
{


try{
FileWriter os=new FileWriter("ganesh.pdf");
os.write("name : "+args[0]+"\n");
os.write("Roll No. : "+args[1]+"\n");
os.write("Batch : "+args[2]+"\n");
os.write("Branch : "+args[3]+"\n");
os.write("DOB : "+args[6]+"-"+args[7]+"-"+args[8]+"\n");
os.write("Address : "+args[4]+"\n");
os.write("image"+img.toString()+"\n");
os.close();

}

catch(Exception e){}


}


}





class frame extends Frame
{
String m1,m2,m3,m4,m5,m6,m7,m8,m9;Image img;
frame(String m,String d1,String d2,String d3,String d4,String d5,String d6,String d7,String d8,String d9,Image img)
{

super(m);

m1=d1;m2=d2;m3=d3;m4=d4;m5=d5;m6=d6;m7=d7;m8=d8;m9=d9;
this.img=img;
mwa ob=new mwa(this);
addWindowListener(ob);
}

public void paint(Graphics g)
{setIconImage(img);
g.drawString("Name:",20,50);
g.drawString(m1,100,50);
g.drawString("Roll No: ",20,75);
g.drawString(m2,100,75);
g.drawString("Batch :",20,100);
g.drawString(m3,100,100);
g.drawString("Branch:",20,125);
g.drawString(m4,100,125);
g.drawString("DOJ : ",20,150);
g.drawString(m6,100,150);
g.drawString("DOB : ",20,175);
g.drawString(m7+"-"+m8+"-"+m9,100,175);
g.drawString("Address : ",20,200);
g.drawString(m5,100,200);
g.drawImage(img,250,70,150,150,this);

}

}


class mwa extends WindowAdapter
{
frame ob1;
public mwa(frame ob)
{
ob1=ob;
}


public void windowClosing(WindowEvent we)
{
ob1.setVisible(false);

}

}

class mwa1 extends WindowAdapter
{
IDcard ob1;
public mwa1(IDcard ob)
{
ob1=ob;
}


public void windowClosing(WindowEvent we)
{
ob1.setVisible(false);

}

}





























