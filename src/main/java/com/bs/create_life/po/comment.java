package com.bs.create_life.po; /***********************************************************************
 * Module:  comment.java
 * Author:  ligang
 * Purpose: Defines the Class comment
 ***********************************************************************/

import java.util.*;

//评论表

/** @pdOid 1b5a7f8a-a506-47b4-b896-7f6ed1db15d3 */
public class comment {
   /** @pdOid 4fd3f878-c07b-4960-9a19-c645874408b0 */
   public int comment_id;
   /** @pdOid 2b714794-b85a-4058-8f07-e9c3ddc03e4b */
   public int commenter_id;
   /** @pdOid 235d6624-88a8-409a-9983-4761aab77f10 */
   public String comment_content;
   /** @pdOid 19cd842d-b4e7-4873-ad34-691b8ce47c9d */
   public Date comment_time;
   
   /** @pdRoleInfo migr=no name=idea assc=Reference_5 mult=1..1 side=A */
   public idea idea;
   
   
   /** @pdGenerated default parent getter */
   public idea getIdea() {
      return idea;
   }
   
   /** @pdGenerated default parent setter
     * @param newIdea */
   public void setIdea(idea newIdea) {
      if (this.idea == null || !this.idea.equals(newIdea))
      {
         if (this.idea != null)
         {
            idea oldIdea = this.idea;
            this.idea = null;
            oldIdea.removeComment(this);
         }
         if (newIdea != null)
         {
            this.idea = newIdea;
            this.idea.addComment(this);
         }
      }
   }

}