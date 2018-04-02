package com.bs.create_life.po; /***********************************************************************
 * Module:  idea_type.java
 * Author:  ligang
 * Purpose: Defines the Class idea_type
 ***********************************************************************/

import java.util.*;

/** @pdOid 33be4935-1fc0-4d2d-832e-a22eec78ea8e */
public class idea_type {
   /** @pdOid 0bf30c93-3174-4f5b-bbf3-411ee7f3e8f7 */
   public int type_id;
   /** @pdOid ba7ad41d-30ab-433a-8dce-b2ecaf7a1865 */
   public String type_name;
   
   /** @pdRoleInfo migr=no name=idea assc=Reference_1 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public Collection<idea> idea;
   
   
   /** @pdGenerated default getter */
   public Collection<idea> getIdea() {
      if (idea == null)
         idea = new HashSet<idea>();
      return idea;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorIdea() {
      if (idea == null)
         idea = new HashSet<idea>();
      return idea.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newIdea */
   public void setIdea(Collection<idea> newIdea) {
      removeAllIdea();
      for (Iterator iter = newIdea.iterator(); iter.hasNext();)
         addIdea((idea)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newIdea */
   public void addIdea(idea newIdea) {
      if (newIdea == null)
         return;
      if (this.idea == null)
         this.idea = new HashSet<idea>();
      if (!this.idea.contains(newIdea))
      {
         this.idea.add(newIdea);
         newIdea.setIdea_type(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldIdea */
   public void removeIdea(idea oldIdea) {
      if (oldIdea == null)
         return;
      if (this.idea != null)
         if (this.idea.contains(oldIdea))
         {
            this.idea.remove(oldIdea);
            oldIdea.setIdea_type((idea_type)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllIdea() {
      if (idea != null)
      {
         idea oldIdea;
         for (Iterator iter = getIteratorIdea(); iter.hasNext();)
         {
            oldIdea = (idea)iter.next();
            iter.remove();
            oldIdea.setIdea_type((idea_type)null);
         }
      }
   }

}