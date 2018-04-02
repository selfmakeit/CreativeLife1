package com.bs.create_life.po; /***********************************************************************
 * Module:  idea.java
 * Author:  ligang
 * Purpose: Defines the Class idea
 ***********************************************************************/

import java.util.*;

/** 创意表
 * 
 * @pdOid 173da1ab-cfbb-4d84-a559-a9ff5ff40506 */
public class idea {
   /** @pdOid 8e07d662-17f1-4c25-8874-70594ddc374d */
   public int idea_id;
   /** @pdOid 16027b40-ae7d-4cb0-a116-22b088357b9c */
   public int founde_idr;
   /** @pdOid c3624d0f-7b59-4074-854f-8b5e4c650b58 */
   public String idea_title;
   /** @pdOid 93a38ab1-bcda-46ed-a69f-aa54fe0871d6 */
   public String icon;
   /** @pdOid abf38b18-3e94-4302-8098-5d32503caed6 */
   public String province;
   /** @pdOid d78744d1-150f-4dd8-aeec-d05ef7898915 */
   public String city;
   /** @pdOid 807d1b84-1a69-4105-bd63-1c7d188407f7 */
   public String detail;
   /** @pdOid e4f80153-e9b2-48c9-85fa-89a723b50458 */
   public Date create_time;
   /** @pdOid ed4f1291-f6c4-4a16-98d1-1cddae8ab934 */
   public int idea_state;
   /** @pdOid 55379c3d-ed6c-4d69-a01d-154b11104b15 */
   public String summry;
   /** @pdOid 35fa777b-9c76-4c73-86ec-e42e20b07818 */
   public int suport = 0;
   
   /** @pdRoleInfo migr=no name=comment assc=Reference_5 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public Collection<comment> comment;
   /** @pdRoleInfo migr=no name=idea_type assc=Reference_1 mult=0..1 side=A */
   public idea_type idea_type;
   
   
   /** @pdGenerated default getter */
   public Collection<comment> getComment() {
      if (comment == null)
         comment = new HashSet<comment>();
      return comment;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorComment() {
      if (comment == null)
         comment = new HashSet<comment>();
      return comment.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newComment */
   public void setComment(Collection<comment> newComment) {
      removeAllComment();
      for (Iterator iter = newComment.iterator(); iter.hasNext();)
         addComment((comment)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newComment */
   public void addComment(comment newComment) {
      if (newComment == null)
         return;
      if (this.comment == null)
         this.comment = new HashSet<comment>();
      if (!this.comment.contains(newComment))
      {
         this.comment.add(newComment);
         newComment.setIdea(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldComment */
   public void removeComment(comment oldComment) {
      if (oldComment == null)
         return;
      if (this.comment != null)
         if (this.comment.contains(oldComment))
         {
            this.comment.remove(oldComment);
            oldComment.setIdea((idea)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllComment() {
      if (comment != null)
      {
         comment oldComment;
         for (Iterator iter = getIteratorComment(); iter.hasNext();)
         {
            oldComment = (comment)iter.next();
            iter.remove();
            oldComment.setIdea((idea)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public idea_type getIdea_type() {
      return idea_type;
   }
   
   /** @pdGenerated default parent setter
     * @param newIdea_type */
   public void setIdea_type(idea_type newIdea_type) {
      if (this.idea_type == null || !this.idea_type.equals(newIdea_type))
      {
         if (this.idea_type != null)
         {
            idea_type oldIdea_type = this.idea_type;
            this.idea_type = null;
            oldIdea_type.removeIdea(this);
         }
         if (newIdea_type != null)
         {
            this.idea_type = newIdea_type;
            this.idea_type.addIdea(this);
         }
      }
   }

}