package com.example.sweng.client;

import com.example.sweng.client.services.login.LoginService;
import com.example.sweng.client.services.login.LoginServiceAsync;
import com.example.sweng.client.services.register.RegisterService;
import com.example.sweng.client.services.register.RegisterServiceAsync;

import com.google.gwt.user.client.Window;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;



public class LoginPage extends Composite{

    private HorizontalPanel hPanel;
    private LoginServiceAsync loginService = GWT.create(LoginService.class);
    private RegisterServiceAsync registerService = GWT.create(RegisterService.class);

    public LoginPage(Storia2024 app) {

        this.hPanel = new HorizontalPanel();
        this.hPanel.addStyleName("loginContainer");

        VerticalPanel vPanel1 = new VerticalPanel();
        vPanel1.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
        vPanel1.addStyleName("loginSection");

        VerticalPanel vPanel2 = new VerticalPanel();
        vPanel2.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
        vPanel2.addStyleName("loginSection");

        Image loginImg = new Image("/images/login.png");
        vPanel1.add(loginImg);


        VerticalPanel vPanel2a = new VerticalPanel();
        vPanel2a.addStyleName("loginForm");
        vPanel2a.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
        

        Label titleLabel = new Label("ENTRA IN STORIA 2024");
        titleLabel.addStyleName("loginTitle");
        vPanel2a.add(titleLabel);

        TextBox emailBox = new TextBox();
        emailBox.getElement().setPropertyString("placeholder", "Email");
        emailBox.addStyleName("loginInput");
        vPanel2a.add(emailBox);

        PasswordTextBox passwordBox = new PasswordTextBox();
        passwordBox.addStyleName("loginInput");
        passwordBox.getElement().setPropertyString("placeholder", "Password");
        vPanel2a.add(passwordBox);

        Button loginButton = new Button("Login");
        loginButton.addStyleName("loginButton");
        vPanel2a.add(loginButton);

        Button registerButton = new Button("Register");
        registerButton.addStyleName("registerButton");
        vPanel2a.add(registerButton);

        loginButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent click) {
                loginService.login(emailBox.getText(), passwordBox.getText(), new AsyncCallback<Boolean>() {
                    @Override
                    public void onFailure(Throwable arg0) {
                        Window.alert("error");
                    }

                    @Override
                    public void onSuccess(Boolean arg0) {
                        if (arg0) app.goToHomePage();
                        else Window.alert("Credenziali non valide");
                    }
                });
            }
        });

        registerButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent click) {
                registerService.register(emailBox.getText(), passwordBox.getText(), new AsyncCallback<Boolean>() {
                    @Override
                    public void onFailure(Throwable arg0) {
                        Window.alert("error");
                    }

                    @Override
                    public void onSuccess(Boolean arg0) {
                        if (arg0) app.goToHomePage();
                        else Window.alert("Account già esistente");
                    }
                });
            }
        });

        vPanel2.add(vPanel2a);


        this.hPanel.add(vPanel1);
        this.hPanel.add(vPanel2);

        initWidget(this.hPanel);
    }
}
