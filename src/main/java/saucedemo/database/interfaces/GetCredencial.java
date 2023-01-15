package saucedemo.database.interfaces;


public interface GetCredencial extends MongoOps{
   //MongoOps ops = new MongoOps();
   default String getUsernameValue(int value){
      return getCollectionAutomation().get(value).get("user").toString();
   }
   default String getPasswordValue(int value){
      return getCollectionAutomation().get(value).get("password").toString();
   }

}
