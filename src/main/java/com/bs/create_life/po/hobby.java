package com.bs.create_life.po; /***********************************************************************
 * Module:  hobby.java
 * Author:  ligang
 * Purpose: Defines the Class hobby
 ***********************************************************************/

import java.util.*;

/** 兴趣表是为了让用户能够动态更改自己所选择兴趣的数量，而因此独立出来
 * 的一个表
 * 
 * 
 * @pdOid 70caa4ee-a7c9-4697-804d-c05ecda29956 */
public class hobby {
   /** @pdOid 3e35c536-a80c-4594-a282-332bfa3a7745 */
   public int hobby_id;
   
   /** @pdRoleInfo migr=no name=user assc=Reference_2 mult=1..1 side=A */
   public user user;
   
   
   /** @pdGenerated default parent getter */
   public user getUser() {
      return user;
   }
   
   /** @pdGenerated default parent setter
     * @param newUser */
   public void setUser(user newUser) {
      if (this.user == null || !this.user.equals(newUser))
      {
         if (this.user != null)
         {
            user oldUser = this.user;
            this.user = null;
            oldUser.removeHobby(this);
         }
         if (newUser != null)
         {
            this.user = newUser;
            this.user.addHobby(this);
         }
      }
   }

}