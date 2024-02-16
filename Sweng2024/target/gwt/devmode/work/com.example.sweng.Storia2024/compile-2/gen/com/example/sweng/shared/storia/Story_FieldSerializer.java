package com.example.sweng.shared.storia;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Story_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getDescrizione(com.example.sweng.shared.storia.Story instance) /*-{
    return instance.@com.example.sweng.shared.storia.Story::descrizione;
  }-*/;
  
  private static native void setDescrizione(com.example.sweng.shared.storia.Story instance, java.lang.String value) 
  /*-{
    instance.@com.example.sweng.shared.storia.Story::descrizione = value;
  }-*/;
  
  private static native com.example.sweng.shared.storia.scenario.Scenario getInizio(com.example.sweng.shared.storia.Story instance) /*-{
    return instance.@com.example.sweng.shared.storia.Story::inizio;
  }-*/;
  
  private static native void setInizio(com.example.sweng.shared.storia.Story instance, com.example.sweng.shared.storia.scenario.Scenario value) 
  /*-{
    instance.@com.example.sweng.shared.storia.Story::inizio = value;
  }-*/;
  
  private static native java.util.List getInventario(com.example.sweng.shared.storia.Story instance) /*-{
    return instance.@com.example.sweng.shared.storia.Story::inventario;
  }-*/;
  
  private static native void setInventario(com.example.sweng.shared.storia.Story instance, java.util.List value) 
  /*-{
    instance.@com.example.sweng.shared.storia.Story::inventario = value;
  }-*/;
  
  private static native java.lang.String getNome(com.example.sweng.shared.storia.Story instance) /*-{
    return instance.@com.example.sweng.shared.storia.Story::nome;
  }-*/;
  
  private static native void setNome(com.example.sweng.shared.storia.Story instance, java.lang.String value) 
  /*-{
    instance.@com.example.sweng.shared.storia.Story::nome = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.example.sweng.shared.storia.Story instance) throws SerializationException {
    setDescrizione(instance, streamReader.readString());
    setInizio(instance, (com.example.sweng.shared.storia.scenario.Scenario) streamReader.readObject());
    setInventario(instance, (java.util.List) streamReader.readObject());
    setNome(instance, streamReader.readString());
    
  }
  
  public static com.example.sweng.shared.storia.Story instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.example.sweng.shared.storia.Story();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.example.sweng.shared.storia.Story instance) throws SerializationException {
    streamWriter.writeString(getDescrizione(instance));
    streamWriter.writeObject(getInizio(instance));
    streamWriter.writeObject(getInventario(instance));
    streamWriter.writeString(getNome(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.example.sweng.shared.storia.Story_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.example.sweng.shared.storia.Story_FieldSerializer.deserialize(reader, (com.example.sweng.shared.storia.Story)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.example.sweng.shared.storia.Story_FieldSerializer.serialize(writer, (com.example.sweng.shared.storia.Story)object);
  }
  
}
