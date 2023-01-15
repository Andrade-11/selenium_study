package saucedemo.database.interfaces;


public interface GetCredencial extends MongoOps {
   default String getUsernameValue(int value){
      return getCollection().get(value).get("username").toString();
   }
   default String getPasswordValue(int value){
      return getCollection().get(value).get("password").toString();
   }

}
