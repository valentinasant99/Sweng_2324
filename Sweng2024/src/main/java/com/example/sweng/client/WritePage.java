package com.example.sweng.client;
 
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.VerticalPanel;
 
public class WritePage extends Composite {
 
    VerticalPanel vPanel1 = new VerticalPanel();
 
    public WritePage(){
        HorizontalPanel titolo = new HorizontalPanel();
 
        Label testoTitolo = new Label("Scrivi la storia che desideri creare!");
        titolo.add(testoTitolo);
 
        Button sendButton = new Button("InviaScenario");
        sendButton.addStyleName("sendButton");
 
        TextArea ta1 = new TextArea();
        ta1.setCharacterWidth(18);
        ta1.setVisibleLines(5);
 
        HorizontalPanel scelta1s = new HorizontalPanel();
        CheckBox cb1 = new CheckBox("Prima Scelta");
        cb1.setValue(false);
        CheckBox cb2 = new CheckBox("Seconda Scelta");
        cb2.setValue(false);
        scelta1s.add(cb1);
        scelta1s.add(cb2);
 
       
        HorizontalPanel scenarioIntermedio = new HorizontalPanel();
 
        VerticalPanel sI1 = new VerticalPanel();
 
        TextArea txt1 = new TextArea();
        txt1.setCharacterWidth(18);
        txt1.setVisibleLines(5);
 
        HorizontalPanel si1 = new HorizontalPanel();
        CheckBox cbox1 = new CheckBox("Prima Scelta");
        cbox1.setValue(false);
        CheckBox cbox2 = new CheckBox("Seconda Scelta");
        cbox2.setValue(false);
        si1.add(cbox1);
        si1.add(cbox2);
 
        sI1.add(txt1);
        sI1.add(si1);
 
        VerticalPanel sI2 = new VerticalPanel();
 
        TextArea txt2 = new TextArea();
        txt2.setCharacterWidth(18);
        txt2.setVisibleLines(5);
 
        HorizontalPanel si2 = new HorizontalPanel();
        CheckBox cbox3 = new CheckBox("Prima Scelta");
        cbox3.setValue(false);
        CheckBox cbox4 = new CheckBox("Seconda Scelta");
        cbox4.setValue(false);
        si2.add(cbox3);
        si2.add(cbox4);
 
        sI2.add(txt2);
        sI2.add(si2);
 
        scenarioIntermedio.add(sI1);
        scenarioIntermedio.add(sI2);
 
        //Scenario Finale
 
        HorizontalPanel scenarioFinale = new HorizontalPanel();
 
        VerticalPanel sF1 = new VerticalPanel();
 
        TextArea t1 = new TextArea();
        t1.setCharacterWidth(18);
        t1.setVisibleLines(5);
 
        HorizontalPanel s1 = new HorizontalPanel();
        CheckBox c1 = new CheckBox("Prima Scelta");
        c1.setValue(false);
        CheckBox c2 = new CheckBox("Seconda Scelta");
        c2.setValue(false);
        s1.add(c1);
        s1.add(c2);
 
        sF1.add(t1);
        sF1.add(s1);
 
        VerticalPanel sF2 = new VerticalPanel();
 
        TextArea t2 = new TextArea();
        t2.setCharacterWidth(18);
        t2.setVisibleLines(5);
 
        HorizontalPanel s2 = new HorizontalPanel();
        CheckBox c3 = new CheckBox("Prima Scelta");
        c3.setValue(false);
        CheckBox c4 = new CheckBox("Seconda Scelta");
        c4.setValue(false);
        s2.add(c3);
        s2.add(c4);
 
        sF2.add(t2);
        sF2.add(s2);
 
        VerticalPanel sF3 = new VerticalPanel();
 
        TextArea t3 = new TextArea();
        t3.setCharacterWidth(18);
        t3.setVisibleLines(5);
 
        HorizontalPanel s3 = new HorizontalPanel();
        CheckBox c5 = new CheckBox("Prima Scelta");
        c5.setValue(false);
        CheckBox c6 = new CheckBox("Seconda Scelta");
        c6.setValue(false);
        s3.add(c5);
        s3.add(c6);
 
        sF3.add(t3);
        sF3.add(s3);
 
        VerticalPanel sF4 = new VerticalPanel();
 
        TextArea t4 = new TextArea();
        t4.setCharacterWidth(18);
        t4.setVisibleLines(5);
 
        HorizontalPanel s4 = new HorizontalPanel();
        CheckBox c7 = new CheckBox("Prima Scelta");
        c7.setValue(false);
        CheckBox c8 = new CheckBox("Seconda Scelta");
        c8.setValue(false);
        s4.add(c7);
        s4.add(c8);
 
        sF4.add(t4);
        sF4.add(s4);
 
        scenarioFinale.add(sF1);
        scenarioFinale.add(sF2);
        scenarioFinale.add(sF3);
        scenarioFinale.add(sF4);
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
       
       
       
       
        vPanel1.add(titolo);
        vPanel1.add(ta1);
        vPanel1.add(scelta1s);
        //vPanel1.add(sendButton);
        vPanel1.add(scenarioIntermedio);
        vPanel1.add(scenarioFinale);
       
 
 
        initWidget(vPanel1);
       
 
        /*sendButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent click) {
                        Window.alert("hai cliccato invia");}
       
        });*/
       
 
 
 
    }
   
}