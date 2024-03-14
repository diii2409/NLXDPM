/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enviromentalsensordataaccquistion;

import java.text.SimpleDateFormat;
import java.util.*;

/** @pdOid d83a6c5c-7583-4ac2-8f74-3f34cdf12b39 */
public class Instrument {
   /** @pdOid 40995e6f-0bf5-4081-adbb-81d83e9975f3 */
   private int instrumentCategory;
   /** @pdOid ac719cc6-0d61-4a88-a3f1-37d43c81c144 */
   private int instrumentID;
   
   /** @pdRoleInfo migr=no name=Sensor assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=0..4 type=Aggregation */
   public java.util.Collection<Sensor> sensors;
   /** @pdRoleInfo migr=no name=TransEquipment assc=association2 mult=1..1 type=Aggregation */
   public TransEquipment transEquipment;
   
   /**
     * @return  *  @pdOid a613100a-6a78-43df-ae7c-5ec5676d85b7 */
   public String getTime() {
      Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        String timeStr = sdf.format(date);
      return timeStr;
   }
   
   /**
     * @return  *  @pdOid 7f99f8a8-490a-4be0-8beb-2f5bce48c139 */
   public String readSensor() {
      ArrayList<Float> result = new ArrayList<>();
      for(Sensor sensor : sensors) {
          result.add(sensor.getIdicator());
      }
      // Change ArrayList to JSON String and return
      return "";
   }
   
   /** @pdOid 4decb7f8-ac7d-48ff-a3e4-a91f3b33ccc5 */
   public void saveData() {
      // TODO: implement
   }
   
   /** *  @param serverID 
    * @param account 
    * @param password 
    * @param strData 
    * @param strTime
     * @return 
    * @pdOid 7faf984d-835e-467f-aa38-a1bf2ac8fde4 */
   public int sendData(String serverID, String account, String password, String strData, String strTime) {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid daa3903f-d63b-46f4-86dd-e61c0293008a */
   public void loop() {
      // TODO: implement
   }
   
   
   /**
     * @return  *  @pdGenerated default getter */
   public java.util.Collection<Sensor> getSensor() {
      if (sensors == null)
         sensors = new java.util.HashSet<>();
      return sensors;
   }
   
   /**
     * @return  *  @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSensor() {
      if (sensors == null)
         sensors = new java.util.HashSet<>();
      return sensors.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSensor */
   public void setSensor(java.util.Collection<Sensor> newSensor) {
      removeAllSensor();
      for (java.util.Iterator iter = newSensor.iterator(); iter.hasNext();)
         addSensor((Sensor)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSensor */
   public void addSensor(Sensor newSensor) {
      if (newSensor == null)
         return;
      if (this.sensors == null)
         this.sensors = new java.util.HashSet<>();
      if (!this.sensors.contains(newSensor))
         this.sensors.add(newSensor);
   }
   
   /** @pdGenerated default remove
     * @param oldSensor */
   public void removeSensor(Sensor oldSensor) {
      if (oldSensor != null) {
       } else {
          return;
       }
      if (this.sensors != null)
         if (this.sensors.contains(oldSensor))
            this.sensors.remove(oldSensor);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSensor() {
      if (sensors != null)
         sensors.clear();
   }

}
