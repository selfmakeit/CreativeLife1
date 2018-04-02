package com.bs.create_life.po; /***********************************************************************
 * Module:  team.java
 * Author:  ligang
 * Purpose: Defines the Class team
 ***********************************************************************/

import java.util.*;

/** 每有一个想法被创建就有一个相应的小组表被创建
 * 
 * @pdOid 7c4006ad-aac6-4494-814d-11ad0f2bf47c */
public class team {
   /** @pdOid 941238dc-5bb7-40d3-9224-a3d56e65bdd7 */
   public int team_id;
   /** @pdOid 78544a2a-1c06-4493-811f-8992a7b38cf3 */
   public int founder_id;
   /** @pdOid ea231bbd-66ca-4b61-b6ea-e018865a5a63 */
   public int idea_id;
   /** @pdOid d43c6b43-1e18-42e1-b229-00243ae802d5 */
   public String team_name;
   /** @pdOid 61b677d0-f75a-4ef9-a010-75e8efff2e65 */
   public int teammate_number;
   /** @pdOid db8fa525-e16b-4473-a708-7e205013bad2 */
   public int max_teammaten_number = 100;
   /** @pdOid 68e65331-9f59-463b-92af-77a6c90a81d3 */
   public String notice;
   /** @pdOid 00ad638a-0f20-47bf-bae7-a4f2394d025c */
   public Date create_time;
   /** @pdOid e96479d6-4668-42d1-8daa-98905a800b35 */
   public String team_icon;
   /** @pdOid 4a142102-d439-4cb2-a956-50ec8ea4f115 */
   public String description;
   
   public Collection teammate;

}