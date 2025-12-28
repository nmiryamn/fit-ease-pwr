package start.spring.io.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Use Table and Columns annotations to map class and fields to database table and columns explicitly
import jakarta.persistence.Table;
import jakarta.persistence.Column;

import java.time.LocalDateTime;


@Entity  // This tells JPA that this class is a database entity. 
@Table(name = "penalty")  // Maps this entity to the "penalty" table in the database. By default, the table name would be the class name.
public class Penalty {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "penaltyid")
    private Integer penaltyId;

    @Column(name = "userid", nullable = false)
    private Integer userId;

    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(name = "datehour", nullable = false)
    private LocalDateTime datehour;

    // Constructors
    public Penalty() {
    }

    public Penalty(Integer userId, String description, LocalDateTime datehour) {
        this.userId = userId;
        this.description = description;
        this.datehour = datehour;
    }

    // Getters and setters
    public Integer getPenaltyId() {
        return penaltyId;
    }

    public void setPenaltyId(Integer penaltyId) {
        this.penaltyId = penaltyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDatehour() {
        return datehour;
    }

    public void setDatehour(LocalDateTime datehour) {
        this.datehour = datehour;
    }
}