package ejava.examples.orm.core.annotated;

import javax.persistence.*;

/**
 * This class provides an example of a entity mapped to the database using 
 * a generated primary key AUTO-matically generated by the Java Persistence 
 * provider (i.e., not using the database for key value).
 */
@Entity
@Table(name="ORMCORE_DRILL")
public class Drill  {
    @Id
    @GeneratedValue( //AUTO is the default and could be left off here
            strategy=GenerationType.AUTO) 
    private long id; //unassigned PK value must be zero
    private String make;
    
    public Drill() {}
    public Drill(long id) { this.id = id; }
    
    public long getId() { return id; }
    
    public String getMake() { return make; }
    public void setMake(String make) {
        this.make = make;
    }
    
    @Override
    public String toString() {
        return new StringBuilder()
              .append(super.toString())
              .append(", id=").append(id)
              .append(", make=").append(make)
              .toString();
    }    
}