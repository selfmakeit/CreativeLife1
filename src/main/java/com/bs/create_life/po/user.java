package com.bs.create_life.po; /***********************************************************************
 * Module:  user.java
 * Author:  ligang
 * Purpose: Defines the Class user
 ***********************************************************************/

import java.util.*;

/** @pdOid c8af5eea-2e9d-4c43-8547-6b0b499387b5 */
public class user {
   /** @pdOid 89e01a89-4e90-4bc8-8a2c-b840137746e3 */
   public int user_id;
   /** @pdOid b28149b6-d90d-42f8-a422-b9ba444983fd */
   public String user_email;
   /** @pdOid dc443ad8-bdf8-401b-a9a1-69907686ef83 */
   public int is_activate;
   /** @pdOid f63a2228-e9cb-46cb-8790-31cb5f53ba2e */
   public String password;
   /** @pdOid ce4d8507-8ae9-4f8e-9a6a-6a265dcba313 */
   public String nick_name;
   /** 不允许为负数
    * 
    * @pdOid 4443ce16-4792-47de-8ae0-7379ea9b7dda */
   public int age;
   /** @pdOid d191e0a1-d242-4345-875b-b0793c58915d */
   public String head_photo;
   /** @pdOid 67a7efb7-aabd-4b13-8744-4f5edd802fe4 */
   public String area;
   /** @pdOid 28e14d20-4d4b-4ada-89ac-3b54e6042bf8 */
   public String specialty;
   /** @pdOid 5b4861b2-107b-45d8-a301-c0236ca3b8c9 */
   public String description;
   
   public Collection teammate;
   /** @pdRoleInfo migr=no name=hobby assc=Reference_2 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public Collection<hobby> hobby;
   
   
   /** @pdGenerated default getter */
   public Collection<hobby> getHobby() {
      if (hobby == null)
         hobby = new HashSet<hobby>();
      return hobby;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorHobby() {
      if (hobby == null)
         hobby = new HashSet<hobby>();
      return hobby.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newHobby */
   public void setHobby(Collection<hobby> newHobby) {
      removeAllHobby();
      for (Iterator iter = newHobby.iterator(); iter.hasNext();)
         addHobby((hobby)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newHobby */
   public void addHobby(hobby newHobby) {
      if (newHobby == null)
         return;
      if (this.hobby == null)
         this.hobby = new HashSet<hobby>();
      if (!this.hobby.contains(newHobby))
      {
         this.hobby.add(newHobby);
         newHobby.setUser(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldHobby */
   public void removeHobby(hobby oldHobby) {
      if (oldHobby == null)
         return;
      if (this.hobby != null)
         if (this.hobby.contains(oldHobby))
         {
            this.hobby.remove(oldHobby);
            oldHobby.setUser((user)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllHobby() {
      if (hobby != null)
      {
         hobby oldHobby;
         for (Iterator iter = getIteratorHobby(); iter.hasNext();)
         {
            oldHobby = (hobby)iter.next();
            iter.remove();
            oldHobby.setUser((user)null);
         }
      }
   }

}