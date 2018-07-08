package br.com.jcrud.persistence.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.MappedSuperclass;

/**
 * Created by jaels on 20/10/2016.
 */
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

	private static final long serialVersionUID = 8967302114028847081L;
	
	
	
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
  public  boolean equals(Object obj){
      if(obj instanceof AbstractEntity){
          if(obj.getClass()==this.getClass()){
              if( getId() != null && ((AbstractEntity) obj).getId().equals(getId())){
                    return  true;
              }
          }
      }

        return false;
  }

    public abstract  Long getId();

 
    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "id=" + getId() +
                '}';
    }
}
