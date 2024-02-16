package com.example.sweng.client;
 
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.json.client.JSONObject;
 
public class PagaPage extends Composite {
 
    private VerticalPanel vPanel = new VerticalPanel();
 
    public PagaPage() {
        Label titolo = new Label("Effettua il pagamento per poter giocare.");
        // Creazione di 5 campi di testo per inserire i valori
        TextBox amount1TextBox = new TextBox();
        TextBox amount2TextBox = new TextBox();
        TextBox amount3TextBox = new TextBox();
        TextBox amount4TextBox = new TextBox();
        TextBox amount5TextBox = new TextBox();


        // Creazione di un pulsante per inviare la richiesta POST
        Button sendButton = new Button("Invia");

        // Aggiunta di un gestore di eventi per il click del pulsante
        sendButton.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                // Creazione di un oggetto JSON con i valori dei campi di testo
                JSONObject payload = new JSONObject();
                payload.put("amount", new JSONString(amount1TextBox.getText()));
                payload.put("card_holder", new JSONString(amount2TextBox.getText()));
                payload.put("card_number", new JSONString(amount3TextBox.getText()));
                payload.put("expire_date", new JSONString(amount4TextBox.getText()));
                payload.put("cvv", new JSONString(amount5TextBox.getText()));

                // Creazione della richiesta HTTP POST
                RequestBuilder builder = new RequestBuilder(RequestBuilder.POST, "http://localhost:6789/pay");
                builder.setHeader("Content-Type", "application/json");

                try {
                    // Invio della richiesta POST con il payload JSON
                    builder.sendRequest(payload.toString(), new RequestCallback() {
                        @Override
                        public void onResponseReceived(Request request, Response response) {
                            if (response.getStatusCode() == 200) {
                                // Transazione completata con successo
                                Window.alert("Transazione completata con successo!");
                            } else {
                                // Errore durante la transazione
                                Window.alert("Errore durante la transazione. Riprova più tardi.");
                            }
                        }

                        @Override
                        public void onError(Request request, Throwable exception) {
                            // Errore durante la richiesta HTTP
                            Window.alert("Errore durante l'invio della richiesta. Riprova più tardi.");
                        }
                    });
                } catch (RequestException e) {
                    // Errore durante la creazione della richiesta HTTP
                    Window.alert("Errore durante la creazione della richiesta. Riprova più tardi.");
                }
            }
        });

        vPanel.add(titolo);
        vPanel.add(new Label("Amount:"));
        vPanel.add(amount1TextBox);
        vPanel.add(new Label("Card Holder:"));
        vPanel.add(amount2TextBox);
        vPanel.add(new Label("Card Number:"));
        vPanel.add(amount3TextBox);
        vPanel.add(new Label("Expire Date:"));
        vPanel.add(amount4TextBox);
        vPanel.add(new Label("CVV:"));
        vPanel.add(amount5TextBox);
        vPanel.add(sendButton);

        initWidget(this.vPanel);
    }
}