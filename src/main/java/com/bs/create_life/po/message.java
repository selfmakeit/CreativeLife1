package com.bs.create_life.po; /***********************************************************************
 * Module:  message.java
 * Author:  ligang
 * Purpose: Defines the Class message
 ***********************************************************************/

import java.util.*;

/** @pdOid b6ec0ab0-2ef9-4f8b-833c-ecc5e91cf1ca */
public class message {
   /** @pdOid 07a128df-bee7-417c-b2ed-dfb088b912a2 */
   public int message_id;
   /** @pdOid 10e1e682-fac8-4e8c-ba40-a2246b90b211 */
   public int receiver_id;
   /** 不允许为空，不允许负数
    * 
    * @pdOid f81eb6cd-aaa6-48f3-a0a6-85c90a5e0e4f */
   public int sender_id;
   /** @pdOid 6c6ff651-d33c-4673-818d-639d366116a3 */
   public String message_content;
   /** @pdOid c2b098fc-296c-42c4-a082-85db89b4c366 */
   public Date send_time;
   /** @pdOid 5c5cb1a8-297b-4f59-b342-e3a3882c8e21 */
   public int state_id = 0;

}