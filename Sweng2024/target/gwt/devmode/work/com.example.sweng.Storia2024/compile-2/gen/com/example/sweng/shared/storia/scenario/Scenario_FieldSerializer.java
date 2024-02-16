package com.example.sweng.shared.storia.scenario;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Scenario_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getAzione(com.example.sweng.shared.storia.scenario.Scenario instance) /*-{
    return instance.@com.example.sweng.shared.storia.scenario.Scenario::azione;
  }-*/;
  
  private static native void setAzione(com.example.sweng.shared.storia.scenario.Scenario instance, java.lang.String value) 
  /*-{
    instance.@com.example.sweng.shared.storia.scenario.Scenario::azione = value;
  }-*/;
  
  private static native java.lang.String getDescrizione(com.example.sweng.shared.storia.scenario.Scenario instance) /*-{
    return instance.@com.example.sweng.shared.storia.scenario.Scenario::descrizione;
  }-*/;
  
  private static native void setDescrizione(com.example.sweng.shared.storia.scenario.Scenario instance, java.lang.String value) 
  /*-{
    instance.@com.example.sweng.shared.storia.scenario.Scenario::descrizione = value;
  }-*/;
  
  private static native int getId(com.example.sweng.shared.storia.scenario.Scenario instance) /*-{
    return instance.@com.example.sweng.shared.storia.scenario.Scenario::id;
  }-*/;
  
  private static native void setId(com.example.sweng.shared.storia.scenario.Scenario instance, int value) 
  /*-{
    instance.@com.example.sweng.shared.storia.scenario.Scenario::id = value;
  }-*/;
  
  private static native java.lang.String getOggetto(com.example.sweng.shared.storia.scenario.Scenario instance) /*-{
    return instance.@com.example.sweng.shared.storia.scenario.Scenario::oggetto;
  }-*/;
  
  private static native void setOggetto(com.example.sweng.shared.storia.scenario.Scenario instance, java.lang.String value) 
  /*-{
    instance.@com.example.sweng.shared.storia.scenario.Scenario::oggetto = value;
  }-*/;
  
  private static native java.util.Map getProseguimento(com.example.sweng.shared.storia.scenario.Scenario instance) /*-{
    return instance.@com.example.sweng.shared.storia.scenario.Scenario::proseguimento;
  }-*/;
  
  private static native void setProseguimento(com.example.sweng.shared.storia.scenario.Scenario instance, java.util.Map value) 
  /*-{
    instance.@com.example.sweng.shared.storia.scenario.Scenario::proseguimento = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.example.sweng.shared.storia.scenario.Scenario instance) throws SerializationException {
    setAzione(instance, streamReader.readString());
    setDescrizione(instance, streamReader.readString());
    setId(instance, streamReader.readInt());
    setOggetto(instance, streamReader.readString());
    setProseguimento(instance, (java.util.Map) streamReader.readObject());
    
  }
  
  public static com.example.sweng.shared.storia.scenario.Scenario instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.example.sweng.shared.storia.scenario.Scenario();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.example.sweng.shared.storia.scenario.Scenario instance) throws SerializationException {
    streamWriter.writeString(getAzione(instance));
    streamWriter.writeString(getDescrizione(instance));
    streamWriter.writeInt(getId(instance));
    streamWriter.writeString(getOggetto(instance));
    streamWriter.writeObject(getProseguimento(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.example.sweng.shared.storia.scenario.Scenario_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.example.sweng.shared.storia.scenario.Scenario_FieldSerializer.deserialize(reader, (com.example.sweng.shared.storia.scenario.Scenario)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.example.sweng.shared.storia.scenario.Scenario_FieldSerializer.serialize(writer, (com.example.sweng.shared.storia.scenario.Scenario)object);
  }
  
}
